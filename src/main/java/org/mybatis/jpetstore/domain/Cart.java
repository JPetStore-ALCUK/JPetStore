/*
 *    Copyright 2010-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.jpetstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * The Class Cart.
 *
 * @author Eduardo Macarron
 */
public class Cart implements Serializable {

  private static final long serialVersionUID = 8329559983943337176L;

  private final Map<String, CartItem> itemMap = Collections.synchronizedMap(new HashMap<>());
  private final List<CartItem> itemList = new ArrayList<>();
  private final List<CartAdoptItem> adoptItemList = new ArrayList<>();//입양 동물 리스트

  public Iterator<CartItem> getCartItems() {
    return itemList.iterator();
  }

  public List<CartItem> getCartItemList() {
    return itemList;
  }

  public int getNumberOfItems() {
    return itemList.size();
  }

  public Iterator<CartItem> getAllCartItems() {
    return itemList.iterator();
  }

  public boolean containsItemId(String itemId) {
    return itemMap.containsKey(itemId);
  }

  //입양 동물 리스트 가져오기
  public Iterator<CartAdoptItem> getAllCartAdoptItems(){return adoptItemList.iterator();}

  public List<CartAdoptItem> getAdoptItemList(){return adoptItemList;}

  public int getNumberOfAdoptItems(){return adoptItemList.size();}

  public boolean containsAdoptItem(String adoptItemId){
    boolean check = false;
    for(CartAdoptItem adoptCartItem:adoptItemList){
      if(adoptCartItem.getAdopt().getItemId()==adoptItemId) {check=true;break;}
    }
    return check;
  }

  /**
   * Adds the item.
   *
   * @param item
   *          the item
   * @param isInStock
   *          the is in stock
   */
  public void addItem(Item item, boolean isInStock) {
    CartItem cartItem = itemMap.get(item.getItemId());
    if (cartItem == null) {
      cartItem = new CartItem();
      cartItem.setItem(item);
      cartItem.setQuantity(0);
      cartItem.setInStock(isInStock);
      itemMap.put(item.getItemId(), cartItem);
      itemList.add(cartItem);
    }
    cartItem.incrementQuantity();
  }

  /**
   * Removes the item by id.
   *
   * @param itemId
   *          the item id
   * @return the item
   */
  public Item removeItemById(String itemId) {
    CartItem cartItem = itemMap.remove(itemId);
    if (cartItem == null) {
      return null;
    } else {
      itemList.remove(cartItem);
      return cartItem.getItem();
    }
  }

  /**
   * Increment quantity by item id.
   *
   * @param itemId
   *          the item id
   */
  public void incrementQuantityByItemId(String itemId) {
    CartItem cartItem = itemMap.get(itemId);
    cartItem.incrementQuantity();
  }

  public void setQuantityByItemId(String itemId, int quantity) {
    CartItem cartItem = itemMap.get(itemId);
    cartItem.setQuantity(quantity);
  }

  public void addAdoptItem(AdoptItem adoptItem, boolean isInStock){
    if(!containsAdoptItem(adoptItem.getItemId())) {
      CartAdoptItem cartAdoptItem = new CartAdoptItem();
      cartAdoptItem.setAdopt(adoptItem);
      cartAdoptItem.setInStock(isInStock);
      adoptItemList.add(cartAdoptItem);
    }
  }

  public CartAdoptItem findAdoptItem(String adoptId){
    CartAdoptItem cartAdoptItem = null;
    for(CartAdoptItem adoptCartItem:adoptItemList){
      if(adoptCartItem.getAdopt().getItemId()==adoptId) {cartAdoptItem=adoptCartItem;break;}
    }
    return cartAdoptItem;
  }

  public AdoptItem removeAdoptItem(String adoptId){
    CartAdoptItem cartAdoptItem = findAdoptItem(adoptId);
    if (cartAdoptItem == null) {
      return null;
    } else {
      itemList.remove(cartAdoptItem);
      return cartAdoptItem.getAdopt();
    }
  }

  /**
   * Gets the sub total.
   *
   * @return the sub total
   */
  public BigDecimal getSubTotal() {
    return itemList.stream()
            .map(cartItem -> cartItem.getItem().getListPrice().multiply(new BigDecimal(cartItem.getQuantity())))
            .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
  //입양된 아이들에게 후원한 총 금액 계산
  public BigDecimal getSubAdoptTotal(){
    return adoptItemList.stream()
            .map(cartAdoptItem -> cartAdoptItem.getAdopt().getSupportAmount()).reduce(BigDecimal.ZERO,BigDecimal::add);
  }

}
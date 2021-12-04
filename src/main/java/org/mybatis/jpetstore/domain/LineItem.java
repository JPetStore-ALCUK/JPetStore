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
import java.util.Optional;

/**
 * The Class LineItem.
 *
 * @author Eduardo Macarron
 */
public class LineItem implements Serializable {

  private static final long serialVersionUID = 6804536240033522156L;

  private int orderId;
  private int lineNumber;
  private int quantity;
  private String itemId;
  private BigDecimal unitPrice;
  private Item item;
  private BigDecimal total;
  private String attribute1;
  private String attribute2;
  private String attribute3;
  private String attribute4;
  private String attribute5;
  private String name;

  public LineItem() {
  }

  /**
   * Instantiates a new line item.
   *
   * @param lineNumber
   *          the line number
   * @param cartItem
   *          the cart item
   */
  public LineItem(int lineNumber, CartItem cartItem) {
    this.lineNumber = lineNumber;
    this.quantity = cartItem.getQuantity();
    this.itemId = cartItem.getItem().getItemId();
    this.unitPrice = cartItem.getItem().getListPrice();
    this.item = cartItem.getItem();
    calculateTotal();
  }

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public int getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(int lineNumber) {
    this.lineNumber = lineNumber;
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitprice) {
    this.unitPrice = unitprice;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
    this.attribute1 = item.getAttribute1();
    this.attribute2 = item.getAttribute2();
    this.attribute3 = item.getAttribute3();
    this.attribute4 = item.getAttribute4();
    this.attribute5 = item.getAttribute5();
    calculateTotal();
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
    calculateTotal();
  }

  private void calculateTotal() {
    total = Optional.ofNullable(item).map(Item::getListPrice).map(v -> v.multiply(new BigDecimal(quantity)))
        .orElse(null);
  }
  public String getAttribute1() {
    return attribute1;
  }

  /*public void setAttribute1(String attribute1) {
    this.attribute1 = item.getAttribute1();
  }*/

  public String getAttribute2() {
    return attribute2;
  }

 /* public void setAttribute2(String attribute2) {
    this.attribute2 = item.getAttribute2();
  }*/

  public String getAttribute3() {
    return attribute3;
  }

  /*public void setAttribute3(String attribute3) {
    this.attribute3 = item.getAttribute3();
  }*/

  public String getAttribute4() {
    return attribute4;
  }

  /*public void setAttribute4(String attribute4) {
    this.attribute4 = item.getAttribute4();
  }*/

  public String getAttribute5() {
    return attribute5;
  }

  /*public void setAttribute5(String attribute5) {
    this.attribute5 = item.getAttribute5();
  }*/

  public String getName() {
    return name;
  }

  /*public void setName(String name){
    this.name = item.getProduct().getName();
  }*/
}

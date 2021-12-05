package org.mybatis.jpetstore.service;

import java.math.BigDecimal;
import java.util.List;

import org.mybatis.jpetstore.domain.AdoptItem;
import org.mybatis.jpetstore.domain.LineAdoptItem;
import org.mybatis.jpetstore.mapper.AdoptMapper;
import org.mybatis.jpetstore.mapper.LineAdoptItemMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdoptService {
  private final AdoptMapper adoptMapper;
  private final LineAdoptItemMapper lineAdoptItemMapper;

  public AdoptService(AdoptMapper adoptMapper, LineAdoptItemMapper lineAdoptItemMapper) {
    this.adoptMapper = adoptMapper;
    this.lineAdoptItemMapper = lineAdoptItemMapper;
  }

  // AdoptMapper
  public List<AdoptItem> getAllAdoptItem() {
    return adoptMapper.getAllAdoptItem();
  }

  public AdoptItem getAdoptItemById(String itemId) {
    return adoptMapper.getAdoptItemById(itemId);
  }

  @Transactional
  public void insertAdoptItem(AdoptItem adoptItem) {
    adoptMapper.insertAdoptItem(adoptItem);
  }

  @Transactional
  public void deleteAdoptItem(String itemId) {
    adoptMapper.deleteAdoptItem(itemId);
  }

  @Transactional
  public void updateAdoptItemSupportAmount(BigDecimal supportamount, BigDecimal total_support, String itemid) {
    adoptMapper.updateAdoptItemSupportAmount(supportamount, total_support, itemid);
  }

  public BigDecimal getAdoptItemTotalSupportById(String itemid) {
    return adoptMapper.getAdoptItemTotalSupportById(itemid);
  }

  // adoptItemMapper
  public List<LineAdoptItem> getLineAdoptItemsByOrderId(int orderId) {
    return this.lineAdoptItemMapper.getLineAdoptItemsByOrderId(orderId);
  }

  @Transactional
  void insertAdoptLineItem(LineAdoptItem lineAdoptItem) {
    this.lineAdoptItemMapper.insertAdoptLineItem(lineAdoptItem);
  }

  public boolean isAdoptItemInStock(String itemId) {
    AdoptItem adoptItem = null;
    adoptItem = adoptMapper.getAdoptItemById(itemId);
    if (adoptItem != null)
      return true;
    else
      return false;
  }

  @Transactional
  public void insertList(AdoptItem adoptitem) {
    adoptMapper.insertList(adoptitem);
  }

  public List<AdoptItem> selectAdoptItem() {
    List<AdoptItem> itemList = adoptMapper.selectAdoptItem();
    return itemList;
  }

  public AdoptItem getItem(String itemId) {
    return adoptMapper.getItem(itemId);
  }

}

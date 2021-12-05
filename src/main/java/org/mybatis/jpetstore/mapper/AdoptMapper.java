package org.mybatis.jpetstore.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.mybatis.jpetstore.domain.AdoptItem;

public interface AdoptMapper {
  List<AdoptItem> getAllAdoptItem();

  AdoptItem getAdoptItemById(String itemId);

  void insertAdoptItem(AdoptItem adoptItem);

  void deleteAdoptItem(String itemId);

  void updateAdoptItemSupportAmount(BigDecimal supportamount, BigDecimal total_support, String itemid);

  BigDecimal getAdoptItemTotalSupportById(String itemid);

  void insertList(AdoptItem adoptitem);

  List<AdoptItem> selectAdoptItem();

  AdoptItem getItem(String itemId);
}

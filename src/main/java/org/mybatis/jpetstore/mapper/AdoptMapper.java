package org.mybatis.jpetstore.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.mybatis.jpetstore.domain.AdoptItem;

public interface AdoptMapper {
  void insertList(AdoptItem adoptitem);

  List<AdoptItem> selectAdoptItem();

  AdoptItem getItem(String itemId);

  void deleteAdoptItem(String itemId);

  BigDecimal getSupportAmount(String itemId);
}

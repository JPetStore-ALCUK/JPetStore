package org.mybatis.jpetstore.mapper;

import java.util.List;

import org.mybatis.jpetstore.domain.LineAdoptItem;

public interface LineAdoptItemMapper {
  List<LineAdoptItem> getLineAdoptItemsByOrderId(int orderId);

  void insertAdoptLineItem(LineAdoptItem lineAdoptItem);
}

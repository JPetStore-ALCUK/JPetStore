package org.mybatis.jpetstore.mapper;

import org.mybatis.jpetstore.domain.LineAdoptItem;

import java.util.List;

public interface LineAdoptItemMapper {
    List<LineAdoptItem> getLineAdoptItemsByOrderId(int orderId);
    void insertAdoptLineItem(LineAdoptItem lineAdoptItem);
}
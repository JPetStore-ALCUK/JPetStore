package org.mybatis.jpetstore.mapper;

import org.mybatis.jpetstore.domain.AdoptItem;
import org.mybatis.jpetstore.domain.BoardElement;

import java.util.List;

public interface AdoptMapper {
    List<AdoptItem> getAllAdoptItem();

    AdoptItem getAdoptItemById(String itemId);

    void insertAdoptItem(AdoptItem adoptItem);

    void deleteAdoptItem(String itemId);
}

package org.mybatis.jpetstore.mapper;

import java.util.List;
import org.mybatis.jpetstore.domain.AdoptItem;

public interface AdoptMapper {
    void insertList(AdoptItem adoptitem);

    List<AdoptItem> selectAdoptItem();

    AdoptItem getItem(String itemId);
}

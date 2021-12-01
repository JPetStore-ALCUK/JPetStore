package org.mybatis.jpetstore.mapper;

import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Search;

import java.util.List;

public interface SearchMapper {
    List<Item> searchItemByPriceAndCategory(Search search);
}
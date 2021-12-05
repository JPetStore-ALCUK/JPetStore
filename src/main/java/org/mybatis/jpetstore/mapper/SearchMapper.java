package org.mybatis.jpetstore.mapper;

import java.util.List;

import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Search;

public interface SearchMapper {
  List<Item> searchItemByPriceAndCategory(Search search);
}

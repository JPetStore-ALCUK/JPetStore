package org.mybatis.jpetstore.service;

import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Search;
import org.mybatis.jpetstore.mapper.CategoryMapper;
import org.mybatis.jpetstore.mapper.SearchMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    private final SearchMapper searchMapper;
    private final CategoryMapper categoryMapper;
    public SearchService(SearchMapper searchMapper, CategoryMapper categoryMapper){
        this.searchMapper=searchMapper;
        this.categoryMapper=categoryMapper;
    }
    public List<Item> searchItemByPriceAndCategory(Search search){
        return searchMapper.searchItemByPriceAndCategory(search);
    }
}
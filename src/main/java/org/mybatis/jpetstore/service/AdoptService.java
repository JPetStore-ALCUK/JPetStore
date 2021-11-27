package org.mybatis.jpetstore.service;

import java.util.List;

import org.mybatis.jpetstore.domain.AdoptItem;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.mapper.AdoptMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdoptService {

    private final AdoptMapper adoptMapper;

    public AdoptService(AdoptMapper adoptMapper) {
        this.adoptMapper = adoptMapper;
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

package org.mybatis.jpetstore.service;

import org.mybatis.jpetstore.domain.AdoptItem;
import org.mybatis.jpetstore.domain.LineAdoptItem;
import org.mybatis.jpetstore.mapper.AdoptMapper;
import org.mybatis.jpetstore.mapper.LineAdoptItemMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdoptService {
    private final AdoptMapper adoptMapper;
    private final LineAdoptItemMapper lineAdoptItemMapper;

    public AdoptService(AdoptMapper adoptMapper,LineAdoptItemMapper lineAdoptItemMapper ){
        this.adoptMapper =adoptMapper;
        this.lineAdoptItemMapper = lineAdoptItemMapper;
    }

    //AdoptMapper
    public List<AdoptItem> getAllAdoptItem(){
        return adoptMapper.getAllAdoptItem();
    }

    public AdoptItem getAdoptItemById(String itemId){
        return adoptMapper.getAdoptItemById(itemId);
    }

    @Transactional
    public void insertAdoptItem(AdoptItem adoptItem){
        adoptMapper.insertAdoptItem(adoptItem);
    }

    @Transactional
    public void deleteAdoptItem(String itemId){
        adoptMapper.deleteAdoptItem(itemId);
    }

    //adoptItemMapper
    public List<LineAdoptItem> getLineAdoptItemsByOrderId(int orderId){
        return this.lineAdoptItemMapper.getLineAdoptItemsByOrderId(orderId);
    }

    @Transactional
    void insertAdoptLineItem(LineAdoptItem lineAdoptItem){
        this.lineAdoptItemMapper.insertAdoptLineItem(lineAdoptItem);
    }

    public boolean isAdoptItemInStock(String adoptItemId){
        AdoptItem adoptItem = null;
        adoptItem = adoptMapper.getAdoptItemById(adoptItemId);
        if(adoptItem!=null) return true;
        else return false;
    }
}

package org.mybatis.jpetstore.service;

import org.mybatis.jpetstore.domain.Support;
import org.mybatis.jpetstore.mapper.SupportMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportService {
    private final SupportMapper supportMapper;
    public SupportService(SupportMapper supportMapper){
        this.supportMapper = supportMapper;
    }
    public int getNewSupportId(){ return supportMapper.getNewSupportId();}
    public void insertSupport(Support support){supportMapper.insertSupport(support);}
    public void updateSupportAmount(Support support){
        supportMapper.updateSupportAmount(support);
    }
    public Support getLastSupport(){return supportMapper.getLastSupport();}
    public List<Support> getAllSupportOrderByAmount(){return supportMapper.getAllSupportOrderByAmount();}
}

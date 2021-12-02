package org.mybatis.jpetstore.service;

import org.mybatis.jpetstore.domain.Support;
import org.mybatis.jpetstore.mapper.SupportMapper;
import org.springframework.stereotype.Service;

@Service
public class SupportService {
    private final SupportMapper supportMapper;
    public SupportService(SupportMapper supportMapper){
        this.supportMapper = supportMapper;
    }
    public int getNewSupportId(){ return supportMapper.getNewSupportId();}
    public void insertSupport(Support support){supportMapper.insertSupport(support);}
    public void updateSupport(Support support){
        supportMapper.updateSupport(support);
    }
}

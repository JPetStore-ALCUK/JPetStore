package org.mybatis.jpetstore.service;

import java.util.List;

import org.mybatis.jpetstore.domain.Support;
import org.mybatis.jpetstore.mapper.SupportMapper;
import org.springframework.stereotype.Service;

@Service
public class SupportService {
  private final SupportMapper supportMapper;

  public SupportService(SupportMapper supportMapper) {
    this.supportMapper = supportMapper;
  }

  public int getNewSupportId() {
    return supportMapper.getNewSupportId();
  }

  public void insertSupport(Support support) {
    supportMapper.insertSupport(support);
  }

  public void updateSupportAmount(Support support) {
    supportMapper.updateSupportAmount(support);
  }

  public Support getLastSupport(int index) {
    return supportMapper.getLastSupport(index);
  }

  public List<Support> getAllSupport() {
    return supportMapper.getAllSupport();
  }
}

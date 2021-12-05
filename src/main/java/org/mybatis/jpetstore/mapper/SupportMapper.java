package org.mybatis.jpetstore.mapper;

import java.util.List;

import org.mybatis.jpetstore.domain.Support;

public interface SupportMapper {
  int getNewSupportId();

  void insertSupport(Support support);

  void updateSupportAmount(Support support);

  Support getLastSupport();

  List<Support> getAllSupportOrderByAmount();
}

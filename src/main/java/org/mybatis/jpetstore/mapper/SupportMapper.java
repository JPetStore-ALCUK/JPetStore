package org.mybatis.jpetstore.mapper;

import org.mybatis.jpetstore.domain.Support;

import java.util.List;

public interface SupportMapper {
    int getNewSupportId();
    void insertSupport(Support support);
    void updateSupportAmount(Support support);
    Support getLastSupport();
    List<Support> getAllSupportOrderByAmount();
}

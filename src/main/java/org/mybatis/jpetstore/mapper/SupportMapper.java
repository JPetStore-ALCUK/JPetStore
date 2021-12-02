package org.mybatis.jpetstore.mapper;

import org.mybatis.jpetstore.domain.Support;

public interface SupportMapper {
    int getNewSupportId();
    void insertSupport(Support support);
    void updateSupport(Support support);
}

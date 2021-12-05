package org.mybatis.jpetstore.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.jpetstore.domain.Shelter;
import org.mybatis.jpetstore.domain.Supplier;

@Mapper
public interface ShelterMapper {
  List<Shelter> getShelters();

  Supplier getSupplierById(int suppid);

  Shelter getShelterById(String shelterid);

  void modifyTotal_support(@Param("total_support") BigDecimal total_support, @Param("shelterid") String shelterid);

  void insertShelter(Shelter shelter);

  void insertSupplier(Supplier supplier);
}

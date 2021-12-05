package org.mybatis.jpetstore.service;

import java.math.BigDecimal;
import java.util.List;

import org.mybatis.jpetstore.domain.Shelter;
import org.mybatis.jpetstore.domain.Supplier;
import org.mybatis.jpetstore.mapper.ShelterMapper;
import org.springframework.stereotype.Service;

@Service
public class ShelterService {
  private final ShelterMapper shelterMapper;

  public ShelterService(ShelterMapper shelterMapper) {
    this.shelterMapper = shelterMapper;
  }

  public List<Shelter> getShelters() {
    return shelterMapper.getShelters();
  }

  public Shelter getShelterById(String shelterid) {
    return shelterMapper.getShelterById(shelterid);
  }

  public Supplier getSupplierById(int suppid) {
    return shelterMapper.getSupplierById(suppid);
  }

  public void modifyTotal_support(BigDecimal total_support, String shelterid) {
    shelterMapper.modifyTotal_support(total_support, shelterid);
  }

  public void insertShelter(Shelter shelter) {
    shelterMapper.insertShelter(shelter);
  }

  public void insertSupplier(Supplier supplier) {
    shelterMapper.insertSupplier(supplier);
  }
}

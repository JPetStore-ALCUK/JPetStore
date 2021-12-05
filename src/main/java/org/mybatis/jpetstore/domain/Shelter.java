package org.mybatis.jpetstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Shelter implements Serializable {
  private String shelterid;
  private int suppid;
  private Supplier supplier;
  private BigDecimal total_support;

  public void setShelterid(String shelterid) {
    this.shelterid = shelterid;
  }

  public void setSuppid(int suppid) {
    this.suppid = suppid;
  }

  public void setTotal_support(BigDecimal total_support) {
    this.total_support = total_support;
  }

  public String getShelterid() {
    return shelterid;
  }

  public int getSuppid() {
    return suppid;
  }

  public BigDecimal getTotal_support() {
    return total_support;
  }

  public Supplier getSupplier() {
    return supplier;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }
}

package org.mybatis.jpetstore.domain;

import java.io.Serializable;

public class Search implements Serializable {
  private Long minimumPrice;
  private Long maximumPrice;
  private String categoryId;
  private String productId;
  private String attribute1;
  private String attribute2;
  private String attribute3;
  private String attribute4;

  public Long getMinimumPrice() {
    return minimumPrice;
  }

  public Long getMaximumPrice() {
    return maximumPrice;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public String getProductId() {
    return productId;
  }

  public String getAttribute1() {
    return attribute1;
  }

  public String getAttribute2() {
    return attribute2;
  }

  public String getAttribute3() {
    return attribute3;
  }

  public String getAttribute4() {
    return attribute4;
  }

  public void setMinimumPrice(Long minimumPrice) {
    this.minimumPrice = minimumPrice;
  }

  public void setMaximumPrice(Long maximumPrice) {
    this.maximumPrice = maximumPrice;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public void setAttribute1(String attribute1) {
    this.attribute1 = attribute1;
  }

  public void setAttribute2(String attribute2) {
    this.attribute2 = attribute2;
  }

  public void setAttribute3(String attribute3) {
    this.attribute3 = attribute3;
  }

  public void setAttribute4(String attribute4) {
    this.attribute4 = attribute4;
  }

}

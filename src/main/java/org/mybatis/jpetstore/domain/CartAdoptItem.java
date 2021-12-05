package org.mybatis.jpetstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class CartAdoptItem implements Serializable {
  private AdoptItem adoptItem;
  private boolean inStock;
  private BigDecimal total;

  public void setAdopt(AdoptItem adoptItem) {
    this.adoptItem = adoptItem;
  }

  public void setInStock(boolean inStock) {
    this.inStock = inStock;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public AdoptItem getAdopt() {
    return adoptItem;
  }

  public boolean isInStock() {
    return inStock;
  }

  public BigDecimal getTotal() {
    return total;
  }
}

package org.mybatis.jpetstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class Support implements Serializable {
  private int supportId;
  private Timestamp supportDate;
  private String supportItemId;
  private String supportCategory;
  private String cardType;
  private String creditCard;
  private String expiryDate;
  private String billToFirstName;
  private String billToLastName;
  private BigDecimal amount;

  public int getSupportId() {
    return supportId;
  }

  public String getCardType() {
    return cardType;
  }

  public String getCreditCard() {
    return creditCard;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public String getBillToFirstName() {
    return billToFirstName;
  }

  public String getBillToLastName() {
    return billToLastName;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setSupportId(int supportId) {
    this.supportId = supportId;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public void setCreditCard(String creditCard) {
    this.creditCard = creditCard;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public void setBillToFirstName(String billToFirstName) {
    this.billToFirstName = billToFirstName;
  }

  public void setBillToLastName(String billToLastName) {
    this.billToLastName = billToLastName;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getSupportItemId() {
    return supportItemId;
  }

  public String getSupportCategory() {
    return supportCategory;
  }

  public void setSupportItemId(String supportItemId) {
    this.supportItemId = supportItemId;
  }

  public void setSupportCategory(String supportCategory) {
    this.supportCategory = supportCategory;
  }

  public Timestamp getSupportDate() {
    return supportDate;
  }

  public void setSupportDate(Timestamp supportDate) {
    this.supportDate = supportDate;
  }
}

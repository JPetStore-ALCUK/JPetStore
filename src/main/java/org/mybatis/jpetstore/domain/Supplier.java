package org.mybatis.jpetstore.domain;

import java.io.Serializable;

public class Supplier implements Serializable {
  private int suppid;
  private String name;
  private String status;
  private String addr1;
  private String add2;
  private String city;
  private String state;
  private String zip;
  private String phone;

  public void setSuppid(int suppid) {
    this.suppid = suppid;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  public void setAdd2(String add2) {
    this.add2 = add2;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getSuppid() {
    return suppid;
  }

  public String getName() {
    return name;
  }

  public String getStatus() {
    return status;
  }

  public String getAddr1() {
    return addr1;
  }

  public String getAdd2() {
    return add2;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZip() {
    return zip;
  }

  public String getPhone() {
    return phone;
  }
}

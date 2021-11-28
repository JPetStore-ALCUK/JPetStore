package org.mybatis.jpetstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class AdoptItem implements Serializable {
    private String itemId;
    private String category;
    private String name;
    private int age;
    private String gender;
    private String state;
    private BigDecimal supportamount;
    private BigDecimal total_support;
    private String attr;

    public void setTotal_support(BigDecimal total_support) {
        this.total_support = total_support;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setSupportamount(BigDecimal supportamount) {
        this.supportamount = supportamount;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getItemId() {
        return itemId;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getState() {
        return state;
    }

    public BigDecimal getSupportamount() {
        return supportamount;
    }

    public BigDecimal getTotal_support() {
        return total_support;
    }

    public String getAttr() {
        return attr;
    }
}


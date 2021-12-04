package org.mybatis.jpetstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class LineAdoptItem implements Serializable {
    private int orderId;
    private int lineAdoptNum;
    private String adoptid;
    private BigDecimal supportamount;
    private String name;
    private String catalog;
    private String attr;


    public LineAdoptItem(){

    }

    public LineAdoptItem(int lineAdoptItemNum, CartAdoptItem cartAdoptItem){
        this.lineAdoptNum = lineAdoptItemNum;
        this.adoptid = cartAdoptItem.getAdopt().getItemId();
        this.supportamount = cartAdoptItem.getAdopt().getSupportAmount();
        this.name=cartAdoptItem.getAdopt().getName();
        this.attr=cartAdoptItem.getAdopt().getAttribute();
        this.catalog=cartAdoptItem.getAdopt().getCategory();
    }

    public void setAdoptid(String adoptid) {
        this.adoptid = adoptid;
    }

    public String getAdoptid() {
        return adoptid;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setLineAdoptNum(int lineAdoptNum) {
        this.lineAdoptNum = lineAdoptNum;
    }

    public void setSupportamount(BigDecimal supportamount) {
        this.supportamount = supportamount;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getLineAdoptNum() {
        return lineAdoptNum;
    }

    public BigDecimal getSupportamount() {
        return supportamount;
    }

    public String getAttr() {
        return attr;
    }

    public String getName() {
        return name;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }
}

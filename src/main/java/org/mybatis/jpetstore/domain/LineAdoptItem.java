package org.mybatis.jpetstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class LineAdoptItem implements Serializable {
    private int orderId;
    private int lineAdoptItemNumber;
    private String adoptId;
    private AdoptItem adoptItem;
    private BigDecimal supportamount;
    private String attr;
    private String name;

    public LineAdoptItem(){

    }

    public LineAdoptItem(int lineAdoptItemNumber, CartAdoptItem cartAdoptItem){
        this.lineAdoptItemNumber = lineAdoptItemNumber;
        this.adoptId = cartAdoptItem.getAdopt().getItemId();
        this.supportamount = cartAdoptItem.getAdopt().getSupportamount();
        this.adoptItem = cartAdoptItem.getAdopt();
    }

    public AdoptItem getAdoptItem() {
        return adoptItem;
    }

    public void setAdoptItem(AdoptItem adoptItem) {
        this.adoptItem = adoptItem;
    }

    public void setAdoptId(String adoptId) {
        this.adoptId = adoptId;
    }

    public String getAdoptId() {
        return adoptId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setLineAdoptItemNumber(int lineAdoptItemNumber) {
        this.lineAdoptItemNumber = lineAdoptItemNumber;
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

    public int getLineAdoptItemNumber() {
        return lineAdoptItemNumber;
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
}

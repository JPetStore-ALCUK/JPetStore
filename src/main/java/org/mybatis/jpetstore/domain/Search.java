package org.mybatis.jpetstore.domain;

import java.io.Serializable;

public class Search implements Serializable {
    private Long minimumPrice;
    private Long maximumPrice;
    private String categoryId;
    private String productId;

    public Long getMinimumPrice(){
        return minimumPrice;
    }
    public Long getMaximumPrice() {
        return maximumPrice;
    }
    public String getCategoryId(){
        return categoryId;
    }
    public String getProductId() {return productId;}
    public void setMinimumPrice(Long minimumPrice){
        this.minimumPrice=minimumPrice;
    }
    public void setMaximumPrice(Long maximumPrice){
        this.maximumPrice=maximumPrice;
    }
    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }
    public void setProductId(String productId){this.productId = productId;}

}

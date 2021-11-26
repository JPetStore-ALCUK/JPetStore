package org.mybatis.jpetstore.domain;

import java.io.Serializable;

public class AdoptItem implements Serializable{
    private String itemId;
    private String category;
    private String name;
    private int age;
    private String gender;
    private String state;
    private int supportAmount;
    private String attribute;

    public void setItemId(String itemId){this.itemId=itemId;}

    public void setCategory(String category){this.category=category;}

    public void setName(String name){this.name=name;}

    public void setAge(int age){this.age=age;}

    public void setGender(String gender){this.gender=gender;}

    public void setState(String state){this.state=state;}

    public void setSupportAmount(int supportAmount){this.supportAmount=supportAmount;}

    public void setAttribute(String attribute){this.attribute=attribute;}

    public String getItemID(){return this.itemId;}

    public String getCategory(){return this.category;}

    public String getName(){return this.name;}

    public int getAge(){return this.age;}

    public String getGender(){return this.gender;}

    public String getState(){return this.state;}

    public int getSupportAmount(){return this.supportAmount;}

    public String getAttribute(){return this.attribute;}
}

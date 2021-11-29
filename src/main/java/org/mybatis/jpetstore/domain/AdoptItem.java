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

    public void setAll(String itemId, String category, String name, int age, String gender, String attribute)
    {
        this.itemId = itemId;
        this.category = category;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.attribute = attribute;
    }
    public void setItemId(String itemId){this.itemId=itemId.trim();}

    public void setCategory(String category){this.category=category.trim();}

    public void setName(String name){this.name=name.trim();}

    public void setAge(int age){this.age=age;}

    public void setGender(String gender){this.gender=gender.trim();}

    public void setState(String state){this.state=state.trim();}

    public void setSupportAmount(int supportAmount){this.supportAmount=supportAmount;}

    public void setAttribute(String attribute){this.attribute=attribute.trim();}

    public String getItemId(){return itemId;}

    public String getCategory(){return category;}

    public String getName(){return name;}

    public int getAge(){return age;}

    public String getGender(){return gender;}

    public String getState(){return state;}

    public int getSupportAmount(){return supportAmount;}

    public String getAttribute(){return attribute;}

    @Override
    public String toString() {
        return "(" + getItemId() + ")";
    }

}

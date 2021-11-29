package org.mybatis.jpetstore.web.actions;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.integration.spring.SpringBean;

import org.mybatis.jpetstore.domain.AdoptItem;
import org.mybatis.jpetstore.service.AdoptService;
import org.springframework.transaction.annotation.Transactional;

public class AdoptActionBean extends AbstractActionBean {

    private static final String VIEW_INSERT = "/WEB-INF/jsp/adopt/AdoptForm.jsp";
    private static final String VIEW_ADOPTLIST = "/WEB-INF/jsp/adopt/AdoptList.jsp";
    private static final String VIEW_ADOPTITEM = "/WEB-INF/jsp/adopt/AdoptItem.jsp";

    private String itemId;
    private String category;
    private String name;
    private int age;
    private String gender;
    private String state;
    private int supportAmount;
    private String attribute;
    private AdoptItem adoptitem;
    private List<AdoptItem> itemList;

    @SpringBean
    private transient AdoptService adoptService;

    public String getItemId(){return itemId;}

    public void setItemId(String itemId){this.itemId = itemId;}

    public String getCategory(){return category;}

    public void setCategory(String category){this.category=category;}

    public String getName(){return name;}

    public void setName(String name){this.name=name;}

    public int getAge(){return age;}

    public void setAge(int age){this.age=age;}

    public String getGender(){return gender;}

    public void setGender(String gender){this.gender=gender;}

    public String getState(){return state;}

    public void setState(String state){this.adoptitem.setState(state);}

    public int getSupportAmount(){return supportAmount;}

    public void setSupportAmount(int supportAmount){this.adoptitem.setSupportAmount(supportAmount);}

    public String getAttribute(){return attribute;}

    public void setAttribute(String attribute){this.attribute=attribute;}

    public AdoptItem getAdoptitem() {
        return adoptitem;
    }

    public void setAdoptitem(AdoptItem adoptitem) {
        this.adoptitem = adoptitem;
    }

    public List<AdoptItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<AdoptItem> itemList) {
        this.itemList = itemList;
    }

    @Transactional
    public ForwardResolution viewAdoptItem(){
        itemList = adoptService.selectAdoptItem();
        return new ForwardResolution(VIEW_ADOPTLIST);
    }

    public Resolution insertForm(){
        return new ForwardResolution(VIEW_INSERT);
    }

    public Resolution insertAnimal() {
        adoptitem = new AdoptItem();
        adoptitem.setAll(itemId.toUpperCase(), category.toUpperCase(), name.toUpperCase(), age, gender.toUpperCase(), attribute.toUpperCase());
        adoptService.insertList(adoptitem);
        return new RedirectResolution(AdoptActionBean.class, "viewAdoptItem");
    }

    public ForwardResolution viewItem() {
        adoptitem = adoptService.getItem(itemId);
        return new ForwardResolution(VIEW_ADOPTITEM);
    }
    public void clear(){
        adoptitem = null;
        itemList = null;
        itemId = null;
        category = null;
        name = null;
        gender = null;
        state = null;
        attribute = null;
    }
}

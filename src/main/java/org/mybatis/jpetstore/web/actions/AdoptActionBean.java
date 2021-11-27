package org.mybatis.jpetstore.web.actions;

import java.util.List;
import java.util.Locale;

import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.integration.spring.SpringBean;

import org.mybatis.jpetstore.domain.AdoptItem;
import org.mybatis.jpetstore.service.AdoptService;

public class AdoptActionBean extends AbstractActionBean {

    private static final String VIEW_INSERT = "/WEB-INF/jsp/adopt/AdoptForm.jsp";
    private static final String VIEW_ADOPTLIST = "/WEB-INF/jsp/adopt/AdoptList.jsp";
    private static final String VIEW_ADOPTITEM = "/WEB-INF/jsp/jsp";

    @SpringBean
    private transient AdoptService adoptService;

    private String itemId;
    private String category;
    private String name;
    private int age;
    private String gender;
    private String state;
    private int supportAmount;
    private String attribute;
    private AdoptItem adoptitem = new AdoptItem();
    private List<AdoptItem> itemList;

    public Resolution insertForm(){
        return new ForwardResolution(VIEW_INSERT);
    }
    public ForwardResolution insertAnimal() {
        //아이디 체크 if(itemId == adoptService.checkItemId())
        if (itemId == null || itemId.length() < 1 ||
                category == null || category.length() < 1 ||
                name == null || name.length() < 1 ||
                gender == null || gender.length() < 1 ||
                attribute == null || attribute.length() < 1) {
            setMessage("Please check again, something is empty");
            return new ForwardResolution(ERROR);
        } else {
            adoptitem.setAll(itemId.toLowerCase(), category.toLowerCase(),
                    name.toLowerCase(), age, gender.toLowerCase(),
                    attribute.toLowerCase());
            adoptService.insertList(adoptitem);
            return new ForwardResolution(VIEW_ADOPTLIST);
        }
    }
    public ForwardResolution viewAdoptItem(){
        itemList = adoptService.selectAdoptItem();
        return new ForwardResolution(VIEW_ADOPTLIST);
    }
    public ForwardResolution viewItem() {
        adoptitem = adoptService.getItem(itemId);
        return new ForwardResolution(VIEW_ADOPTITEM);
    }
}

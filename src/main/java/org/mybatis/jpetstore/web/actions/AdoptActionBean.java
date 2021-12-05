package org.mybatis.jpetstore.web.actions;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.integration.spring.SpringBean;

import org.mybatis.jpetstore.domain.AdoptItem;
import org.mybatis.jpetstore.domain.Support;
import org.mybatis.jpetstore.service.AdoptService;
import org.mybatis.jpetstore.service.SupportService;
import org.springframework.transaction.annotation.Transactional;

public class AdoptActionBean extends AbstractActionBean {

  private static final String VIEW_INSERT = "/WEB-INF/jsp/adopt/AdoptForm.jsp";
  private static final String VIEW_ADOPTLIST = "/WEB-INF/jsp/adopt/AdoptList.jsp";
  private static final String VIEW_ADOPTITEM = "/WEB-INF/jsp/adopt/AdoptItem.jsp";

  // support
  private static final String NEW_SUPPORT_FORM = "/WEB-INF/jsp/support/NewSupportForm.jsp";
  private static final String VIEW_SUPPORT = "/WEB-INF/jsp/support/ViewSupport.jsp";
  private static final List<String> CARD_TYPE_LIST;
  // support end

  private String itemId;
  private String category;
  private String shelterid;
  private String name;
  private int age;
  private String gender;
  private String state;
  private BigDecimal supportAmount;
  private String attribute;
  private AdoptItem adoptitem;
  private List<AdoptItem> itemList;

  // support
  private Support support = new Support();

  static {
    CARD_TYPE_LIST = Collections.unmodifiableList(Arrays.asList("Visa", "MasterCard", "American Express"));
  }

  // support end

  @SpringBean
  private transient AdoptService adoptService;

  // support
  @SpringBean
  private transient SupportService supportService;
  // support end

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.adoptitem.setState(state);
  }

  public BigDecimal getSupportAmount() {
    return supportAmount;
  }

  public void setSupportAmount(BigDecimal supportAmount) {
    this.adoptitem.setSupportAmount(supportAmount);
  }

  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

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

  public void setShelterid(String shelterid) {
    this.shelterid = shelterid;
  }

  public String getShelterid() {
    return this.shelterid;
  }

  // support
  public String getCardType(String cardType) {
    return cardType;
  }

  public String getCreditCard(String creditCard) {
    return creditCard;
  }

  public Support getSupport() {
    return this.support;
  }

  public int getSupportId() {
    return support.getSupportId();
  }

  public String getCardType(Support support) {
    return support.getCardType();
  }

  public String getCreditCard(Support support) {
    return support.getCreditCard();
  }

  public String getExpiryDate(Support support) {
    return support.getExpiryDate();
  }

  public String getBillToFirstName(Support support) {
    return support.getBillToFirstName();
  }

  public String getBillToLastName(Support support) {
    return support.getBillToLastName();
  }

  public BigDecimal getAmount(Support support) {
    return support.getAmount();
  }

  public String getSupportItemId(Support support) {
    return support.getSupportItemId();
  }

  public String getSupportCategory(Support support) {
    return support.getSupportCategory();
  }

  public void setSupport(Support support) {
    this.support = support;
  }

  public void setSupportId(int supportId) {
    support.setSupportId(supportId);
  }

  public void setCardType(String cardType) {
    support.setCardType(cardType);
  }

  public void setCreditCard(String creditCard) {
    support.setCreditCard(creditCard);
  }

  public void setExpiryDate(String expiryDate) {
    support.setExpiryDate(expiryDate);
  }

  public void setBillToFirstName(String billToFirstName) {
    support.setBillToFirstName(billToFirstName);
  }

  public void setBillToLastName(String billToLastName) {
    support.setBillToLastName(billToLastName);
  }

  public void setAmount(BigDecimal amount) {
    support.setAmount(amount);
  }

  public void setSupportItemId(String supportItemId) {
    support.setSupportItemId(supportItemId);
  }

  public void setSupportCategory(String supportCategory) {
    support.setSupportCategory(supportCategory);
  }
  // end support

  public List<String> getCardTypeList() {
    return CARD_TYPE_LIST;
  }

  @Transactional
  public ForwardResolution viewAdoptItem() {
    itemList = adoptService.selectAdoptItem();
    return new ForwardResolution(VIEW_ADOPTLIST);
  }

  public Resolution insertForm() {
    return new ForwardResolution(VIEW_INSERT);
  }

  public Resolution insertAnimal() {
    adoptitem = new AdoptItem();
    adoptitem.setAll(itemId.toUpperCase(), category.toUpperCase(), shelterid, name.toUpperCase(), age,
        gender.toUpperCase(), attribute.toUpperCase());
    adoptService.insertList(adoptitem);
    return new RedirectResolution(AdoptActionBean.class, "viewAdoptItem");
  }

  public ForwardResolution viewItem() {
    adoptitem = adoptService.getItem(itemId);
    return new ForwardResolution(VIEW_ADOPTITEM);
  }

  // support
  public Resolution newSupport() {
    // System.out.println(support.getSupportItemId());
    return new ForwardResolution(NEW_SUPPORT_FORM);
  }

  public Resolution confirmSupport() {
    adoptitem = new AdoptItem();
    adoptitem = adoptService.getItem(support.getSupportItemId());
    support.setSupportCategory(adoptitem.getCategory());
    int index = supportService.getNewSupportId() + 1;
    support.setSupportId(index);
    supportService.insertSupport(support);
    supportService.updateSupportAmount(support);
    adoptitem = adoptService.getItem(support.getSupportItemId());

    return new ForwardResolution(VIEW_SUPPORT);
  }
  // end support

  public void clear() {
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

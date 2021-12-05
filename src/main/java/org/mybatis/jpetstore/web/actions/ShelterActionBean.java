package org.mybatis.jpetstore.web.actions;

import java.util.HashMap;
import java.util.List;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;

import org.mybatis.jpetstore.domain.Shelter;
import org.mybatis.jpetstore.domain.Supplier;
import org.mybatis.jpetstore.service.ShelterService;

@SessionScope
public class ShelterActionBean extends AbstractActionBean {
  private static final String VIEW_SHELTER = "/WEB-INF/jsp/shelter/Shelter.jsp";
  private static final String VIEW_SHELTERS = "/WEB-INF/jsp/shelter/Shelters.jsp";
  private static final String VIEW_NEWSHELTER = "/WEB-INF/jsp/shelter/NewShelter.jsp";

  private List<Shelter> shelters;
  private HashMap<Integer, Supplier> suppliers;
  private Supplier supplier = new Supplier();
  private Shelter shelter = new Shelter();

  private String shelterid;

  @SpringBean
  private transient ShelterService shelterService;

  public Supplier getSupplier() {
    return supplier;
  }

  public Shelter getShelter() {
    return shelter;
  }

  public String getShelterid() {
    return shelterid;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }

  public void setShelter(Shelter shelter) {
    this.shelter = shelter;
  }

  public void setShelterid(String shelterid) {
    this.shelterid = shelterid;
  }

  public List<Shelter> getShelters() {
    return shelters;
  }

  public void setShelters(List<Shelter> shelters) {
    this.shelters = shelters;
  }

  public Resolution viewShelter() {
    shelter = new Shelter();
    supplier = new Supplier();
    shelter = shelterService.getShelterById(shelterid);
    supplier = shelterService.getSupplierById(shelter.getSuppid());
    return new ForwardResolution(VIEW_SHELTER);
  }

  public Resolution viewShelters() {
    shelters = shelterService.getShelters();
    suppliers = new HashMap<Integer, Supplier>();
    for (Shelter shelter_element : shelters) {
      Supplier supplier_element = shelterService.getSupplierById(shelter_element.getSuppid());
      if (!suppliers.containsKey(supplier_element.getSuppid()))
        suppliers.put(supplier_element.getSuppid(), supplier_element);
    }
    return new ForwardResolution(VIEW_SHELTERS);
  }

  public Resolution newShelterForm() {
    return new ForwardResolution(VIEW_NEWSHELTER);
  }

  public Resolution newShelter() {
    shelter = new Shelter();
    supplier = new Supplier();
    Supplier check_supplier = null;
    Shelter check_shelter = null;

    shelter.setSuppid(supplier.getSuppid());
    check_shelter = shelterService.getShelterById(shelter.getShelterid());
    check_supplier = shelterService.getSupplierById(shelter.getSuppid());

    if (check_shelter == null && check_supplier == null) {
      shelterService.insertShelter(shelter);
      shelterService.insertSupplier(supplier);
      return new RedirectResolution(ShelterActionBean.class, "viewShelters");
    } else {
      setMessage("already existed supplier. please try again.");
      return new ForwardResolution(ERROR);
    }
  }
}

package org.mybatis.jpetstore.web.actions;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;

import org.mybatis.jpetstore.domain.Shelter;
import org.mybatis.jpetstore.domain.Supplier;
import org.mybatis.jpetstore.service.ShelterService;

@SessionScope
public class ShelterActionBean extends AbstractActionBean {
  private static final String VIEW_SHELTER = "/WEB-INF/jsp/shelter/Shelter.jsp";

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

  public Resolution viewShelter() {
    shelter =new Shelter();
    supplier = new Supplier();
    shelter = shelterService.getShelterById(shelterid);
    supplier = shelterService.getSupplierById(shelter.getSuppid());
    return new ForwardResolution(VIEW_SHELTER);
  }
}

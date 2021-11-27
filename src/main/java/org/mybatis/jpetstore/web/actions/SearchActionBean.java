package org.mybatis.jpetstore.web.actions;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;
import org.mybatis.jpetstore.domain.*;
import org.mybatis.jpetstore.service.CatalogService;
import org.mybatis.jpetstore.service.SearchService;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@SessionScope
public class SearchActionBean extends AbstractActionBean{
    private static final String VIEW_SEARCH_FORM = "/WEB-INF/jsp/search/SearchForm.jsp";
    private static final String SEARCH_RESULT = "/WEB-INF/jsp/search/SearchResult.jsp";
    @SpringBean
    private transient SearchService searchService;
    @SpringBean
    private transient CatalogService catalogService;

    private static final List<String> CATEGORY_LIST;
    private static final List<String> FISH_WATER;
    private static final List<String> FISH_TEMPERATURE;
    private static final List<String> ALL_SIZE;
    private static final List<String> ALL_GENDER;
    private static final List<String> CAT_TEMPER;
    private static final List<String> CAT_DOG_FUR_LENGTH;
    private static final List<String> DOG_TEMPER;
    private static final List<String> BIRD_LIFESPAN;
    private static final List<String> BIRD_NOISE;
    private static final List<String> REPTILE_TEMPERATURE;
    private static final List<String> REPTILE_TYPE;

    static {
        CATEGORY_LIST = Collections.unmodifiableList(Arrays.asList("FISH", "DOGS", "REPTILES", "CATS", "BIRDS"));
        FISH_WATER = Collections.unmodifiableList(Arrays.asList("Salty Water", "Fresh Water"));
        FISH_TEMPERATURE = Collections.unmodifiableList(Arrays.asList("Cold Water", "Warm Water"));
        ALL_SIZE = Collections.unmodifiableList(Arrays.asList("Large", "Medium", "Small"));
        ALL_GENDER = Collections.unmodifiableList(Arrays.asList("Male", "Female"));
        CAT_TEMPER = Collections.unmodifiableList(Arrays.asList("Sensitive", "Friendly"));
        CAT_DOG_FUR_LENGTH = Collections.unmodifiableList(Arrays.asList("Short-Haired", "Long-Haired"));
        DOG_TEMPER = Collections.unmodifiableList(Arrays.asList("Active", "Relatively Calm"));
        BIRD_LIFESPAN = Collections.unmodifiableList(Arrays.asList("0~10","10~20", "20~50", "50~"));
        BIRD_NOISE = Collections.unmodifiableList(Arrays.asList("Loud", "Quiet"));
        REPTILE_TEMPERATURE = Collections.unmodifiableList(Arrays.asList("Hot", "Warm", "Cool"));
        REPTILE_TYPE = Collections.unmodifiableList(Arrays.asList("Testudines", "Squamata", "Crocodilia", "Sphenodontia"));
    }

    private List<Item> itemList;

    private Search search = new Search();

    public Search getSearch(){ return this.search; };
    public String getCategoryId(Search search){return search.getCategoryId();}
    public Long getMinimumPrice(Search search){return search.getMinimumPrice();}
    public Long getMaximumPrice(Search search){return search.getMaximumPrice();}
    public String getAttribute1(Search search){return search.getAttribute1();}
    public String getAttribute2(Search search){return search.getAttribute2();}
    public String getAttribute3(Search search){return search.getAttribute3();}
    public String getAttribute4(Search search){return search.getAttribute4();}
    public void setSearch(Search search){this.search = search;}
    public void setCategoryId(String categoryId){search.setCategoryId(categoryId);}
    public void setMinimumPrice(Long minimumPrice){search.setMinimumPrice(minimumPrice);}
    public void setMaximumPrice(Long maximumPrice){search.setMaximumPrice(maximumPrice);}
    public void setAttribute1(String attribute1){search.setAttribute1(attribute1);}
    public void setAttribute2(String attribute2){search.setAttribute2(attribute2);}
    public void setAttribute3(String attribute3){search.setAttribute3(attribute3);}
    public void setAttribute4(String attribute4){search.setAttribute4(attribute4);}

    public String getProductId(Product product){ return product.getProductId();}

    public List<Item> getItemList() { return itemList; }

    public List<String> getCategories() {return CATEGORY_LIST;}

    public List<String> getFishWater(){return FISH_WATER; }
    public List<String> getAllSize(){return ALL_SIZE; }
    public List<String> getAllGender(){return ALL_GENDER; }
    public List<String> getFishTemperature(){ return FISH_TEMPERATURE; }
    public List<String> getCatTemper(){return CAT_TEMPER;}
    public List<String> getCatDogFurLength(){return CAT_DOG_FUR_LENGTH;}
    public List<String> getDogTemper(){return DOG_TEMPER;}
    public List<String> getBirdLifeSpan(){return BIRD_LIFESPAN;};
    public List<String> getBirdNoise(){return BIRD_NOISE;}
    public List<String> getReptileTemperature(){return REPTILE_TEMPERATURE;};
    public List<String> getReptileType(){return REPTILE_TYPE;}

    public ForwardResolution viewSearchForm() {return new ForwardResolution(VIEW_SEARCH_FORM);}
    public Resolution continueSearch() {return new ForwardResolution(VIEW_SEARCH_FORM);}
    public Resolution searchItems(){
        itemList=null;
        List<Product> productList = catalogService.getProductListByCategory(search.getCategoryId());
        for(int i=0; i<productList.size(); i++) {
            String curProductId = productList.get(i).getProductId();
            search.setProductId(curProductId);
            List<Item> itemListTemp = searchService.searchItemByPriceAndCategory(search);
            if(itemList==null){
                itemList = itemListTemp;
            }
            else itemList.addAll(itemListTemp);
        }
        return new ForwardResolution(SEARCH_RESULT);
    }

    public void clear() {
        search = new Search();
    }
}
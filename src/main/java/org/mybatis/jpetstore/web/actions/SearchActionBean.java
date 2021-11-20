package org.mybatis.jpetstore.web.actions;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;
import org.mybatis.jpetstore.domain.*;
import org.mybatis.jpetstore.service.CatalogService;
import org.mybatis.jpetstore.service.SearchService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SessionScope
public class SearchActionBean extends AbstractActionBean{
    private static final String VIEW_SEARCH_FORM = "/WEB-INF/jsp/search/SearchForm.jsp";
    private static final String SEARCH_RESULT = "/WEB-INF/jsp/search/SearchResult.jsp";
    @SpringBean
    private transient SearchService searchService;
    @SpringBean
    private transient CatalogService catalogService;

    private static final List<String> CATEGORY_LIST;
    static {
        CATEGORY_LIST = Collections.unmodifiableList(Arrays.asList("FISH", "DOGS", "REPTILES", "CATS", "BIRDS"));
    }

    private List<Item> itemList;

    private Search search = new Search();

    public Search getSearch(){ return this.search; };
    public String getCategoryId(Search search){
        return search.getCategoryId();
    }
    public Long getMinimumPrice(Search search){return search.getMinimumPrice();}
    public Long getMaximumPrice(Search search){return search.getMaximumPrice();}
    public void setCategoryId(String categoryId){
        search.setCategoryId(categoryId);
    }
    public void setMinimumPrice(Long minimumPrice){
        search.setMinimumPrice(minimumPrice);
    }
    public void setMaximumPrice(Long maximumPrice){
        search.setMaximumPrice(maximumPrice);
    }
    public String getProductId(Product product){ return product.getProductId();}

    public List<Item> getItemList() {
        return itemList;
    }

    public List<String> getCategories() {
        return CATEGORY_LIST;
    }

    public ForwardResolution viewSearchForm() {
        return new ForwardResolution(VIEW_SEARCH_FORM);
    }
    public Resolution searchItem(){
        System.out.println(search.getCategoryId());
        System.out.println(search.getMinimumPrice());
        System.out.println(search.getMaximumPrice());
        List<Product> productList = catalogService.getProductListByCategory(search.getCategoryId());
        System.out.println(productList.size());
        for(int i=0; i<productList.size(); i++) {
            System.out.println(productList.get(i).getProductId());
            String curProductId = productList.get(i).getProductId();
            search.setProductId(curProductId);
            List<Item> itemListTemp = searchService.searchItemByPriceAndCategory(search);
            if(itemList==null){
                itemList = itemListTemp;
            }
            else itemList.addAll(itemListTemp);

        }
        for(int j=0; j<itemList.size(); j++){
            System.out.println(itemList.get(j).getItemId());
        }
        return new ForwardResolution(SEARCH_RESULT);
    }
    public void clear() {
        search = new Search();
        itemList = null;
    }
}

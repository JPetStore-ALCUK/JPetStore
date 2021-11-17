<%@ include file="../common/IncludeTop.jsp"%>

<jsp:useBean id="catalog"
             class="org.mybatis.jpetstore.web.actions.CatalogActionBean" />

<div id="BackLink"><stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.CatalogActionBean"
        event="viewCategory">
  <stripes:param name="categoryId"
                 value="${actionBean.product.categoryId}" />
  Return to ${actionBean.product.categoryId}
</stripes:link></div>

<div id="Catalog">


  <table>
    <tr>
      <th>Item ID</th>
      <th>Description</th>
      <th>Quantity</th>
    </tr>
    <c:forEach var="item" items="${actionBean.itemList}">
      <tr>
        <td><stripes:link
                beanclass="org.mybatis.jpetstore.web.actions.CatalogActionBean"
                event="viewItem">
          <stripes:param name="itemId" value="${item.itemId}" />
          ${item.itemId}
        </stripes:link></td>
        <td>${item.attribute1} ${item.attribute2} ${item.attribute3}
            ${item.attribute4} ${item.attribute5} ${product.name}</td>
        <td>${item.quantity}</td>
      </tr>
    </c:forEach>
    <tr>
      <td>
      </td>
    </tr>
  </table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>

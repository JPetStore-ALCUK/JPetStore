<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink"><stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.CatalogActionBean">
  Return to Main Menu</stripes:link></div>

<div id="Catalog">


  <table>
    <tr>
      <th>Item ID</th>
      <th>Description</th>
      <th>Quantity</th>
    </tr>
    <c:forEach var="lineitem" items="${actionBean.itemList}">
      <tr>
        <td><stripes:link
                beanclass="org.mybatis.jpetstore.web.actions.CatalogActionBean"
                event="viewItem">
          <stripes:param name="itemId" value="${lineitem.itemId}" />
          ${lineitem.itemId}
        </stripes:link></td>
        <td>${lineitem.attribute1} ${lineitem.attribute2} ${lineitem.attribute3}
            ${lineitem.attribute4} ${lineitem.attribute5} ${lineitem.name}</td>
        <td>${lineitem.quantity}</td>
      </tr>
    </c:forEach>
    <tr>
      <td>
      </td>
    </tr>
  </table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>
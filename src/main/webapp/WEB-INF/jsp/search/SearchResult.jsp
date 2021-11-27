<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2021-11-20
  Time: 오후 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>
<div id="Catalog">

    <table>
        <tr>
            <td>Item ID</td>
            <td>Description</td>
            <td>Cost</td>
            <td> </td>
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
                        ${item.attribute4} ${item.attribute5} ${item.name}</td>
                <td>${item.listPrice}</td>
                <td><stripes:link class="Button"
                                  beanclass="org.mybatis.jpetstore.web.actions.CartActionBean"
                                  event="addItemToCart">
                    <stripes:param name="workingItemId" value="${item.itemId}" />
                    Add to Cart
                </stripes:link></td>
            </tr>
        </c:forEach>

    </table>

</div>
<%@ include file="../common/IncludeBottom.jsp"%>
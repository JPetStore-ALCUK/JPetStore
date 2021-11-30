<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink"><stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.CatalogActionBean">
    Return to Main Menu</stripes:link></div>

<div id="Adopt">
<c:if test="${sessionScope.accountBean.authenticated}">
    <c:if test="${sessionScope.accountBean.account.username == 'manager'}">
        <stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean"
        event="insertForm">
            INSERT ANIMAL
        </stripes:link>
    </c:if>
</c:if>
    <table>
        <tr>
            <th>Item ID</th>
            <th>Category</th>
            <th>Description</th>
        </tr>
        <c:forEach var="adoptitem" items="${actionBean.itemList}">
            <tr>
                <td><stripes:link
                        beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean"
                        event="viewItem">
                    <stripes:param name="itemId" value="${adoptitem.itemId}" />
                    ${adoptitem.itemId}
                </stripes:link></td>
                <td>${adoptitem.category}</td>
                <td>${adoptitem.attribute}</td>
            </tr>
        </c:forEach>
    </table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>
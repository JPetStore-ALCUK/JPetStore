<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink"><stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.CatalogActionBean">
    Return to Main Menu</stripes:link></div>

<div id="Adopt">
<stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean"
        event="insertForm">
    INSERT ANIMAL
</stripes:link>
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
                <td>${lineitem.attribute}</td>
            </tr>
        </c:forEach>
    </table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>
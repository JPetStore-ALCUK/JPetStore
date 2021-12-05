<%@ include file="../common/IncludeTop.jsp"%>

<div id ="Shelters">
    <c:if test="${sessionScope.accountBean.authenticated}">
        <c:if test="${sessionScope.accountBean.account.username == 'manager'}">
            <stripes:link
                    beanclass="org.mybatis.jpetstore.web.actions.ShelterActionBean"
                    event="newShelterForm">
                New Shelter
            </stripes:link>
        </c:if>
    </c:if>
    <table>
        <tr>
            <th>Shelter ID</th>
            <th>Shelter Name</th>
        </tr>
        <c:forEach var="shelter" items="${actionBean.shelters}">
            <td><stripes:link
                    beanclass="org.mybatis.jpetstore.web.actions.ShelterActionBean"
                    event="viewShelter">
                <stripes:param name="shelterid" value="${shelter.shelterid}" />
                ${shelter.shelterid}
            </stripes:link></td>
            <td>${shelter.shelterid}</td>
        </c:forEach>
    </table>
</div>
<%@ include file="../common/IncludeBottom.jsp"%>
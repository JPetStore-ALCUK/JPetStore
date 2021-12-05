<%--
  Created by IntelliJ IDEA.
  User: jyr16
  Date: 2021-12-05
  Time: 오전 3:03
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink"><stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean"
        event="viewAdoptItem">
    Return to Adopt Item</stripes:link></div>

<div id="Adopt">
    <H2 style="color:white">Real-Time Supporters</H2>
    <span style="color:white">Thank you for support our adorable Friends!
    We will always remember your kindness.</span>
    <table>
        <tr>
            <th>Date</th>
            <th>Name</th>
            <th>Category</th>
            <th>Support Amount</th>
        </tr>
        <c:forEach var="supporter" items="${actionBean.supportList}">
            <tr>
                <td><fmt:formatDate value="${supporter.supportDate}" pattern="yyyy/MM/dd HH:mm:ss" /></td>
                <td>${supporter.billToFirstName} ${supporter.billToLastName}</td>
                <td>${supporter.supportCategory}</td>
                <td>${supporter.amount}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<%@ include file="../common/IncludeBottom.jsp"%>
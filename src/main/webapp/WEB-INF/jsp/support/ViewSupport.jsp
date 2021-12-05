<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2021-11-30
  Time: 오후 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink"><stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.CatalogActionBean">
    Return to Main Menu</stripes:link></div>

<div id="Catalog"><stripes:form
        beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean">
    <h2 style="color:white;" align="center">Thank you, your support goes towards a happy and safe life for these abandoned animals.</h2>
    <table>
        <tr>
            <th colspan="2">Support Details <fmt:formatDate value="${actionBean.support.supportDate}" pattern="yyyy/MM/dd HH:mm:ss" /></th>
        </tr>
        <tr>
            <td>First name:</td>
            <td>${actionBean.support.billToFirstName}</td>
        </tr>
        <tr>
            <td>Last name:</td>
            <td>${actionBean.support.billToLastName}</td>
        </tr>
        <tr>
            <td colspan="2">
                <table>
                    <tr>
                        <th>Item ID</th>
                        <th>Name</th>
                        <th>Category</th>
                        <th>Age</th>
                        <th>Gender</th>
                        <th>Description</th>
                        <th>Support Amount</th>
                    </tr>
                    <tr>
                        <td>${actionBean.support.supportItemId}</td>
                        <td>${actionBean.adoptitem.name}</td>
                        <td>${actionBean.support.supportCategory}</td>
                        <td>${actionBean.adoptitem.age}</td>
                        <td>${actionBean.adoptitem.gender}</td>
                        <td>${actionBean.adoptitem.attribute}</td>
                        <td>${actionBean.support.amount}</td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</stripes:form></div>
<%@ include file="../common/IncludeBottom.jsp"%>


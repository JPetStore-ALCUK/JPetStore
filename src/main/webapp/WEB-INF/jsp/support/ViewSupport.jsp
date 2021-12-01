<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2021-11-30
  Time: 오후 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog"><stripes:form
        beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean">

    <table>
        <tr>
            <th colspan="2">Support Details</th>
        </tr>
        <tr>
            <td>Card Type:</td>
            <td>${actionBean.support.cardType}</td>
        </tr>
        <tr>
            <td>Card Number:</td>
            <td>${actionBean.support.creditCard} * Fake
                number!</td>
        </tr>
        <tr>
            <td>Expiry Date (MM/YYYY):</td>
            <td>${actionBean.support.expiryDate}</td>
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
                        <th>Description</th>
                        <th>Support Amount</th>
                    </tr>
                    <tr>
                        <td>${actionBean.support.supportItemId}</td>
                        <td>${actionBean.support.supportCategory}</td>
                        <td>${actionBean.support.amount}</td>
                    </tr>
                </table>
            </td>
        </tr>

    </table>
    <stripes:submit name="confirmSupport" value="Confirm" />
</stripes:form></div>


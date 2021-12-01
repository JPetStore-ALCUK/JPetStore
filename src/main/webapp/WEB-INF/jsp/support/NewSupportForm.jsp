<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2021-11-30
  Time: 오후 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog"><stripes:form
        beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean">

    <table>
        <tr>
            <th colspan=2>Payment Details</th>
        </tr>
        <tr>
            <td>Card Type:</td>
            <td>
            <stripes:select name="support.cardType">
                <stripes:options-collection collection="${actionBean.cardTypeList}" />
            </stripes:select>
            </td>
        </tr>
        <tr>
            <td>Card Number:</td>
            <td><stripes:text name="support.creditCard" /> * Use a fake
                number!</td>
        </tr>
        <tr>
            <td>Expiry Date (MM/YYYY):</td>
            <td><stripes:text name="support.expiryDate" /></td>
        </tr>

        <tr>
            <td>First name:</td>
            <td><stripes:text name="support.billToFirstName" /></td>
        </tr>
        <tr>
            <td>Last name:</td>
            <td><stripes:text name="support.billToLastName" /></td>
        </tr>
        <tr>
            <td>Id:</td>
            <td><stripes:text name="support.supportItemId" /></td>
        </tr>
        <tr>
            <td>Support Amount:</td>
            <td><stripes:text name="support.amount" /></td>
        </tr>

    </table>
    <stripes:submit name="viewSupport" value="Continue" />

</stripes:form></div>

<%@ include file="../common/IncludeBottom.jsp"%>
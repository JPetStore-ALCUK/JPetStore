<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2021-12-05
  Time: 오전 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>

<jsp:useBean id="shelter"
             class="org.mybatis.jpetstore.web.actions.ShelterActionBean" />
<div id="Shelter">

    <table>
        <tr>
            <td><b> Shelter ID: </b></td>
            <td><b> ${actionBean.shelter.shelterid} </b></td>
        </tr>
        <tr>
            <td><b> Supplier ID: </b></td>
            <td><b> ${actionBean.shelter.suppid} </b></td>
        </tr>
        <tr>
            <td><b> Name: </b></td>
            <td><b>${actionBean.supplier.name}</b></td>
        </tr>
        <tr>
            <td><b> Status: </b></td>
            <td><b>${actionBean.supplier.status}</b></td>
        </tr>
        <tr>
            <td><b> Address 1: </b></td>
            <td><b>${actionBean.supplier.addr1}</b></td>
        </tr>
        <tr>
            <td><b> Address 2: </b></td>
            <td><b>${actionBean.supplier.addr2}</b></td>
        </tr>
        <tr>
            <td><b> City: </b></td>
            <td><b>${actionBean.supplier.city}</b></td>
        </tr>
        <tr>
            <td><b> State: </b></td>
            <td><b>${actionBean.supplier.state}</b></td>
        </tr>
        <tr>
            <td><b> zip: </b></td>
            <td><b>${actionBean.supplier.zip}</b></td>
        </tr>
        <tr>
            <td><b> Phone: </b></td>
            <td><b>${actionBean.supplier.phone}</b></td>
        </tr>
        <tr>
            <td><b> Total Support: </b></td>
            <td><b>${actionBean.shelter.total_support}</b></td>
        </tr>
    </table>

</div>
<%@ include file="../common/IncludeBottom.jsp"%>

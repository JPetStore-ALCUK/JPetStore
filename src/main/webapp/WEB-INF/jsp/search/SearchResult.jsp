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
            <td>Description1</td>
            <td>Description2</td>
            <td>Description3</td>
            <td>Description4</td>
            <td>Cost</td>
        </tr>
        <c:forEach var="item" items="${actionBean.itemList}">
            <tr>
                <td>${item.itemId}</td>
                <td>${item.attribute1}</td>
                <td>${item.attribute2}</td>
                <td>${item.attribute3}</td>
                <td>${item.attribute4}</td>
                <td>${item.listPrice}</td>
            </tr>
        </c:forEach>

    </table>

</div>
<%@ include file="../common/IncludeBottom.jsp"%>
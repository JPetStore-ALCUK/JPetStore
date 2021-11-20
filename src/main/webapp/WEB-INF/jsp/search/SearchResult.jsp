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
            <td>Item Description</td>
        </tr>
        <c:forEach var="item" items="${actionBean.itemList}">
            <tr>
                <td>${item.itemId}</td>
                <td>${item.attribute1}</td>
            </tr>
        </c:forEach>

    </table>

</div>
<%@ include file="../common/IncludeBottom.jsp"%>
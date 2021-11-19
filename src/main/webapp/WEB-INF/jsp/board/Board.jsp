<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2021-11-19
  Time: 오후 6:48
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog">
    <table>
        <tr>
            <th>Writer</th>
            <th>Title</th>
            <th>Message</th>
            <th>Date</th>
        </tr>
        <c:forEach var="boardElement" items="${actionBean.boardElementList}">
            <tr>
                <td>${boardElement.writer}</td>
                <td>${boardElement.title}</td>
                <td>${boardElement.text}</td>
                <td>${boardElement.date}</td>
            </tr>
        </c:forEach>
    </table>

</div>
<div>
    <stripes:link class="Button"
                  beanclass="org.mybatis.jpetstore.web.actions.BoardActionBean"
                  event="postBoardElement">
        Post an Article
    </stripes:link>
</div>
<%@ include file="../common/IncludeBottom.jsp"%>


<%--

       Copyright 2010-2021 the original author or authors.

       Licensed under the Apache License, Version 2.0 (the "License");
       you may not use this file except in compliance with the License.
       You may obtain a copy of the License at

          http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing, software
       distributed under the License is distributed on an "AS IS" BASIS,
       WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
       See the License for the specific language governing permissions and
       limitations under the License.

--%>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2021-11-18
  Time: 오후 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="Board">
    <table>
        <tr>
            <th>id</th>
            <th>Writer</th>
            <th>Title</th>
            <th>Date</th>
        </tr>
        <c:forEach var="boardElement" items="${actionBean.boardElementList}">
            <tr>
                <!-- 게시물 아이디 또한 출력시켜서 거기에 링크를 걸음 -->
                <td><stripes:link
                        beanclass="org.mybatis.jpetstore.web.actions.BoardActionBean"
                        event="viewBoardElement">
                    <stripes:param name="boardId" value="${boardElement.id}" />
                    ${boardElement.id}
                </stripes:link></td>
                <td>${boardElement.writer}</td>
                <td>${boardElement.title}</td>
                <td>${boardElement.date}</td>
            </tr>
        </c:forEach>
    </table>

</div>
<div>
    <stripes:link class="Button"
                  beanclass="org.mybatis.jpetstore.web.actions.BoardActionBean"
                  event="viewNewBoardElementForm">
        Write New Post
    </stripes:link>
</div>
<%@ include file="../common/IncludeBottom.jsp"%>

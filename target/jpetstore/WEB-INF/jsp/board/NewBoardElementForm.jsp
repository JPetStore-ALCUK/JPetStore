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
  Time: 오후 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>
<div id="Catalog"><stripes:form
        beanclass="org.mybatis.jpetstore.web.actions.BoardActionBean">
    <table>
        <tr>
            <td>Title:</td>
            <td><stripes:text name="boardElement.title" /> </td>
        </tr>
        <tr>
            <td>Date:</td>
            <td>${actionBean.boardElement.date}</td>
        </tr>
        <tr>
            <td>Writer:</td>
            <td>
                <c:if test="${sessionScope.accountBean == null}">
                    <input type="text" name="boardElement.writer" value="NONAME">
                </c:if>
                <c:if test="${sessionScope.accountBean != null}">
                    <c:if test="${sessionScope.accountBean.authenticated}">
                        <input type="text" name="boardElement.writer" value="${sessionScope.accountBean.name}">
                    </c:if>
                    <c:if test="${!sessionScope.accountBean.authenticated}">
                        <input type="text" name="boardElement.writer" value="NONAME">
                    </c:if>
                </c:if>
            </td>
        <tr>
            <td>Text:</td>
            <td><stripes:text name="boardElement.text" /> </td>
        </tr>
    </table>
    <stripes:submit name="insertBoardElement" value="Upload" />
</stripes:form></div>

<%@ include file="../common/IncludeBottom.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2021-11-19
  Time: 오후 6:49
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>
<div id="Catalog"><stripes:form
        beanclass="org.mybatis.jpetstore.web.actions.BoardActionBean">
    <table>
        <tr>
            <td>Title:</td>
            <td><stripes:text name="newBoardElement.title" /> </td>
        </tr>
        <tr>
            <td>Message:</td>
            <td><stripes:text name="newBoardElement.message" /> </td>
        </tr>
    </table>
    <stripes:submit name="insertBoardElement" value="Upload" />
</stripes:form></div>

<%@ include file="../common/IncludeBottom.jsp"%>


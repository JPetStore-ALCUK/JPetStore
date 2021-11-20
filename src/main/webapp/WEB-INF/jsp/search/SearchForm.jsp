<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2021-11-20
  Time: 오후 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>
<div id="Catalog"><stripes:form
        beanclass="org.mybatis.jpetstore.web.actions.SearchActionBean">
        <table>
            <tr>Search with Details</tr>
            <tr>
                <td>
                    <stripes:text name="minimumPrice" size="14" />
                    <stripes:text name="maximumPrice" size="14" />
                </td>
            </tr>
            <tr>
                <td>Select Animal:</td>
                <td><stripes:select name="categoryId">
                    <stripes:options-collection collection="${actionBean.categories}" />
                </stripes:select></td>
            </tr>

        </table>

        <stripes:submit name="searchItem" value="Continue" />
    </stripes:form></div>
</div>
<%@ include file="../common/IncludeBottom.jsp"%>

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
        <tr><td>
            Minimum Price:
            <stripes:text name="minimumPrice" size="14" />
        </td></tr>
        <tr><td>
            Maximum Price:
            <stripes:text name="maximumPrice" size="14" />
        </td></tr>
        <tr><td>
            Select Animal:
            <stripes:select name="categoryId">
                <stripes:options-collection collection="${actionBean.categories}" />
            </stripes:select>
        </td></tr>

        </td>
    </table>
    <stripes:submit name="continueSearch" value="Continue" />
</stripes:form>
    <stripes:form
            beanclass="org.mybatis.jpetstore.web.actions.SearchActionBean">
        <table>
            <tr>
                <c:choose>
                <c:when test="${actionBean.search.categoryId eq 'FISH' }">
            <tr><td>Type of water:
                <stripes:select name="attribute1">
                    <stripes:options-collection collection="${actionBean.fishWater}" />
                </stripes:select></td></tr>
            <tr><td>Required Water Temperature:
                <stripes:select name="attribute2">
                    <stripes:options-collection collection="${actionBean.fishTemperature}" />
                </stripes:select></td></tr>
            <tr><td>Size:
                <stripes:select name="attribute3">
                    <stripes:options-collection collection="${actionBean.allSize}" />
                </stripes:select></td></tr>
            <tr><td>Gender:
                <stripes:select name="attribute4">
                    <stripes:options-collection collection="${actionBean.allGender}" />
                </stripes:select></td></tr>
            </c:when>

            <c:when test="${actionBean.search.categoryId eq 'CATS' }">
                <tr><td>Temper:
                    <stripes:select name="attribute1">
                        <stripes:options-collection collection="${actionBean.catTemper}" />
                    </stripes:select></td></tr>
                <tr><td>Fur Length:
                    <stripes:select name="attribute2">
                        <stripes:options-collection collection="${actionBean.catDogFurLength}" />
                    </stripes:select></td></tr>
                <tr><td>Size:
                    <stripes:select name="attribute3">
                        <stripes:options-collection collection="${actionBean.allSize}" />
                    </stripes:select></td></tr>
                <tr><td>Gender:
                    <stripes:select name="attribute4">
                        <stripes:options-collection collection="${actionBean.allGender}" />
                    </stripes:select></td></tr>
            </c:when>

            <c:when test="${actionBean.search.categoryId eq 'DOGS' }">
                <tr><td>Temper:
                    <stripes:select name="attribute1">
                        <stripes:options-collection collection="${actionBean.dogTemper}" />
                    </stripes:select></td></tr>
                <tr><td>Fur Length:
                    <stripes:select name="attribute2">
                        <stripes:options-collection collection="${actionBean.catDogFurLength}" />
                    </stripes:select></td></tr>
                <tr><td>Size:
                    <stripes:select name="attribute3">
                        <stripes:options-collection collection="${actionBean.allSize}" />
                    </stripes:select></td></tr>
                <tr><td>Gender:
                    <stripes:select name="attribute4">
                        <stripes:options-collection collection="${actionBean.allGender}" />
                    </stripes:select></td></tr>
            </c:when>

            <c:when test="${actionBean.search.categoryId eq 'BIRDS' }">
                <tr><td>Noise:
                    <stripes:select name="attribute1">
                        <stripes:options-collection collection="${actionBean.birdNoise}" />
                    </stripes:select></td></tr>
                <tr><td>Life Span:
                    <stripes:select name="attribute2">
                        <stripes:options-collection collection="${actionBean.birdLifeSpan}" />
                    </stripes:select></td></tr>
                <tr><td>Size:
                    <stripes:select name="attribute3">
                        <stripes:options-collection collection="${actionBean.allSize}" />
                    </stripes:select></td></tr>
                <tr><td>Gender:
                    <stripes:select name="attribute4">
                        <stripes:options-collection collection="${actionBean.allGender}" />
                    </stripes:select></td></tr>
            </c:when>

            <c:when test="${actionBean.search.categoryId eq 'REPTILES' }">
                <tr><td>Reptile Type:
                    <stripes:select name="attribute1">
                        <stripes:options-collection collection="${actionBean.reptileType}" />
                    </stripes:select></td></tr>
                <tr><td>Required Temperature:
                    <stripes:select name="attribute2">
                        <stripes:options-collection collection="${actionBean.reptileTemperature}" />
                    </stripes:select></td></tr>
                <tr><td>Size:
                    <stripes:select name="attribute3">
                        <stripes:options-collection collection="${actionBean.allSize}" />
                    </stripes:select></td></tr>
                <tr><td>Gender:
                    <stripes:select name="attribute4">
                        <stripes:options-collection collection="${actionBean.allGender}" />
                    </stripes:select></td></tr>
            </c:when>

            <c:otherwise>
                Select Options First
            </c:otherwise>
            </c:choose>
            </tr>
        </table>
        <stripes:submit name="searchItems" value="Let's Search" />
    </stripes:form></div>
</div>
<%@ include file="../common/IncludeBottom.jsp"%>
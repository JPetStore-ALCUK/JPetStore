<%--

       Copyright 2010-2016 the original author or authors.

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
<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink"><stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.CatalogActionBean">
    Return to Main Menu</stripes:link></div>

<div id="Adopt">

    <table>
        <tr>
            <td><b> ${actionBean.adoptitem.itemId} </b></td>
        </tr>
        <tr>
            <td><b>${actionBean.adoptitem.category}</b></td>
        </tr>
        <tr>
            <td><b>${actionBean.adoptitem.name}</b></td>
        </tr>
        <tr>
            <td><b>${actionBean.adoptitem.age}</b></td>
        </tr>
        <tr>
            <td><b>${actionBean.adoptite.gender}</b></td>
        </tr>
        <tr>
            <td><b>${actionBean.adoptitem.state}</b></td>
        </tr>
        <tr>
            <td><b>${actionBean.adoptitem.attribute}</b></td>
        </tr>
        <tr>
            <td><b>${actionBean.adoptitem.supportAmount}</b></td>
        </tr>
        <tr>
            <td><%-- <stripes:link class="Button"
                              beanclass="org.mybatis.jpetstore.web.actions.CartActionBean"
                              event="addItemToCart">
                <stripes:param name="workingItemId" value="${actionBean.adoptitem.itemId}" />
                Want to Support
            </stripes:link> --%>
                <stripes:button name="example" value="Want to Support"></stripes:button>
            </td>
        </tr>
        <tr>
            <td><%-- <stripes:link class="Button"
                              beanclass="org.mybatis.jpetstore.web.actions.CartActionBean"
                              event="addItemToCart">
                <stripes:param name="workingItemId" value="${actionBean.adoptitem.itemId}" />
                Want to Adopt
            </stripes:link>--%>
                <stripes:button name="example" value="Want to Adopt"></stripes:button>
            </td>
        </tr>
    </table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>




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
        beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean"
        event="viewAdoptItem">
    Return to Adopt Item</stripes:link></div>

<jsp:useBean id="catalog"
             class="org.mybatis.jpetstore.web.actions.AdoptActionBean" />

<div id="Adopt">

    <table>
        <tr>
            <td><b> Item ID: </b></td>
            <td><b> ${actionBean.adoptitem.itemId} </b></td>
        </tr>
        <tr>
            <td><b> Shelter ID: </b></td>
            <td><stripes:link
                    beanclass="org.mybatis.jpetstore.web.actions.ShelterActionBean"
                    event="viewShelter">
                <stripes:param name="shelterid" value="${actionBean.adoptitem.shelterid}" />
            <b>${actionBean.adoptitem.shelterid}</b>
            </stripes:link></td>
        </tr>
        <tr>
            <td><b> Category: </b></td>
            <td><b>${actionBean.adoptitem.category}</b></td>
        </tr>
        <tr>
            <td><b> Name: </b></td>
            <td><b>${actionBean.adoptitem.name}</b></td>
        </tr>
        <tr>
            <td><b> Age: </b></td>
            <td><b>${actionBean.adoptitem.age}</b></td>
        </tr>
        <tr>
            <td><b> Gender: </b></td>
            <td><b>${actionBean.adoptitem.gender}</b></td>
        </tr>
        <tr>
            <td><b> State: </b></td>
            <td><b>${actionBean.adoptitem.state}</b></td>
        </tr>
        <tr>
            <td><b> Attribute: </b></td>
            <td><b>${actionBean.adoptitem.attribute}</b></td>
        </tr>
        <tr>
            <td><b> Support Amount: </b></td>
            <td><b>${actionBean.adoptitem.supportAmount}</b></td>
        </tr>
    </table>
    <!-- support -->
    <stripes:link class="Button"
                  beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean"
                  event="newSupport">
        <stripes:param name="support.supportItemId" value="${actionBean.adoptitem.itemId}" />
        Want to Support
    </stripes:link>

    <!-- adopt -->
    <stripes:link class="Button"
                              beanclass="org.mybatis.jpetstore.web.actions.CartActionBean"
                              event="addAdoptItemToCart">
                <stripes:param name="workingAdoptItemId" value="${actionBean.adoptitem.itemId}" />
                Want to Adopt
            </stripes:link>


</div>

<%@ include file="../common/IncludeBottom.jsp"%>




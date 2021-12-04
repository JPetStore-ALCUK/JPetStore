<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink"><stripes:link
        beanclass="org.mybatis.jpetstore.web.actions.CatalogActionBean">
    Return to Main Menu</stripes:link></div>

<div id="Adopt">
    <stripes:form
        beanclass="org.mybatis.jpetstore.web.actions.AdoptActionBean">
    <table>
        <tr>
            <th colspan="3"> Adopt animal Form </th>
        </tr>
            <tr>
                <td>Item ID:</td>
                <td><stripes:text name="itemId" /></td>
            </tr>
            <tr>
                <td>Category:</td>
                <td><stripes:text name="category" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><stripes:text name="name" /></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><stripes:text name="age" /></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><stripes:text name="gender" /></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><stripes:text name="attribute" /></td>
            </tr>

    </table>
        <stripes:submit name="insertAnimal" value="Insert" />
        </stripes:form>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>
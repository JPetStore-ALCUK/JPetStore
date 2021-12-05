
<%@ include file="../common/IncludeTop.jsp"%>

<jsp:useBean id="catalog"
             class="org.mybatis.jpetstore.web.actions.BoardActionBean" />

<table>
    <tr>
        <th><b>Title: </b></th>
        <th>${actionBean.title}</th>
    </tr>
    <tr>
        <th><b>Upload Date: </b></th>
        <th>${actionBean.date}</th>
    </tr>
    <tr>
        <th><b>Writer: </b></th>
        <th>${actionBean.writer}</th>
    </tr>
    <tr>
        <th><b>Text: </b></th>
        <th>${actionBean.text}</th>
    </tr>
</table>
<%@ include file="../common/IncludeBottom.jsp"%>

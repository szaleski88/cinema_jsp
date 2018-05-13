<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@ include file="head.jsp"%>
<body>
<c:choose>
    <c:when test="${USER eq null}">
        <%@ include file="navbar_not_logged.jsp" %>
    </c:when>
    <c:otherwise>
        <%@ include file="navbar_logged_user.jsp" %>
    </c:otherwise>
</c:choose>
<!--główny kontener tresci-->
<div class="container-fluid">
    <div class="jumbotron banner">
        <h1>Witaj w kinie <span class="cinema_name">PROSIACZEK</span></h1>
        <p>projekt SDA, polskie literki: żźłóąęść</p>
    </div>


    <p>This is some text.</p>
    <p>This is another text.</p>


</div>


</body>
</html>
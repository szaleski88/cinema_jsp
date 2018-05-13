<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.sda.cinema.model.ErrorMessages" %>
<html lang="en">
<%@ include file="head.jsp"%>
<body>
<%@include file="navbar_not_logged.jsp" %>

<h1 align="center">Logowanie</h1>

<c:if test="${errorMessage ne null}">
    <c:choose>
        <c:when test="${errorMessage eq ErrorMessages.VALIDATION_ERROR}">
            <span class="error_message">Nieprawidłowe dane logowania</span>
        </c:when>
        <c:otherwise>
            <span class="error_message">Wystąpił nieoczekiwany błąd</span>
        </c:otherwise>
    </c:choose>
</c:if>
<form name="loginForm" method="post" action="/login">

    <div class="container-fluid" id="loginContainer">
        <div class="input-group">
            <input id="login" type="text" class="form-control" name="login" placeholder="login">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
        </div>
        <div class="input-group">
            <input id="password" type="password" class="form-control" name="password" placeholder="Hasło">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
        </div>
        <button id="loginbutton" type="submit">Zaloguj</button>
    </div>
</form>


</body>
</html>
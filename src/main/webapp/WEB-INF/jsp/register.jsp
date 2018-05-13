<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.sda.cinema.model.ErrorMessages" %>
<html lang="en">

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

<h1 align="center">Rejestracja </h1>
<c:if test="${errorMessage ne null}">
    <c:choose>
        <c:when test="${errorMessage eq ErrorMessages.INCORRECT_NAME}">
            <span class="error_message">Niepoprawne imię</span>
        </c:when>
        <c:when test="${errorMessage eq ErrorMessages.INCORRECT_SURNAME}">
            <span class="error_message">Niepoprawne nazwisko</span>
        </c:when>
        <c:when test="${errorMessage eq ErrorMessages.INCORRECT_EMAIL}">
             <span class="error_message">Niepoprawny email</span>
        </c:when>
        <c:when test="${errorMessage eq ErrorMessages.INCORRECT_LOGIN}">
            <span class="error_message">Niepoprawny login</span>
        </c:when>
        <c:when test="${errorMessage eq ErrorMessages.INCORRECT_PASSWORD}">
            <span class="error_message">Niepoprawne hasło</span>
        </c:when>
        <c:when test="${errorMessage eq ErrorMessages.INCORRECT_REPEATED_PASSWORD}">
            <span class="error_message">Niepoprawne powtórzone hasło</span>
        </c:when>
        <c:otherwise>
            <span class="error_message">Wystąpił nieoczekiwany błąd</span>
        </c:otherwise>
    </c:choose>
</c:if>


<form name="registerForm" method="POST" action="/register">
    <div class="container-fluid" id="loginContainer">
        <h2>Podaj swoje dane</h2>

        <div class="input-group">
            <input type="text" class="form-control" name="firstName" placeholder="Imię">
            <span class="input-group-addon"><i class="glyphicon glyphicon-userDto"></i></span>
        </div>
        <div class="input-group">
            <input type="text" class="form-control" name="lastName" placeholder="Nazwisko">
            <span class="input-group-addon"><i class="glyphicon glyphicon-userDto"></i></span>
        </div>
        <div class="input-group">
            <input type="text" class="form-control" name="login" placeholder="Login">
            <span class="input-group-addon"><i class="glyphicon glyphicon-userDto"></i></span>
        </div>
        <div class="input-group">
            <input id="email" type="text" class="form-control" name="email" placeholder="e-mail">
            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
        </div>
        <div class="input-group">
            <input id="password" type="password" class="form-control" name="password" placeholder="Hasło">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
        </div>
        <div class="input-group">
            <input type="password" class="form-control" name="repeatedPassword" placeholder="Powtórz Hasło">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
        </div>
        <button id="registerbutton" type="submit">Zarejestruj</button>
    </div>
</form>


</body>

</html>
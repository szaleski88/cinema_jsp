<%--
  Created by IntelliJ IDEA.
  User: zaleski
  Date: 12.05.2018
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/WEB-INF/cinema_main.html"><span class="cinema_name">(super nazwa)</span></a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="${pageContext.request.contextPath}/WEB-INF/cinema_main.html">Strona Główna</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="konto"><span class="glyphicon glyphicon-user"></span> <strong>${uzytkownik.login}</strong>
            </a></li>
        </ul>
    </div>
</nav>
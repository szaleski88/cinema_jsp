<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.sda.cinema.model.ErrorMessages" %>

<html lang="en">
<%@ include file="head.jsp"%>

<body>

<%@ include file="navbar_not_logged.jsp"%>

<h1 align="center">Dodaj nowy film</h1>

<form name="addMovieForm" method="post" action="/addMovie">
    <div class="container-fluid" id="addFilmContainer">
        <h2>Podaj dane filmu</h2>

        <div class="input-group">
            <input type="text" class="form-control" name="title" placeholder="Tytuł">
            <span class="input-group-addon"><i class="glyphicon glyphicon-facetime-video"></i></span>
        </div>

        <div class="input-group" name="genre">
            <%--tu lista z obiektu genre--%>

            <select class="form-control">
                <c:forEach items="${imiona}" var="imie">
                    <tr>
                        <td>
                                ${imie}
                        </td>
                    </tr>
                </c:forEach>
                <option>Komedia</option>
                <option>Dramat</option>
                <option>Dokument</option>
            </select>
            <span class="input-group-addon"><i class="glyphicon glyphicon-eye-open"></i></span>
        </div>

        <div class="input-group">
            <input type="textarea" class="form-control" name="description" placeholder="Opis filmu">
            <span class="input-group-addon"><i class="glyphicon glyphicon-info-sign"></i></span>
        </div>


        <div class="input-group">
            <input type="text" class="form-control" name="year" placeholder="Rok produkcji">
            <span class="input-group-addon"><i class="glyphicon glyphicon-sound-dolby"></i></span>
        </div>

        <div class="input-group">
            <input type="text" class="form-control" name="duration" placeholder="Czas trwania">
            <span class="input-group-addon"><i class="glyphicon glyphicon-time"></i></span>
        </div>


        <div class="input-group">
            <input type="textarea" class="form-control" name="cast" placeholder="Obsada">
            <span class="input-group-addon"><i class="glyphicon glyphicon-userDto"></i></span>
        </div>

        <button id="loginbutton" type="submit">Dodaj film</button>
    </div>
</form>


</body>

</html>
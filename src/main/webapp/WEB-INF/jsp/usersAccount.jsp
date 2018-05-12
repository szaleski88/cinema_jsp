<%@ page import="com.sda.cinema.dto.UserDto" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Your file css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/cinema_style.css" type="text/css"/>
    <%--<style>--%>
        <%--* {--%>
            <%--margin:0;--%>
            <%--padding:0;--%>
        <%--}--%>


        <%--body {--%>
            <%--background:#000000;--%>
            <%--font-size:200%;--%>
            <%--line-height:1em;--%>
            <%--color:#858585;--%>
        <%--}--%>
    <%--</style>--%>

    <title>JAKAS NAZWA KINA</title>
</head>
<body>
<!--Pasek nawigacyjny na gorze strony-->
<%@ include file="navbar_logged_user.jsp"%>

<div class="container-fluid">
    <div class="row content">
        <div class="col-sm-2 sidenav">
            <p><a href="#">Link</a></p>
            <p><a href="#">Link</a></p>
            <p><a href="#">Link</a></p>
        </div>
        <div class="col-sm-8 text-left">
            <h1>Dane Kontaktowe</h1>
            <div class="container bootstrap snippet">
                <div class="panel-body inf-content">
                    <div class="row">
                        <div class="col-md-4">
                            <img alt="" style="width:400px;" title="" class="img-circle img-thumbnail isTooltip"
                                 src="https://www.meme-arsenal.com/memes/a57de905943d7fb29d029a9f98d04408.jpg">
                            <ul title="Ratings" class="list-inline ratings text-center">
                                <li><a href="#"><span class="glyphicon glyphicon-star"></span></a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-star"></span></a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-star"></span></a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-star"></span></a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-star"></span></a></li>
                            </ul>
                        </div>
                        <div class="col-md-6">
                            <div class="table-responsive">
                                <table class="table table-condensed table-responsive table-userDto-information">
                                    <tbody>
                                    <tr>
                                        <td>
                                            <strong>
                                                <span class="glyphicon glyphicon-userDto  text-primary"></span>
                                                Imię
                                            </strong>
                                        </td>
                                        <td class="text-primary">
                                            ${userDto.imie}
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <strong>
                                                <span class="glyphicon glyphicon-cloud text-primary"></span>
                                                Nazwisko
                                            </strong>
                                        </td>
                                        <td class="text-primary">
                                            ${userDto.nazwisko}
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <strong>
                                                <span class="glyphicon glyphicon-envelope text-primary"></span>
                                                Email
                                            </strong>
                                        </td>
                                        <td class="text-primary">
                                            ${userDto.email}
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <strong>
                                                <span class="glyphicon glyphicon-calendar text-primary"></span>
                                                Dołączył
                                            </strong>
                                        </td>
                                        <td class="text-primary">
                                            ${userDto.dataUtworzenia}
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <strong>
                                                <span class="glyphicon glyphicon-asterisk text-primary"></span>
                                                Ilość punktów
                                            </strong>
                                        </td>
                                        <td class="text-primary">
                                            ${userDto.iloscPunktow}
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
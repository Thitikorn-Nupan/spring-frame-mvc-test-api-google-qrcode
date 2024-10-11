<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%-- position path static file same in servlet file --%>
    <%-- <mvc:resources mapping="/css/**"  location="dirstatic/css/"/> but must specify real name files --%>
    <%-- as "/css/style.css"  --%>
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" />" >
    <link rel="stylesheet" href="<c:url value="/css/home-style.css" />" >
    <link rel="icon" href="<c:url value="/image/logo.png" />" >
    <title>Test Qrcode Google Apis</title>
</head>

<body>
<!-- menu -->
<div>
    <nav class="navbar navbar-expand-lg navbar-light bg-light" >
        <div class="container-fluid">
            <a class="navbar-brand"  aria-disabled="true">Welcome To Spring Mvc</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link"  href="home">Home</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<!-- menu -->
<!-- form -->
<div class="container mt-3 p-lg-5 shadow">
    <form action="home" method="post">
        <div class="alert text-center">
            <strong>Test Qrcode Google Apis</strong>
        </div>
        <div class="">
            <div class="input-group-prepend">
                <label class="input-group-text" id="length-text">Length of Qr-Code</label>
            </div>
            <div class="input-group mb-3 mt-3">
                <div class="form-check form-check-inline">
                    <label class="form-check-label" >255 x 255</label>
                    <input class="form-check-input" type="radio" name="length" value="255x255" required>
                </div>
                <div class="form-check form-check-inline">
                    <label class="form-check-label" >355 x 355</label>
                    <input class="form-check-input" type="radio" name="length" value="355x355" required>
                </div>
                <div class="form-check form-check-inline">
                    <label class="form-check-label" >455 x 455</label>
                    <input class="form-check-input" type="radio" name="length" value="455x455" required>
                </div>
            </div>
        </div>

        <div class="">
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" >Infomation</label>
                </div>
                <input class="form-control" type="text" name="info"  placeholder="enter your info to getting  the qr code..." required>
            </div>
        </div>

        <%--<div class="">
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" >Choose the colors</label>
                </div>
                <input class="form-control-color" type="color" name="color" style="width: 1069px;;" required>
            </div>
        </div>--%>


        <div class="control-btn">
            <div class="btn-group">
                <input class="btn btn-outline-secondary" type="submit" value="send" name="send">
                <input class="btn btn-outline-secondary" type="reset" value="reset" name="reset">
            </div>
        </div>
    </form>
</div>
<!-- form -->

<!-- result -->
<c:if test="${qrcode != null}">
    <div class="container mt-3">
        <div class="alert text-center">
            <strong>${message}</strong>
        </div>
        <div class="shadow p-md-5 text-center" id="qrcode">
            <img src="${qrcode}">
        </div>
    </div>
</c:if>
<!-- result -->
</body>
</html>

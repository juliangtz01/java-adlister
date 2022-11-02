<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <%@include file="partials/navbar.html"%>
    <%! String name = "Duncan"; %>
    <h1><%= name %></h1>

    <h1>Welcome To The Site!</h1>
    <p>Path: <%= request.getRequestURL() %></p>
    <p>Query String: <%= request.getQueryString() %></p>
    <p>"name" parameter: <%= request.getParameter("name") %></p>
    <p>"method" attribute: <%= request.getMethod() %></p>
    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>

    <c:if test="${param.name == null}">
        <h1>No parameter of Name Found</h1>
    </c:if>

    <c:choose>
        <c:when test='${param.choice.equals("rock")}'>
            <h1>Rock Beats Paper!</h1>
        </c:when>
        <c:otherwise>
            <h1>You lose!</h1>
        </c:otherwise>
    </c:choose>

    <%
        String[] nationalParks = {"Rocky Mountain National Park", "Yellow Stone National Park", "Big Bend National Park", "Evergland National Park", "Yosemite National Park"};
        //adding array of string as request attribute to reference in Expression Language Syntax.
        request.setAttribute("nationalParksArray", nationalParks);
    %>

    <ul>
        <c:forEach items="${nationalParksArray}" var="nationalParks">
        <li>${nationalParks}</li>
        </c:forEach>
    </ul>

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

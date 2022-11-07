<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
    <h1>Current Ad Listing:</h1>
    <br>
    <c:forEach var="ads" items="${ads}">
        <div class="ads">
            <h2>${ads.title}</h2>
            <p>Description: ${ads.description}</p>
        </div>
    </c:forEach>
</body>
</html>

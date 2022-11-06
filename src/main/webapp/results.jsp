<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game Result</title>
</head>
<body>
  <c:choose>
    <c:when test="${result}">
      <h1>Winner Winner Chicken Dinner</h1>
    </c:when>
    <c:otherwise>
      <h1>Better Luck Next Time</h1>
    </c:otherwise>
  </c:choose>
  <a href="/guess">Play again?</a>
</body>
</html>

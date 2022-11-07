<%--
  Created by IntelliJ IDEA.
  User: juliangutierrez
  Date: 11/7/22
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Create A Product</h1>
    <form action="/products/create" method="post">
        <label for="name">Name</label>
        <input type="text" id="name" name="name">
        <br>
        <label for="price">Price</label>
        <input type="text" id="price" name="price">
        <br>
        <input type="submit">

    </form>
</body>
</html>

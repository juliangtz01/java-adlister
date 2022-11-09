<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration From</title>
</head>
<body>
    <form method="POST" action="/register">
        <label for="username">Username: </label>
        <input type="text" id="username" name="username" placeholder="Enter username">
        <br>
        <label for="email">Email: </label>
        <input type="text" id="email" name="email" placeholder="Enter your email">
        <br>
        <label for="password">Password: </label>
        <input type="password" id="password" name="password" placeholder="Enter a password">
        <br>
        <button type="submit">Register</button>
    </form>
</body>
</html>

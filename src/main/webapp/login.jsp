<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <!-- Bootstrap CSS -->
    <%@include file="partials/head.jsp"%>
</head>
<body>
    <%@include file="partials/navbar.jsp"%>

    <div class="container">
        <form method="POST" action="/login.jsp">
            <p></p>
            <label for="login">Username: </label>
            <input type="text" id="login" name="username" placeholder="Enter your username"/>
            <p></p>
            <label for="password">Password: </label>
            <input type="password" id="password" name="password" placeholder="Enter your password">
            <p></p>
            <button type="submit">Submit</button>
        </form>
    </div>

<%
    if (request.getMethod().equalsIgnoreCase("post"))
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("password"))
        {
            response.sendRedirect("/profile.jsp");
        }
    }
%>



<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

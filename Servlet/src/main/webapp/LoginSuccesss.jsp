<%--
  Created by IntelliJ IDEA.
  User: rootadmin
  Date: 11/05/22
  Time: 12:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Success Page</title>
</head>
<body>
    <h3>Hi<%=request.getAttribute("user") %>, Login Successful.</h3>
    <a href="login.html">Login Page</a>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
       <h1>Login Here</h1>
       <form action="loginController" method="post">
       email id: <input type="text" name="email">
       password: <input type="text" name="password">
       <input type="submit" value="login">
       </form>
</body>
</html>
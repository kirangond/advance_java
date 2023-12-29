<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
    <form action="addTwoNumber" method="post">
    Num1: <input type="text" name="num1">
    Num2: <input type="text" name="num2">
    <input type="submit" value="add">
    </form>
    <!-- fetch result after setting the value to resultUI -->
    <%
     if(request.getAttribute("resultUI")!=null)
     {
       out.println(request.getAttribute("resultUI"));
     }
    %>
     <%
     if(request.getAttribute("error_message")!=null)
     {
       out.println(request.getAttribute("error_message"));
     }
    %>
</body>
</html>
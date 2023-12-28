<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>include tag</title>
</head>
 <%@include file="resume.txt" %>
<body>
    <h2>Include other .txt file into jsp</h2>
   
    <%@include file="company.txt" %>
</body>
</html>
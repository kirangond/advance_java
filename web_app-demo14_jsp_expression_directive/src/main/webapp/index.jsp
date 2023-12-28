
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- directive tag for importing -->
<%@ page import="java.util.Date"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page for expression, directive</title>
</head>
<body>

    <%
      int x = 10;
    %>
   <!-- expression tag evaluate statement and print--> 
    <%=x %>
    <%=new Date() %>
    
</body>
</html>
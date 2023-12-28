<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<!-- scriplet tag - we can write java code in it  but can't use access specifier and cab't create method in it-->
     <% 
       
       for(int i=0;i<10;i++)
       {
    	   out.println(i); //built in method
       }
     
     %>
     <br/>
     <%
        int x = 5;
       out.println(x);
     %>
     <br>
</body>
</html>
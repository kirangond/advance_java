<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page declarative tag</title>
</head>
<body>
  <h1>Use of declarative tag</h1>
  <!-- declarative tag - we can define access sepcifier but can't use built in variables -->
  <%!
      public int i = 10;
      public int test()
      {
    	  return 100;
      }
  %>
   <br/>
   <!-- scriplet tag we can define variable and built in methods, for and if condition -->
  <%
      out.println(i);
	  int x=test();
		   out.println(x);
  %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Registration details</title>
</head>
<body>
<h2>Update User</h2>
  <%
    if(request.getAttribute("update_message")!=null)
    {
    	out.println(request.getAttribute("update_message"));
    }
  %>
   <form action="updateController" method="post">
    

   <label for="ename">Email Id</label>
    <input type="text" id="email" name="emailname" placeholder="Your email id.." readonly value="<%=request.getAttribute("emailId") %>">

    <label for="cityname">City</label>
    <input type="text" id="city" name="cityname" placeholder="Your city name.." value="<%=request.getAttribute("cityName") %>">
    <input type="submit" value="update">
  </form>
</body>
</html>
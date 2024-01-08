<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ include file="menu.jsp" %>
<!-- we can't write html code in scriplet tag and html warnings are error -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Registration</title>
<link rel="stylesheet" href="css/table.css">
</head>
<body>
  <h1>User Registration details</h1>
  <table>
  <tr>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Email Name</th>
    <th>City Name</th>
    <th>Update</th>
    <th>Delete</th>
  </tr>
  <%
  ResultSet results = (ResultSet)request.getAttribute("results");
  while(results.next()) 
  { %>
  <tr>
	<td><%   out.println(results.getString(1)); %></td>
	<td><%  out.println(results.getString(2)); %></td>
	<td><%  out.println(results.getString(3)); %></td>
	<td><% out.println(results.getString(4)); %></td>
	<td><a href="updateController?emailid=<%=results.getString(3)%>&city=<%=results.getString(4)%>">Update</a></td>
	<!--  <td><a href="deleteController?name='kiran'">Delete</a></td> -->
	<!-- passsing variable along with link in url -->
	<td><a href="deleteController?emailid=<%=results.getString(3) %>">Delete</a></td>
	</tr>
  <% } %>
  
  </table>
</body>
</html>
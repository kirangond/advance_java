<%@ include file="menu.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/userRegistration.css">
<title>User Registration Page</title>
</head>
<body>
    <h3>New Registration form</h3>

<div class="container">
  <form action="userRegistration" method="post">
    <label for="fname">First Name</label>
    <input type="text" id="fname" name="firstname" placeholder="Your name..">

    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="lastname" placeholder="Your last name..">

   <label for="lname">Email Id</label>
    <input type="text" id="email" name="emailname" placeholder="Your email id..">

    <label for="cityname">City</label>
    <input type="text" id="city" name="cityname" placeholder="Your city name..">
    <input type="submit" value="register">
  </form>
</div>
     
</body>
</html>
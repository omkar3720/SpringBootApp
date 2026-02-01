<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
div {
	text-align: center;
	margin: 100px 475px;
	border: solid black;
	border-radius: 5px;
	font-family: sans-serif;
	font-size: x-large;
}
label {
	text-align: left;
	font-weight: bold;
	color: black;
}
input {
	box-sizing: border-box;
	border:thin solid black;
}
button {
	color: white;
	background-color: green;
	border: none;
	padding:12px;
	margin: 10px;
}
</style>
</head>
<body>
   <div>
      <h2>Login here</h2>
      <form action="login">


         <label for="username">Username:</label>
         <input type="text" id= "username" name="username" placeholder="Enter Username"><br>
         
         <label for="password">Password:</label>
         <input type="password" id= "password" name="password" placeholder="Enter password"><br>
         
         <button type="submit">Login</button><br>
         
         <a href="openregisterpage">Register Here..</a>
         
      </form>
   </div>
</body>
</html>

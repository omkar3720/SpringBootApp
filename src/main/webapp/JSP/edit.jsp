<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Here</title>
<style type="text/css">
div {
	text-align: center;
	margin: 100px 400px;
	border: solid black;
	border-radius: 5px;
	font-family: sans-serif;
	font-size: x-large;
	font-weight: bold;
	}
input {
	box-sizing: border-box;
	border:thin solid black;
}
button[type="submit"] 
{
	color: white;
	background-color: green;
	border: none;
	padding:12px;
}
</style>
</head>
<body>
    <div>
      <h2>Edit Form</h2>
      <form action="update">
      
               <input type="hidden" name="id" value="${au.id}">
            
         Name:<input type="text"  name="name" placeholder="Enter Name" value="${au.name}"><br>
          
       Address:<input type="text" name="address" placeholder="Enter Address" value="${au.address}"><br>
          
     Mobile No:<input type="number" name="mobileno" placeholder="Enter Mobile No" value="${au.mobileno}"><br>
 
      Username:<input type="text" name="username" placeholder="Enter Username" value="${au.username}"><br>
      
      Password:<input type="password" name="password" placeholder="Enter Password" value="${au.password}"><br>
      
              <input type="hidden" name="b.bid" value="${au.b.bid}">
              
    Book Name:<input type="text" name="b.bookname" placeholder="Enter Book Name" value="${au.b.bookname}"><br>
  
   Book Price:<input type="number" name="b.bookprice" placeholder="Enter Book Price" value="${au.b.bookprice}"><br>
    
          <button type="submit">Update</button>
          
      </form>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<style type="text/css">
div {
	text-align: center;
	font-family: sans-serif;

}
</style>
</head>
<body>
       <div>
           <h2 style="color: green;">Registration Details...</h2>
            <table align="center" border="2px">
              <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Address</th>
                <th>Mobileno</th>
                <th>Username</th>
                <th>Password</th>
                <th>BookName</th>
                <th>BookPrice</th>
                <th>Action</th>
              </tr>
              <c:forEach items="${data}" var="a1">
               <tr>
                 <td>${a1.id}</td>
                 <td>${a1.name}</td>
                 <td>${a1.address}</td>
                 <td>${a1.mobileno}</td>
                 <td>${a1.username}</td>
                 <td>${a1.password}</td>
                 <td>${a1.b.bookname}</td>
                 <td>${a1.b.bookprice}</td>
                 <td><a href="delete?id=${a1.id}">Delete</a>||<a href="edit?id=${a1.id}">Edit</a></td>
               </tr>
              </c:forEach>
            </table>
       </div>
</body>
</html>
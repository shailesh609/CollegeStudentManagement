<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>    
<html>
<head>
<title>
      Welcome To College Management System
</title>
<link href="/css/style.css" rel="stylesheet">
<link href="/css/custom.css" rel="stylesheet"> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>


<body style="background-color:powderblue;">
<div class="container">
<h1 align="center" style="color:Red;">Welcome To College Management System</h1>
<h3  style="text-align:right;margin-right:10px " ><a href=/mvc/home  class="btn">Home Page</a></h3><br>


<form  align="center" method="get" action="/mvc/getStudent" >
<h5><label for="college">Choose College:  </label></h5>
        
        <select id="college" name="colg" class="inpt"   required>
        <option value="" disabled selected>Choose a College Name</option>
    
         <c:forEach items= "${collegelist}" var="clg">
         
                <option value= ${clg.collegeid } required > 
                  ${ clg.name } 
                </option>
         </c:forEach>
        </select>
        <br><br>
        <input type="submit" value="Show Details" class="btn btn-primary">  
</form>
<br><br> 

 <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Gender</th>
      <th scope="col">Age</th>
    </tr>
  </thead>
  
   
  <tbody>
   <c:forEach items= "${studentlist}" var="std">
    <tr>
      <th scope="row">   ${std.id }       </th>
             <td>        ${std.name }          </td>
             <td>        ${std.gender }       </td> 
             <td>        ${std.age }           </td>
    </tr>
  </c:forEach>
  </tbody>
</table>




</div>

</body>
</html>
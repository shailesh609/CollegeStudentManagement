<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
<!DOCTYPE html>    
<html>
<head>
<title>
      Welcome To College Management System
</title>

<link href="/css/style.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>


<body style="background-color:powderblue;">
<div id="container">
<h1 align="center" style="color:Red;">Welcome To College Management System</h1><br><br> <br>
<h3  style="text-align:right;margin-right:10px " ><a href=/logout class="btn">Logout</a></h3>


<div align="center">
<h4>ID    <span style="color:blue;">  ${ student.id }    </span></h4>
<h4>Name    <span  style="color:blue;">   ${ student.name }     </span></h4>
<h4>Gender    <span  style="color:blue;">  ${ student.gender }      </span></h4>
<h4>Age     <span  style="color:blue;">   ${ student.age }     </span></h4>
<h4>College Name  <span  style="color:blue;">  ${ student.colg.name }      </span></h4>

</div>




</div>

</body>
</html>
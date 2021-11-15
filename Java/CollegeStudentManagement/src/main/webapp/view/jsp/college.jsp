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
<h1 align="center" style="color:Red;">Welcome To College Management System</h1>
<h3  style="text-align:right;margin-right:10px " ><a href=/mvc/home  class="btn">Home Page</a></h3><br>

 <form  method="post"  align="center" action="/mvc/addCollege">    
        <h5><label >College ID:     
        </label>  </h5>   
        <input type="number" name="collegeid"  placeholder="Enter College ID" required>    
        <br><br>    
        <h5> <label>Name:   
        </label> </h5>    
        <input type="text" name="name"  placeholder="Enter College Name" required>    
        <br><br>    
        <h5>  <label>Strength:      
        </label> </h5>    
        <input type="number" name="strength"  placeholder="Enter Student Strength"  required>    
        <br><br>    
        <input type="submit" value="Save Details" class="btn btn-primary">     
         
    </form>     


</div>

</body>
</html>
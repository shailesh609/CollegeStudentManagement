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
<h1 align="center" style="color:Red;">Welcome To College Management System</h1><br>

 <form  method="post"  align="center"  >  
     ${SPRING_SECURITY_LAST_EXCEPTION.message}
 
  <h3  style="color:blue;"><label > Login     
        </label>  </h3> <br><br>
   
        <h5><label > Username:     
        </label>  </h5>   
        <input type="text" name="username"  placeholder="Enter Username" required>    
        <br><br>    
        <h5> <label>Password:   
        </label> </h5>    
        <input type="password" name="password"  placeholder="Enter Password" required>    
        <br><br>    
         
        <input type="submit" value="Login" class="btn btn-primary">     
         
    </form>     


</div>

</body>
</html>
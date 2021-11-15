<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.WebApp.model.college"%>
<%@page import="java.util.ArrayList"%>
 
<!DOCTYPE html>    
<html>
<head>
<title>
      Welcome To College Management System
</title>
 
<link href="/css/custom.css" rel="stylesheet"> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 
</head>


<body style="background-color:powderblue;">
<div class="container">
<h1 align="center"  style="color:Red;">Welcome To College Management System</h1>
<h3  style="text-align:right;margin-right:10px " ><a href=/mvc/home  class="btn">Home Page</a></h3><br>

<%ArrayList<college> clgs=(ArrayList<college>)request.getAttribute("collegelist"); %>

 <form align="center" method="post"  action="/mvc/addStudent">    
        <h5><label >Student ID:     
        </label></h5>    
        <input type="number" name="id"  placeholder="Enter Student ID" class="inpt" required>    
        <br><br>    
       <h5> <label>Name:     
        </label></h5>    
        <input type="text" name="name"  placeholder="Enter Student Name" class="inpt" required>    
        <br><br>    
        <h5> <label>Age:      
         </label> </h5>   
        <input type="number" name="age"  placeholder="Enter Student Age" class="inpt" required>    
        <br><br>    
         <h5><label>Gender:      
         </label></h5> <br>   
        <label for="male"    class="radio-inline"><b>Male</b></label>
        <input type="radio"  name="gender" id="male" value="male"  required>&nbsp&nbsp&nbsp
        <label for="female"  class="radio-inline" ><b>Female</b></label>
        <input type="radio"  name="gender" id="female" value="female" required>   
        <br><br> 
        <h5><label for="college">Choose College:</label></h5>
        
        <select id="college" name="colg" class="inpt" required>
        <option value="" disabled selected>Choose a College Name</option>
        <%for(college clg:clgs){ %>
         
                <option 
                value= "<%= clg.getCollegeid() %>"   > 
                <%=clg.getName() %>
                </option>
            <%} %>
        </select>
        
        <br><br>
        <input type="submit" value="Save Details" class="btn btn-primary">     
         
    </form>      


</div>

</body>
</html>
<%@page import="java.sql.*"%>
<%  
    
    
    
       int id=Integer.parseInt(request.getParameter("id")); 
      
    
     try{ 
         
         Class.forName("com.mysql.jdbc.Driver");
         
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db","root","");
          Statement stmt=con.createStatement(); 
          
          ResultSet rs=stmt.executeQuery("select * from users where uid="+id);
          
          while(rs.next())
                  { 
      %>
                      
    
<html>
<head>
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
    </script>
    <style type="text/css">
    	body{
            background-image: url("pics/2.png");
            background-repeat: no-repeat;
            background-size: cover;
        }
        
    	.brandname {
            padding: 10px;
         background:linear-gradient(to right, #1e3c72, #2a5298); /* Blue gradient */
          color: #f0f8ff; /* White text */
           text-align: center;
            border-bottom: 3px solid #0056b3; /* Darker border for definition */
        }
        h2 {
           color: #28a745; /* Emerald Green */
         font-weight: bold;
         text-transform: uppercase; /* Optional for emphasis */
         margin-bottom: 20px; /* Space below the heading */
          text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */
        }

    	.formcontainer{
    		 width: 40%;
             padding: 20px; /* Add some padding for better spacing */
             margin-left:55%; /* Center the form */ 
             background-color: rgba(255, 255, 255, 0.1); /* White with 80% opacity */
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */
           border-radius: 8px; /* Rounded corners */
          backdrop-filter: blur(10px); /* Adds a frosted glass effect */
          
    	}



    </style> 
</head>
<body>
	<div class="jumbotron brandname">
   	       <h2>EduMatrix Academic CRM</h2>
     </div>
     <div class="container formcontainer">
     	<form method="post" action="UpdateProcessUser.jsp"> 
     		<h3 class="text-center">Update User</h3>
                
                <div class="form-group">
     		   	   <label>User Id</label>
                           <input type="number" name="userid" value="<%=rs.getInt("uid")%>" class="form-control" readonly>
     		   </div>
 
     		   <div class="form-group">
     		   	   <label>First Name</label>
     		   	   <input type="text" name="fname" value="<%=rs.getString("fname")%>" class="form-control">
     		   </div>
     		   <div class="form-group">
     		   	   <label>Last Name</label>
     		   	   <input type="text" name="lname" value="<%=rs.getString("lname")%>" class="form-control">
     		   </div>

     		   <div class="form-group">
     		   	   <label>Email</label>
     		   	   <input type="text" name="email" value="<%=rs.getString("email")%>"class="form-control">
     		   </div>

     		   <div class="form-group">
     		   	   <label>Phone No</label>
     		   	   <input type="text" name="phno" value="<%=rs.getString("phno")%>" class="form-control">
     		   </div>

     		   <div class="form-group">
     		   	   <label>User Name</label>
     		   	   <input type="text" name="uname" value="<%=rs.getString("uname")%>" class="form-control">
     		   </div>

     		   <div class="form-group">
     		   	   <label>Password</label>
     		   	   <input type="text" name="pass"  value="<%=rs.getString("pass")%>"class="form-control">
     		   </div>

     		   <div class="form-group">
     		   	   <button class="btn btn-info" type="submit">Update</button>
     		   	   <button class="btn btn-danger" type="reset">Reset</button>
     		   </div>
     	
  


     	</form>


     </div>

</body>
</html> 
            <% 
                  }
     } 
     catch(Exception e)
     {
         out.print(e); 
     }
     
   
    
    %>
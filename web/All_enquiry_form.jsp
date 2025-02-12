<%  
    
    String sname=(String)session.getAttribute("sname"); 

%>  
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
    </script> 
    <script type="text/javascript">
    	function fess()
    	{ 
    		var tech=document.f1.training_type.value; 

    		if(tech=="JobOriented") 
    		{
    			document.f1.fees.value=40000;

    		} 
    		else if(tech=="Internship") 
    		{
    			document.f1.fees.value=20000;

    		} 

    	}

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
               <p style="float:right; margin-top:-35px;">Welcome <span style="color:white"><%=sname%></span> </p>
     </div> 
     
	   <div class="container formcontainer"> 

	   	<h3 class="text-center">Student Enquiry Form</h3>

	   	<form method="post" action="All_enquiry_InsertData.jsp" name="f1">

	   		<div class="form-group">
	   			<label>First Name</label>
	   			<input type="text" name="fname" class="form-control">

	   		</div>

	   		<div class="form-group">
	   			<label>Last Name</label>
	   			<input type="text" name="lname" class="form-control">

	   		</div>

	   		<div class="form-group">
	   			<label>Email</label>
	   			<input type="text" name="email" class="form-control">

	   		</div>

	   		<div class="form-group">
	   			<label>Branch</label>
	   			<select name="branch" class="form-control">
	   				<option disabled selected >----Select Branch -----</option>
	   				<option value="ENTC">ENTC</option>
	   				<option value="IT">IT</option>
	   				<option value="COMP">COMP</option>
	   				<option value="CIVIL">CIVIL</option>
	   				<option value="Other">Other</option>
	   			</select>
	   		</div> 

	   		<div class="form-group">
                <label>Technology</label> 
                <input type="radio" name="tech" value="Java"> Java
                <input type="radio" name="tech" value="PHP"> PHP
                <input type="radio" name="tech" value="Python"> Python
                <input type="radio" name="tech" value="Web"> Web
            </div> 

            <div class="form-group"> 
            	<label>Training Type</label>
            	<input type="radio" name="training_type" value="JobOriented" onclick="fess()"> Job Oriented
            	<input type="radio" name="training_type" value="Internship" onclick="fess()"> Internship

            </div>



            <div class="form-group"> 
            	<label>Fees</label>
            	<input type="text" name="fees" class="form-control">
            </div>

            <div class="form-group"> 
            	<label>Status</label>
            	<input type="radio" name="status" value="followUp"> FollowUp
            	<input type="radio" name="status" value="Lead"> Lead

            </div>  
                    <div class="form-group"> 
                        <label>Date</label> 
                        <input type="date" name="date" class="form-control"/>
                     </div>

            <div class="form-group">
             <button type="submit" class="btn btn-info">Submit</button>
             <button type="reset" class="btn btn-danger">Reset</button>



            </div>



	   	</form>

	   </div>

</body>
</html>

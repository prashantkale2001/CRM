<%  
     String sname=(String)session.getAttribute("sname"); 
     

%>
<html>
<head>
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
    </script> 
    <style type="text/css">
    body{    
        background-color: #f8f9fa; /* Light grey background */ 
        background-image:url("pics/ad.png");
        
          }
    .brandname {
        padding: 10px;
        background:linear-gradient(to right, #1e3c72, #2a5298); /* Blue gradient */
       color: #f0f8ff; /* White text */
       text-align: center;
       border-bottom: 3px solid #0056b3; /* Darker border for definition */
        }


    	h3 {
         color: #007bff; /* Primary blue */
        font-weight: bold;
        margin-bottom: 20px;
        }

     h3.text-center {
        text-transform: uppercase; /* Optional for emphasis */
        letter-spacing: 1px; /* Optional for style */
         } 
        
    	.well:hover{
    		 background-color: #0056b3; /* Darker blue on hover */
                 color: #ffffff;
                  }
        .well{
            font-size: 18px; 
            background-color: #007bff; /* Vibrant blue */
            color: #ffffff; /* White text for contrast */
           border: none; /* Remove border for a clean look */
           transition: background-color 0.3s ease; /* Smooth hover effect */
        }   
        
        /* H2 Heading */
     h2 {
    color: #28a745; /* Emerald Green */
    font-weight: bold;
    text-transform: uppercase; /* Optional for emphasis */
    margin-bottom: 20px; /* Space below the heading */
    text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */
     }

/* Anchor Tags */
    a {
      color: #007bff; /* Primary Blue */
      text-decoration: none; /* Remove underline by default */
      transition: color 0.3s ease; /* Smooth transition on hover */
    }

    a:hover {
    color: #0056b3; /* Darker Blue on hover */
    text-decoration: underline; /* Underline on hover for accessibility */
    }

    </style> 
</head>
<body>
   <div class="jumbotron brandname">
   	       <h2>EduMatrix Academic CRM</h2>

               <a href="Logout.jsp"><p style="float:right; margin-top:-35px;padding:10px 10px">LogOut</p></a>
                <p style="float:right; margin-top:-35px; padding:10px 10px">Welcome <span style="color:white"><%=sname%></span> </p>


     </div> 
     <div class="container"> 
         <h3 class="text-center">Admin Dashboard</h3>
     	<div class="row">
            <div class="col-sm-3">
                <a href="CreateUser.html"><div class="well text-center">Create User</div></a>

            </div>

            <div class="col-sm-3">
                <a href="ShowUser.jsp"><div class="well text-center">Display User</div></a>

            </div>

            <div class="col-sm-3">
              <a href="ShowUser.jsp"><div class="well text-center">Update User</div></a>


            </div>

            <div class="col-sm-3">
               <a href="ShowUser.jsp"><div class="well text-center">Remove User</div></a>


            </div>
     	</div>


     	<div class="row">
            <div class="col-sm-3">
            	<a href="Show_FollowUp.jsp"><div class="well text-center">Follow-Up</div></a>

            </div>

            <div class="col-sm-3">
           <a href="RegisteredCandidate_Admin_dash.jsp"><div class="well text-center">Registered Candidate</div></a>


            </div>

            <div class="col-sm-3">
            	<div class="well text-center">Registered Company</div>

            </div>

            <div class="col-sm-3">
            	<div class="well text-center">Registered College</div>

            </div>
     	</div>

     	<div class="row">
            <div class="col-sm-3">
                <a href="pety_cash_entry_form.jsp"><div class="well text-center">Petly Cash Entery</div></a>

            </div>

            <div class="col-sm-3">
                <a href="DisplayPetlyCash.jsp"><div class="well text-center">Display Patly Cash</div></a>

            </div>

            <div class="col-sm-3">
            	<div class="well text-center">Payment Details</div>

            </div>

            <div class="col-sm-3">
            	<div class="well text-center">Vendor Payment</div>

            </div>
     	</div>


     	<div class="row">
            <div class="col-sm-3">
            	<div class="well text-center">Employee Payment</div>

            </div>

            <div class="col-sm-3">
            	<div class="well text-center">Approve Task request</div>

            </div>

            <div class="col-sm-3">
            	<div class="well text-center">Certification Approval</div>

            </div>

            <div class="col-sm-3">
            	<div class="well text-center">Ledger Book</div>

            </div>
     	</div>

     	<div class="row">
            <div class="col-sm-3">
            	<div class="well text-center">Display Issue Certification</div>

            </div>

            <div class="col-sm-3">
            	<div class="well text-center">Payment Details</div>

            </div>

            <div class="col-sm-3">
            	<div class="well text-center">Registered Vendor</div>

            </div>

            <div class="col-sm-3">
            	<div class="well text-center">PIP Candidate</div>

            </div>
     	</div>


     </div>

</body>
</html>
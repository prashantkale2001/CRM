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
    <script type="text/javascript"> 

    	function showBill()
    	{ 
    		var rate=document.f1.prate.value; 
    		var qty=document.f1.pqty.value; 

    		document.f1.pbill.value=rate*qty;

    	} 

        function showDate() {
            const today = new Date();
            const formattedDate = today.toISOString().split('T')[0];
            document.getElementById('date').value = formattedDate;
        };




    </script>
</head>
<body onload="showDate()">  
           <div class="jumbotron brandname">
   	       <h2>Edumatrix Education CRM</h2>
     </div>
 
	    <div class="container formcontainer">
                <form method="post" name="f1" action="PetyCashEntry.jsp">  
	    		<h3 class="text-center">Petly Cash Entry</h3>

	    		<div class="form-group">
	    			<label>Purchase Date</label>
                    <input type="date" name="pdate" class="form-control" id="date">

	    		</div>

	    		<div class="form-group">
	    			<label>Product Name</label>
                    <input type="text" name="pname" class="form-control">

	    		</div> 

	    		<div class="form-group">
	    			<label>Product Rate</label>
                    <input type="text" name="prate" class="form-control">

	    		</div> 

	    		<div class="form-group">
	    			<label>Product Qty</label>
                    <input type="text" name="pqty" class="form-control" onkeyup="showBill()">

	    		</div>

	    		<div class="form-group">
	    			<label>Product Bill</label>
                    <input type="text" name="pbill" class="form-control">

	    		</div> 

	    		<div class="form-group">
	    			<label>Purchased By</label>
                    <input type="text" name="purchasedby" class="form-control" value="<%=sname%>">

	    		</div> 

	    		<div>
                            <button class="btn btn-success" type="submit">Add Entry</button>
                            <button class="btn btn-danger" type="reset">Reset</button>


	    		</div>



	    	</form>



	    </div>

</body>
</html>
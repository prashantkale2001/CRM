<%@page import="java.sql.*"%> 

<%  
     String sname=(String)session.getAttribute("sname"); 
     

%>
<% 
 try{ 
        
        Class.forName("com.mysql.jdbc.Driver"); 
        
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db","root","");   
       
       Statement stmt=con.createStatement(); 
       
       ResultSet rs=stmt.executeQuery("select * from petlyentry");
        
       
       
         
 
  
 %> 
 <head>
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
    </script> 
    <style>
     body {
      font-family: Arial, sans-serif;
    /*background: linear-gradient(to right, #6a11cb, #2575fc);  Gradient background */
    background-image:url("pics/ad.png");
    color: #343a40; /* Text color */
    margin: 0;
    padding: 0;
}
h3 {
         color: #007bff; /* Primary blue */
        font-weight: bold;
        margin-bottom: 20px;
        }
 .brandname {
    padding: 10px;
    background:linear-gradient(to right, #1e3c72, #2a5298); /* Blue gradient */
      color: #f0f8ff; /* White text */
    text-align: center;
    border-bottom: 3px solid #0056b3; /* Darker border for definition */
    margin-bottom: 20px;
}
.table {
    background: #fff; /* White background for the table */
    border-radius: 8px;
    overflow: hidden; /* For rounded corners */
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow */
}

.table-bordered th {
    background-color: #007bff; /* Header background */
    color: #fff; /* Header text color */
    text-align: center;
    font-size: 16px;
}

.table-bordered td {
    text-align: center;
    vertical-align: middle;
    padding: 10px;
}

.table-bordered tr:nth-child(even) {
    background-color: #f9f9f9; /* Alternating row color */
}

.table-bordered tr:hover {
    background-color: #e9ecef; /* Highlight on hover */
}

/* Centered Container */
.container.text-center {
    margin-top: 20px;
}
    </style>
 </head>
 
 
 <div class="jumbotron brandname">
   	       <h2>EduMatrix Academic CRM</h2> 
               <p style="float:right; margin-top:-35px;">Welcome <span style="color:white"><%=sname%></span> </p>
     </div> 
 
  <a href="Admin_DB.jsp" class="btn btn-primary" style="margin-bottom: 10px">Go To Dashboard</a>
        <table class="table table-bordered">
            <h3 class="text-center">Petly Cash Info</h3>
            <tr bgcolor="skyblue">
                <th>Sr.No</th>
                <th>Purchase Date</th>
                <th>Product Name</th>
                <th>Product Rate</th>
                <th>Product Qty</th>
                <th>Product Bill</th>
                <th>Purchased By</th>
                <th colspan="2">Action</th>
            </tr>
<%
        while (rs.next()) {
%>
            <tr>
                <td><%= rs.getInt("sr.no") %></td>
                <td><%= rs.getString("pdate") %></td>
                <td><%= rs.getString("pname") %></td>
                <td><%= rs.getInt("prate") %></td>
                <td><%= rs.getInt("pqty") %></td>
                <td><%= rs.getInt("pbill") %></td>
                <td><%= rs.getString("purchasedby") %></td>
                <td> <a href="" class="btn btn-danger">Delete</a></td>
                <td> <a href="" class="btn btn-primary">Update</a></td>
            </tr>
<%
        }
        con.close();
    } catch (Exception e) {
        out.println("Connection failed: " + e.getMessage());
    }
%>
        </table> 
       
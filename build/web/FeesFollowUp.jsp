<%@include file="header.html" %>  
<div class="container"> 
    <div class="row"> 
        <div class="col-sm-6">
       <a class="btn btn-info" href="emp_dashboard.jsp">Go To Dashboard</a>
       </div>
        <div class="col-sm-6">
       <h3> Fees FollowUp Info</h3> 
        </div>
   </div>
 </div>

<%@page import="java.sql.*" %> 
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
    /* Table Styling */
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

</style>

<%   
    try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db", "root", "");  
         
         Statement stmt=con.createStatement(); 
         String q="select id,fname,lname,technology,fees,d1,in1,status1,d2,in2,status2,d3,in3,status3,d4,in4,status4 from registered_students2 where in1>0 and in2>0 and in3>0 and in4>0";
         
         ResultSet rs=stmt.executeQuery(q);  
         
         %>  

         <div class="container-fluid" style="margin:10px">

         <table class="table table-bordered" cellpadding="20"> 
            <tr bgcolor="skyblue"> 
                <th class="text-center">Student Id</th>
                 <th class="text-center">First Name</th>
                <th class="text-center">Last Name</th>
                <th class="text-center">Technology</th>
                <th class="text-center">Total Fees</th>
                <th class="text-center">Date</th> 
                <th class="text-center">All Installment</th> 
                <th class="text-center">Status</th>
                <th colspan="2" class="text-center">Action</th>

            </tr> 
         
        <% while(rs.next())
         { 
             %>  
             
              <tr> 
                <td class="text-center"><%=rs.getInt("id")%></td>
                <td class="text-center"><%=rs.getString("fname")%></td>
                <td class="text-center"><%=rs.getString("lname")%></td>
                <td class="text-center"><%=rs.getString("technology")%></td>
                <td class="text-center"><%=rs.getString("fees")%></td>
                <td class="text-center"><p><%=rs.getString("d1")%></p>
                    <p><%=rs.getString("d2")%></p>
                    <p><%=rs.getString("d3")%></p> 
                    <p><%=rs.getString("d4")%></p>
                </td> 
                <td class="text-center">
                    <p><%=rs.getInt("in1")%></p>
                    <p><%=rs.getInt("in2")%></p>
                    <p><%=rs.getInt("in3")%></p>
                    <p><%=rs.getInt("in4")%></p>

                </td>
                
                <td class="text-center">
                    <p><%=rs.getString("status1")%></p>
                    <p><%=rs.getString("status2")%></p>
                    <p><%=rs.getString("status3")%></p>
                    <p><%=rs.getString("status4")%></p>

                </td>
               
                
                 <td class="text-center"><a href="#" class="btn btn-info">Update</a></td>
                 <td class="text-center"><a href="#" class="btn btn-danger">Delete</a></td>





                
                
            </tr> 
             
             
             
        <% } 
       
        
    }  
    catch(Exception e)
    {
        System.out.println(e); 
    }



%> 
         </table> 
         </div>
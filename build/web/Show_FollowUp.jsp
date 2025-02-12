<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
    </script>  
    <style type="text/css"> 
        
        /* General Page Styling */
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


/* Jumbotron Branding */
.brandname {
    padding: 10px;
    background:linear-gradient(to right, #1e3c72, #2a5298); /* Blue gradient */
      color: #f0f8ff; /* White text */
    text-align: center;
    border-bottom: 3px solid #0056b3; /* Darker border for definition */
    margin-bottom: 20px;
}

/* Buttons */
.btn {
    border-radius: 5px; /* Rounded buttons */
    font-size: 14px;
    padding: 10px 20px;
}

.btn-info {
    background-color: #17a2b8;
    border: none;
}

.btn-info:hover {
    background-color: #138496;
    color: #fff;
}

.btn-danger {
    background-color: #dc3545;
    border: none;
}

.btn-danger:hover {
    background-color: #c82333;
    color: #fff;
}

.btn-primary {
    background-color: #007bff;
    border: none;
}

.btn-primary:hover {
    background-color: #0056b3;
    color: #fff;
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

/* Centered Container */
.container.text-center {
    margin-top: 20px;
}

/* Welcome Text */
p {
    float: right;
    margin-top: -35px;
    font-size: 14px;
    color: white;
}

</style> 
  <script>  
            
            function hide()
            {
                document.getElementById("tableheading").style.display="none"; 
                
                
            }
        
        
        </script>
            
          

    
 </head> 
 <%  
                 String sname=(String)session.getAttribute("sname"); 

 
 %>

     <div class="jumbotron brandname">
   	       <h2>EduMatrix Academic CRM</h2> 
               <p style="float:right; margin-top:-35px;">Welcome <span style="color:white"><%=sname%></span> </p>
     </div>  
    
     
 
<%@page import="java.sql.*" %> 
<%@page import="java.time.LocalDate" %>

<%
    LocalDate today = LocalDate.now();
    String todayDate = today.toString(); // Converts to 'yyyy-MM-dd' 
    String status="FollowUp"; 
   

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db", "root", "");
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM all_enquiry WHERE date = ? AND status=?");
        pstmt.setString(1, todayDate);
        pstmt.setString(2, status);

        ResultSet rs = pstmt.executeQuery(); 
        
        
   %>
        <a href="emp_dashboard.jsp" class="btn btn-primary" style="margin-bottom: 10px">Go To Dashboard</a>
        <table class="table table-bordered">
            <h3 class="text-center">FollowUp Info</h3>
            <tr bgcolor="skyblue">
                <th>Sr.No</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Branch</th>
                <th>Technology</th>
                <th>Training Type</th>
                <th>Fees</th>
                <th>Status</th>
                <th>Date</th>
                <th colspan="2">Action</th>
            </tr>
<%
        while (rs.next()) {
%>
            <tr>
                <td><%= rs.getInt("sr.no") %></td>
                <td><%= rs.getString("fname") %></td>
                <td><%= rs.getString("lname") %></td>
                <td><%= rs.getString("email") %></td>
                <td><%= rs.getString("branch") %></td>
                <td><%= rs.getString("tech") %></td>
                <td><%= rs.getString("tr_type") %></td>
                <td><%= rs.getString("fees") %></td>
                <td><%= rs.getString("status") %></td>
                <td><%= rs.getString("date") %></td>
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
        
        <form>
        
         <div class="container text-center">
             <button  class="btn btn-info" name="btn1" >All Enquiry</button>
             <button  class="btn btn-info" name="btn2">1 week </button>
             <button  class="btn btn-info"name="btn3">15 Days</button>
             <button class="btn btn-info" name="btn4">1 Month</button>
             

         
     </div> 
        </form>  
        
      <% 
    
           String name = request.getParameter("btn1");
            String name2 = request.getParameter("btn2");
            String name3 = request.getParameter("btn3");
            String name4 = request.getParameter("btn4");


        
          LocalDate today1 = LocalDate.now();
          LocalDate oneWeekAgo = today1.plusDays(7); 
          LocalDate fifteenDayAgo=today1.plusDays(14);
          LocalDate onemonth=today1.plusDays(30);

          
         String todayDate1 = today1.toString(); // Converts to 'yyyy-MM-dd'
         String oneWeekDate = oneWeekAgo.toString(); 
         String fifteenDayAgoDate = fifteenDayAgo.toString();
         String onemonthDate = onemonth.toString();  



         String status1="FollowUp";

        try { 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db", "root", "");
            
            PreparedStatement pstmt2=null;
            ResultSet rs2=null;
            if(name!=null)
            {
                pstmt2=con2.prepareStatement("SELECT * FROM all_enquiry where status=?");
                pstmt2.setString(1,status); 

                rs2 = pstmt2.executeQuery();
            } 
            
            else if(name2!=null)
            {
                pstmt2=con2.prepareStatement("SELECT * FROM all_enquiry WHERE date between ? AND ? AND status=?");
                 pstmt2.setString(1,todayDate1 );
                 pstmt2.setString(2,oneWeekDate ); 
                 pstmt2.setString(3,status ); 

                 rs2 = pstmt2.executeQuery();

            } 
            
             else if(name3!=null)
            {
                pstmt2=con2.prepareStatement("SELECT * FROM all_enquiry WHERE date between ? AND ? AND status=?");
                 pstmt2.setString(1,todayDate1 );
                 pstmt2.setString(2,fifteenDayAgoDate );
                  pstmt2.setString(3,status ); 

                 rs2 = pstmt2.executeQuery();

            } 
            
            else if(name4!=null)
            {
                pstmt2=con2.prepareStatement("SELECT * FROM all_enquiry WHERE date between ? AND ? AND status=?");
                 pstmt2.setString(1,todayDate1 );
                 pstmt2.setString(2,onemonthDate );
                 pstmt2.setString(3,status ); 

                 rs2 = pstmt2.executeQuery();

            } 
            
            
             
%>
        
        <table class="table table-bordered" onload="hide()">
            <tr bgcolor="skyblue" id="tableheading" >
                <th>Sr.No</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Branch</th>
                <th>Technology</th>
                <th>Training Type</th>
                <th>Fees</th>
                <th>Status</th>
                <th>Date</th>
                <th colspan="2">Action</th>
            </tr>
<%
            while (rs2.next()) {
%>
            <tr>
                <td><%= rs2.getInt("sr.no") %></td>
                <td><%= rs2.getString("fname") %></td>
                <td><%= rs2.getString("lname") %></td>
                <td><%= rs2.getString("email") %></td>
                <td><%= rs2.getString("branch") %></td>
                <td><%= rs2.getString("tech") %></td>
                <td><%= rs2.getString("tr_type") %></td>
                <td><%= rs2.getString("fees") %></td>
                <td><%= rs2.getString("status") %></td>
                <td><%= rs2.getString("date") %></td>
                <td><a href="delete_entry.jsp?id=<%= rs2.getInt("sr.no") %>" class="btn btn-danger">Delete</a></td>
                <td><a href="update_entry.jsp?id=<%= rs2.getInt("sr.no") %>" class="btn btn-primary">Update</a></td>
            </tr>
<%
            }
            rs2.close();
            pstmt2.close();
            con2.close();
        } catch (Exception e) {
            
        }
    
%>
        </table>
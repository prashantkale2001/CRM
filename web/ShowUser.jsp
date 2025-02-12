<%@page import="java.sql.*" %> 
<%@include file="header.html" %> 
<style> 
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
<%
    try{ 
         
         Class.forName("com.mysql.jdbc.Driver");
         
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db","root","");
          
          Statement stmt=con.createStatement();
          
          ResultSet rs=stmt.executeQuery("select * from users"); 
          
          %>  
          <a href="Admin_DB.jsp" class="btn btn-primary" style="margin-bottom: 10px">Go To Dashboard</a>
          
          <table class="table table-boared"> 
              <tr bgcolor="skyblue">
                  <th>UserId</th>
                  <th>First Name</th>
                  <th>Last Name</th>
                  <th>Email</th>
                   <th>Phone no</th>
                  <th>Username</th>
                  <th>Password</th>
                  <th colspan="2">Action</th>
              </tr> 
          <%
          
          while(rs.next())
          { 
            %> 
            <tr>
                <td><%=rs.getInt("uid")%></td>
                <td><%=rs.getString("fname")%></td>
                <td><%=rs.getString("lname")%></td>
                <td><%=rs.getString("email")%></td>
                <td><%=rs.getString("phno")%></td>
                <td><%=rs.getString("uname")%></td>
                <td><%=rs.getString("pass")%></td> 
                <td><a href="DeleteUser.jsp?id=<%=rs.getInt("uid")%>" class="btn btn-danger">Delete</a></td>
                <td><a href="UpdateUser.jsp?id=<%=rs.getInt("uid")%>" class="btn btn-primary">Update</a></td>

            </tr>
          
          <%    
          } 
           
          con.close();
      }
          
          catch(Exception e)
                { 
                    out.println("Connction failed..........");
                  
                  
                  }
  
    %> 
          </table>
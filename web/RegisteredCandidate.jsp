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
<%@page import="java.sql.*" %>  

<div class="container-fluid" style="margin: 10px"><a href="emp_dashboard.jsp"><button class="btn btn-info">Go To Dashboard</button></a></div>

<div class="container-fluid text-center"> 
    <form>
        <button class="btn btn-info" name="java" type="submit">Java Candidate</button>
    <button class="btn btn-info" name="py" type="submit">Python Candidate</button>
    <button class="btn btn-info" name="php" type="submit">PHP Candidate</button>
    <button class="btn btn-info" name="web" type="submit">Web Candidate</button> 
    </form>

    
    
</div>

<% 
    String java=request.getParameter("java");
    String py=request.getParameter("py");
    String php=request.getParameter("php");
    String web=request.getParameter("web"); 
    
    String tech="Java";
    String tech1="Python";
    String tech2="PHP";
    String tech3="Web";


    try{
    Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db", "root", "");  
        
        PreparedStatement pstmt=null;
         ResultSet rs=null;   
         
         pstmt=con.prepareStatement("SELECT id,fname,lname,branch,email,phno,gender,technology,training_type,fees from registered_students2");
                rs = pstmt.executeQuery();
         
      if(java!=null)
      {  
        pstmt=con.prepareStatement("SELECT id,fname,lname,branch,email,phno,gender,technology,training_type,fees from registered_students2 where technology=?");
                pstmt.setString(1,tech);
                rs = pstmt.executeQuery();

       } 
      
      else if(py!=null)
      {  
        pstmt=con.prepareStatement("SELECT id,fname,lname,branch,email,phno,gender,technology,training_type,fees from registered_students2 where technology=?");
                pstmt.setString(1,tech1);
                rs = pstmt.executeQuery();

       } 
      
      else if(php!=null)
      {  
        pstmt=con.prepareStatement("SELECT id,fname,lname,branch,email,phno,gender,technology,training_type,fees from registered_students2 where technology=?");
                pstmt.setString(1,tech2);
                rs = pstmt.executeQuery();

       }  
      
      else if(web!=null)
      {  
        pstmt=con.prepareStatement("SELECT id,fname,lname,branch,email,phno,gender,technology,training_type,fees from registered_students2 where technology=?");
                pstmt.setString(1,tech3);
                rs = pstmt.executeQuery();

       } 
        %> 
        <table class="table table-bordered"> 
            <tr bgcolor="skyblue"> 
                <th>Student Id</th>
                 <th>First Name</th>
                <th>Last Name</th>
                <th>Branch</th>
                <th>Email</th>
                <th>Phone no</th>
                <th>Gender</th>
                <th>Technology</th>
                <th>Training Type</th>
                 <th>Fees</th> 
            </tr> 
       <%
         while(rs.next())
        {
            %> 
            <tr> 
                <td><%=rs.getInt("id")%></td>
                <td><%=rs.getString("fname")%></td>
                <td><%=rs.getString("lname")%></td>

                <td><%=rs.getString("branch")%></td>
                <td><%=rs.getString("email")%></td>
                <td><%=rs.getString("phno")%></td>
                <td><%=rs.getString("gender")%></td>
             <td><%=rs.getString("technology")%></td>
                <td><%=rs.getString("training_type")%></td>
                 <td><%=rs.getInt("fees")%></td>



                
                
            </tr> 
            <%
             
        }
    }  
    
    catch(Exception e)
    {
        
    }  
    %>
    </table>


<%@include file="header.html"%>
<%@page import="java.sql.*" %>
<% 
     String fname=request.getParameter("fname");
     String lname=request.getParameter("lname");
     String email=request.getParameter("email");
     String phno=request.getParameter("phno");
     String uname=request.getParameter("uname");
     String pass=request.getParameter("pass");  
     
     try{ 
         
         Class.forName("com.mysql.jdbc.Driver");
         
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db","root","");
          String sql="insert into users(fname,lname,email,phno,uname,pass)values(?,?,?,?,?,?)";
          
          PreparedStatement pstmt=con.prepareStatement(sql);
          
          pstmt.setString(1,fname);
          pstmt.setString(2,lname);
          pstmt.setString(3,email);
          pstmt.setString(4,phno);
          pstmt.setString(5,uname);
          pstmt.setString(6,pass); 
          
          pstmt.executeUpdate(); 
          
          con.close(); 
          
         }
     catch(Exception e)
     { 
//         out.println("Connection Failed");
         
     } 

%> 

<center style="margin-top:10"> 
    <h3>User Registered Successfully ............</h3>
    <a href="CreateUser.html" class="btn btn-success">Register User</a>
        <a href="ShowUser.jsp" class="btn btn-success">View User</a>


</center> 

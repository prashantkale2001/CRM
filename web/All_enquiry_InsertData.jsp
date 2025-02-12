<%@page import="java.sql.*" %>
<% 
     String fname=request.getParameter("fname");
     String lname=request.getParameter("lname");
     String email=request.getParameter("email");
     String branch=request.getParameter("branch");
     String tech=request.getParameter("tech");
     String training_type=request.getParameter("training_type"); 
     String fees=request.getParameter("fees");  
     String status=request.getParameter("status");  
     String date=request.getParameter("date");  

     
     
     try{ 
         
         Class.forName("com.mysql.jdbc.Driver");
         
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db","root","");
          String sql="insert into all_enquiry(fname,lname,email,branch,tech,tr_type,fees,status,date)values(?,?,?,?,?,?,?,?,?)";
          
          PreparedStatement pstmt=con.prepareStatement(sql);
          
          pstmt.setString(1,fname);
          pstmt.setString(2,lname);
          pstmt.setString(3,email);
          pstmt.setString(4,branch);
          pstmt.setString(5,tech);
          pstmt.setString(6,training_type); 
          pstmt.setString(7,fees); 
          pstmt.setString(8,status); 
          pstmt.setString(9,date); 


          
          pstmt.executeUpdate(); 
          
          con.close(); 
          response.sendRedirect("emp_dashboard.jsp");
          
         }
     catch(Exception e)
     { 
//         out.println("Connection Failed");
         
     } 

%> 

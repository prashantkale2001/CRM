<%@page import="java.sql.*" %>  

<%  
    
    int id=Integer.parseInt(request.getParameter("id")); 
    
     try{ 
         
         Class.forName("com.mysql.jdbc.Driver");
         
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db","root","");
          
          String sql="delete from users where uid="+id;
          
          PreparedStatement pstmt=con.prepareStatement(sql); 
          pstmt.executeUpdate(); 
          response.sendRedirect("ShowUser.jsp");
          con.close();
          
     }
     catch(Exception e)
     { 
         out.print(e);
         
     }
    
    %>
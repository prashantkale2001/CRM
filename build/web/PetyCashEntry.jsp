<%@page import="java.sql.*"%>
<%  
    
    String pdate=request.getParameter("pdate"); 
     String pname=request.getParameter("pname"); 
    int prate=Integer.parseInt(request.getParameter("prate")); 
    int pqty=Integer.parseInt(request.getParameter("pqty")); 
    int  pbill=Integer.parseInt(request.getParameter("pbill")); 
    String purchasedby=request.getParameter("purchasedby");  
    
    try{ 
        
        Class.forName("com.mysql.jdbc.Driver"); 
        
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db","root",""); 
       
       PreparedStatement pstmt=con.prepareStatement("Insert into petlyentry (pdate,pname,prate,pqty,pbill,purchasedby) values(?,?,?,?,?,?)"); 
       
       pstmt.setString(1,pdate);
       pstmt.setString(2,pname);
       pstmt.setInt(3,prate);
       pstmt.setInt(4,pqty);
       pstmt.setInt(5,pbill);
        pstmt.setString(6,purchasedby); 
        
        pstmt.executeUpdate();
        
        response.sendRedirect("Admin_DB.jsp"); 
        con.close();


        
    }
    catch(Exception e)
    {
        
    }

    
    

%>

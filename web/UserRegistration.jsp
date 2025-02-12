
<%
    String uname1 = request.getParameter("uname");
    String pass1 = request.getParameter("pass");

    if (uname1.equals("Admin") && pass1.equals("admin123")) {
            session.setAttribute("sname",uname1);

        response.sendRedirect("Admin_DB.jsp");

    }
    
    else if (uname1.equals("Pk") && pass1.equals("pk123")) { 
        
        session.setAttribute("sname",uname1);
        response.sendRedirect("emp_dashboard.jsp"); 
    }
    else{ 
     %> 
     
     <center style="color:red;margin-top:10%"> 
         <h3>Login Failed....</h3> 
         <a href="index.html" >Login Again</a>
         
         
     </center> 
     
     <%
        
    }
%>

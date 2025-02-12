package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class All_005fenquiry_005fInsertData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
 
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


      out.write(' ');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.time.LocalDate;

public final class Show_005fLead_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\r\n");
      out.write("    </script>  \r\n");
      out.write("    <style type=\"text/css\"> \r\n");
      out.write("        \r\n");
      out.write("       body {\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("    /*background: linear-gradient(to right, #6a11cb, #2575fc);  Gradient background */\r\n");
      out.write("    background-image:url(\"pics/ad.png\");\r\n");
      out.write("    color: #343a40; /* Text color */\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write("h3 {\r\n");
      out.write("         color: #007bff; /* Primary blue */\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* Jumbotron Branding */\r\n");
      out.write(".brandname {\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    background: linear-gradient(to right, #007bff, #0056b3); /* Blue gradient */\r\n");
      out.write("    color: #ffffff; /* White text */\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    border-bottom: 3px solid #0056b3; /* Darker border for definition */\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        </style> \r\n");
      out.write("       \r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write(" </head> \r\n");
      out.write(" ");
  
                 String sname=(String)session.getAttribute("sname"); 

 
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <div class=\"jumbotron brandname\">\r\n");
      out.write("   \t       <h2>EduMatrix Academic CRM</h2> \r\n");
      out.write("               <p style=\"float:right; margin-top:-35px;\">Welcome <span style=\"color:white\">");
      out.print(sname);
      out.write("</span> </p>\r\n");
      out.write("     </div>  \r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");

   
    String status="Lead"; 
   

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db", "root", "");
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM all_enquiry WHERE  status=?");
        pstmt.setString(1, status);

        ResultSet rs = pstmt.executeQuery(); 
        
        
   
      out.write("\r\n");
      out.write("        <a href=\"emp_dashboard.jsp\" class=\"btn btn-primary\" style=\"margin-bottom: 10px\">Go To Dashboard</a>\r\n");
      out.write("        <table class=\"table table-bordered\"> \r\n");
      out.write("            <h3 class=\"text-center\">Lead Info</h3>\r\n");
      out.write("            <tr bgcolor=\"skyblue\">\r\n");
      out.write("                <th>Sr.No</th>\r\n");
      out.write("                <th>First Name</th>\r\n");
      out.write("                <th>Last Name</th>\r\n");
      out.write("                <th>Email</th>\r\n");
      out.write("                <th>Branch</th>\r\n");
      out.write("                <th>Technology</th>\r\n");
      out.write("                <th>Training Type</th>\r\n");
      out.write("                <th>Fees</th>\r\n");
      out.write("                <th>Status</th>\r\n");
      out.write("                <th>Date</th>\r\n");
      out.write("                <th colspan=\"2\">Action</th>\r\n");
      out.write("            </tr>\r\n");

        while (rs.next()) {

      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print( rs.getInt("sr.no") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("fname") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("lname") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("email") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("branch") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("tech") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("tr_type") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("fees") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("status") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("date") );
      out.write("</td>\r\n");
      out.write("                <td> <a href=\"\" class=\"btn btn-danger\">Delete</a></td>\r\n");
      out.write("                <td> <a href=\"\" class=\"btn btn-primary\">Update</a></td>\r\n");
      out.write("            </tr>\r\n");

        }
        con.close();
    } catch (Exception e) {
        out.println("Connection failed: " + e.getMessage());
    }

      out.write("\r\n");
      out.write("        </table> ");
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

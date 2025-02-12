package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ShowUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.html");
  }

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

      out.write(' ');
      out.write('\n');
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    \t.brandname{\r\n");
      out.write("    \t\tpadding: 10px;\r\n");
      out.write("    \t\tbackground:linear-gradient(to right, #1e3c72, #2a5298); /* Blue gradient */\r\n");
      out.write("                color: #f0f8ff; /* White text */\r\n");
      out.write("    \t}\r\n");
      out.write("        </style> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"jumbotron brandname\">\r\n");
      out.write("   \t       <h2>EduMatrix Academic CRM</h2>\r\n");
      out.write("     </div>");
      out.write(" \n");
      out.write("<style> \n");
      out.write("           /* General Page Styling */\n");
      out.write("body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    /*background: linear-gradient(to right, #6a11cb, #2575fc);  Gradient background */\n");
      out.write("    background-image:url(\"pics/ad.png\");\n");
      out.write("    color: #343a40; /* Text color */\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("h3 {\n");
      out.write("         color: #007bff; /* Primary blue */\n");
      out.write("        font-weight: bold;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Jumbotron Branding */\n");
      out.write(".brandname {\n");
      out.write("    padding: 10px;\n");
      out.write("    background:linear-gradient(to right, #1e3c72, #2a5298); /* Blue gradient */\n");
      out.write("      color: #f0f8ff; /* White text */\n");
      out.write("    text-align: center;\n");
      out.write("    border-bottom: 3px solid #0056b3; /* Darker border for definition */\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Buttons */\n");
      out.write(".btn {\n");
      out.write("    border-radius: 5px; /* Rounded buttons */\n");
      out.write("    font-size: 14px;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-info {\n");
      out.write("    background-color: #17a2b8;\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-info:hover {\n");
      out.write("    background-color: #138496;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-danger {\n");
      out.write("    background-color: #dc3545;\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-danger:hover {\n");
      out.write("    background-color: #c82333;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-primary {\n");
      out.write("    background-color: #007bff;\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-primary:hover {\n");
      out.write("    background-color: #0056b3;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Table Styling */\n");
      out.write(".table {\n");
      out.write("    background: #fff; /* White background for the table */\n");
      out.write("    border-radius: 8px;\n");
      out.write("    overflow: hidden; /* For rounded corners */\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table-bordered th {\n");
      out.write("    background-color: #007bff; /* Header background */\n");
      out.write("    color: #fff; /* Header text color */\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table-bordered td {\n");
      out.write("    text-align: center;\n");
      out.write("    vertical-align: middle;\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table-bordered tr:nth-child(even) {\n");
      out.write("    background-color: #f9f9f9; /* Alternating row color */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table-bordered tr:hover {\n");
      out.write("    background-color: #e9ecef; /* Highlight on hover */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Centered Container */\n");
      out.write(".container.text-center {\n");
      out.write("    margin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Welcome Text */\n");
      out.write("p {\n");
      out.write("    float: right;\n");
      out.write("    margin-top: -35px;\n");
      out.write("    font-size: 14px;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("</style>\n");

    try{ 
         
         Class.forName("com.mysql.jdbc.Driver");
         
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db","root","");
          
          Statement stmt=con.createStatement();
          
          ResultSet rs=stmt.executeQuery("select * from users"); 
          
          
      out.write("  \n");
      out.write("          <a href=\"Admin_DB.jsp\" class=\"btn btn-primary\" style=\"margin-bottom: 10px\">Go To Dashboard</a>\n");
      out.write("          \n");
      out.write("          <table class=\"table table-boared\"> \n");
      out.write("              <tr bgcolor=\"skyblue\">\n");
      out.write("                  <th>UserId</th>\n");
      out.write("                  <th>First Name</th>\n");
      out.write("                  <th>Last Name</th>\n");
      out.write("                  <th>Email</th>\n");
      out.write("                   <th>Phone no</th>\n");
      out.write("                  <th>Username</th>\n");
      out.write("                  <th>Password</th>\n");
      out.write("                  <th colspan=\"2\">Action</th>\n");
      out.write("              </tr> \n");
      out.write("          ");

          
          while(rs.next())
          { 
            
      out.write(" \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getInt("uid"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("fname"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("lname"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("phno"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("uname"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("pass"));
      out.write("</td> \n");
      out.write("                <td><a href=\"DeleteUser.jsp?id=");
      out.print(rs.getInt("uid"));
      out.write("\" class=\"btn btn-danger\">Delete</a></td>\n");
      out.write("                <td><a href=\"UpdateUser.jsp?id=");
      out.print(rs.getInt("uid"));
      out.write("\" class=\"btn btn-primary\">Update</a></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("          \n");
      out.write("          ");
    
          } 
           
          con.close();
      }
          
          catch(Exception e)
                { 
                    out.println("Connction failed..........");
                  
                  
                  }
  
    
      out.write(" \n");
      out.write("          </table>");
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

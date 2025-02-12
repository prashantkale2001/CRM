package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class FeesFollowUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      out.write("<a class=\"btn btn-info\" href=\"emp_dashboard.jsp\">Go To Dashboard</a>\n");
      out.write(" \n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    /*background: linear-gradient(to right, #6a11cb, #2575fc);  Gradient background */\n");
      out.write("    background-image:url(\"pics/ad.png\");\n");
      out.write("    color: #343a40; /* Text color */\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}  \n");
      out.write("h3 {\n");
      out.write("         color: #007bff; /* Primary blue */\n");
      out.write("        font-weight: bold;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("    /* Table Styling */\n");
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
      out.write("</style>\n");
      out.write("\n");
   
    try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db", "root", "");  
         
         Statement stmt=con.createStatement(); 
         String q="select id,fname,lname,technology,fees,d1,in1,status1,d2,in2,status2,d3,in3,status3,d4,in4,status4 from registered_students2 where in1>0 and in2>0 and in3>0 and in4>0";
         
         ResultSet rs=stmt.executeQuery(q);  
         
         
      out.write(" \n");
      out.write("         <div class=\"container-fluid\" style=\"margin:10px\">\n");
      out.write("         <table class=\"table table-bordered\" cellpadding=\"20\"> \n");
      out.write("               <h3 class=\"text-center\">FollowUp Info</h3>\n");
      out.write("            <tr bgcolor=\"skyblue\"> \n");
      out.write("                <th class=\"text-center\">Student Id</th>\n");
      out.write("                 <th class=\"text-center\">First Name</th>\n");
      out.write("                <th class=\"text-center\">Last Name</th>\n");
      out.write("                <th class=\"text-center\">Technology</th>\n");
      out.write("                <th class=\"text-center\">Date</th> \n");
      out.write("                <th class=\"text-center\">All Installment</th> \n");
      out.write("                <th class=\"text-center\">Status</th>\n");
      out.write("                <th colspan=\"2\" class=\"text-center\">Action</th>\n");
      out.write("\n");
      out.write("            </tr> \n");
      out.write("         \n");
      out.write("        ");
 while(rs.next())
         { 
             
      out.write("  \n");
      out.write("             \n");
      out.write("              <tr> \n");
      out.write("                <td class=\"text-center\">");
      out.print(rs.getInt("id"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print(rs.getString("fname"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print(rs.getString("lname"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print(rs.getString("technology"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\"><p>");
      out.print(rs.getString("d1"));
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(rs.getString("d2"));
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(rs.getString("d3"));
      out.write("</p> \n");
      out.write("                    <p>");
      out.print(rs.getString("d4"));
      out.write("</p>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"text-center\">\n");
      out.write("                    <p>");
      out.print(rs.getInt("in1"));
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(rs.getInt("in2"));
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(rs.getInt("in3"));
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(rs.getInt("in4"));
      out.write("</p>\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td class=\"text-center\">\n");
      out.write("                    <p>");
      out.print(rs.getString("status1"));
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(rs.getString("status2"));
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(rs.getString("status3"));
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(rs.getString("status4"));
      out.write("</p>\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                 <td class=\"text-center\"><a href=\"#\" class=\"btn btn-info\">Update</a></td>\n");
      out.write("                 <td class=\"text-center\"><a href=\"#\" class=\"btn btn-danger\">Delete</a></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr> \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("        ");
 } 
       
        
    }  
    catch(Exception e)
    {
        System.out.println(e); 
    }




      out.write(" \n");
      out.write("         </table> \n");
      out.write("         </div>");
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

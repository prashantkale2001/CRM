package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class DisplayPetlyCash_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
  
     String sname=(String)session.getAttribute("sname"); 
     


      out.write('\n');
 
 try{ 
        
        Class.forName("com.mysql.jdbc.Driver"); 
        
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db","root","");   
       
       Statement stmt=con.createStatement(); 
       
       ResultSet rs=stmt.executeQuery("select * from petlyentry");
        
       
       
         
 
  
 
      out.write(" \n");
      out.write(" <head>\n");
      out.write("\t <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n");
      out.write("    </script> \n");
      out.write("    <style>\n");
      out.write("        .brandname{\n");
      out.write("    \t\tpadding: 10px;\n");
      out.write("    \t\tbackground-color: gold;\n");
      out.write("\n");
      out.write("    \t} \n");
      out.write("    </style>\n");
      out.write(" </head>\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" <div class=\"jumbotron brandname\">\n");
      out.write("   \t       <h2>EduMatrix Academic CRM</h2> \n");
      out.write("               <p style=\"float:right; margin-top:-35px;\">Welcome <span style=\"color:white\">");
      out.print(sname);
      out.write("</span> </p>\n");
      out.write("     </div> \n");
      out.write(" \n");
      out.write("  <a href=\"Admin_DB.jsp\" class=\"btn btn-primary\" style=\"margin-bottom: 10px\">Go To Dashboard</a>\n");
      out.write("        <table class=\"table table-bordered\">\n");
      out.write("            <h3 class=\"text-center\">Petly Cash Info</h3>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th>Sr.No</th>\n");
      out.write("                <th>Purchase Date</th>\n");
      out.write("                <th>Product Name</th>\n");
      out.write("                <th>Product Rate</th>\n");
      out.write("                <th>Product Qty</th>\n");
      out.write("                <th>Product Bill</th>\n");
      out.write("                <th>Purchased By</th>\n");
      out.write("                <th colspan=\"2\">Action</th>\n");
      out.write("            </tr>\n");

        while (rs.next()) {

      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( rs.getInt("sr.no") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("pdate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("pname") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getInt("prate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getInt("pqty") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getInt("pbill") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("purchasedby") );
      out.write("</td>\n");
      out.write("                <td> <a href=\"\" class=\"btn btn-danger\">Delete</a></td>\n");
      out.write("                <td> <a href=\"\" class=\"btn btn-primary\">Update</a></td>\n");
      out.write("            </tr>\n");

        }
        con.close();
    } catch (Exception e) {
        out.println("Connection failed: " + e.getMessage());
    }

      out.write("\n");
      out.write("        </table> \n");
      out.write("       ");
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

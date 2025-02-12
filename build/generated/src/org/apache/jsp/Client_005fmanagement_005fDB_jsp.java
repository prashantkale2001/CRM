package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Client_005fmanagement_005fDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \t\tbackground-color: gold;\r\n");
      out.write("    \t}\r\n");
      out.write("        </style> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"jumbotron brandname\">\r\n");
      out.write("   \t       <h2>EduMatrix Academic CRM</h2>\r\n");
      out.write("     </div>");
      out.write('\n');
  
    
    String sname=(String)session.getAttribute("sname"); 


      out.write("  \n");
      out.write("<style> \n");
      out.write("     a:hover{\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("    \t.well:hover{\n");
      out.write("    \t\t  background-color: limegreen; \n");
      out.write("                  }\n");
      out.write("        .well{\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body> \n");
      out.write("    <div class=\"container\">\n");
      out.write("     \t<div class=\"row\"> \n");
      out.write("            <h3 class=\"text-center\">Vendor  Management Dashboard</h3>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <a href=\"#\"><div class=\"well text-center\">Vendor Enquiry</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <a href=\"#\"><div class=\"well text-center\">Vendor FollowUp</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("              <a href=\"#\"><div class=\"well text-center\">Vendor Registration</div></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("              <a href=\"#\"><div class=\"well text-center\">Display Vendor</div></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div> \n");
      out.write("          \n");
      out.write("     \t\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</body>\n");
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

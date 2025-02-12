package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pety_005fcash_005fentry_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  
     String sname=(String)session.getAttribute("sname"); 
     


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n");
      out.write("    </script> \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    \t \n");
      out.write("             body{\n");
      out.write("            background-image: url(\"pics/2.png\");\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    \t.brandname {\n");
      out.write("            padding: 10px;\n");
      out.write("           background: linear-gradient(to right, #007bff, #0056b3); /* Blue gradient */\n");
      out.write("           color: #ffffff; /* White text */\n");
      out.write("           text-align: center;\n");
      out.write("            border-bottom: 3px solid #0056b3; /* Darker border for definition */\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("           color: #28a745; /* Emerald Green */\n");
      out.write("         font-weight: bold;\n");
      out.write("         text-transform: uppercase; /* Optional for emphasis */\n");
      out.write("         margin-bottom: 20px; /* Space below the heading */\n");
      out.write("          text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    \t.formcontainer{\n");
      out.write("    \t\t width: 40%;\n");
      out.write("             padding: 20px; /* Add some padding for better spacing */\n");
      out.write("             margin-left:55%; /* Center the form */ \n");
      out.write("             background-color: rgba(255, 255, 255, 0.1); /* White with 80% opacity */\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */\n");
      out.write("           border-radius: 8px; /* Rounded corners */\n");
      out.write("          backdrop-filter: blur(10px); /* Adds a frosted glass effect */\n");
      out.write("          \n");
      out.write("    \t}\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t\n");
      out.write("\n");
      out.write("    </style> \n");
      out.write("    <script type=\"text/javascript\"> \n");
      out.write("\n");
      out.write("    \tfunction showBill()\n");
      out.write("    \t{ \n");
      out.write("    \t\tvar rate=document.f1.prate.value; \n");
      out.write("    \t\tvar qty=document.f1.pqty.value; \n");
      out.write("\n");
      out.write("    \t\tdocument.f1.pbill.value=rate*qty;\n");
      out.write("\n");
      out.write("    \t} \n");
      out.write("\n");
      out.write("        function showDate() {\n");
      out.write("            const today = new Date();\n");
      out.write("            const formattedDate = today.toISOString().split('T')[0];\n");
      out.write("            document.getElementById('date').value = formattedDate;\n");
      out.write("        };\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body onload=\"showDate()\">  \n");
      out.write("           <div class=\"jumbotron brandname\">\n");
      out.write("   \t       <h2>Edumatrix Education CRM</h2>\n");
      out.write("     </div>\n");
      out.write(" \n");
      out.write("\t    <div class=\"container formcontainer\">\n");
      out.write("                <form method=\"post\" name=\"f1\" action=\"PetyCashEntry.jsp\">  \n");
      out.write("\t    \t\t<h3 class=\"text-center\">Petly Cash Entry</h3>\n");
      out.write("\n");
      out.write("\t    \t\t<div class=\"form-group\">\n");
      out.write("\t    \t\t\t<label>Purchase Date</label>\n");
      out.write("                    <input type=\"date\" name=\"pdate\" class=\"form-control\" id=\"date\">\n");
      out.write("\n");
      out.write("\t    \t\t</div>\n");
      out.write("\n");
      out.write("\t    \t\t<div class=\"form-group\">\n");
      out.write("\t    \t\t\t<label>Product Name</label>\n");
      out.write("                    <input type=\"text\" name=\"pname\" class=\"form-control\">\n");
      out.write("\n");
      out.write("\t    \t\t</div> \n");
      out.write("\n");
      out.write("\t    \t\t<div class=\"form-group\">\n");
      out.write("\t    \t\t\t<label>Product Rate</label>\n");
      out.write("                    <input type=\"text\" name=\"prate\" class=\"form-control\">\n");
      out.write("\n");
      out.write("\t    \t\t</div> \n");
      out.write("\n");
      out.write("\t    \t\t<div class=\"form-group\">\n");
      out.write("\t    \t\t\t<label>Product Qty</label>\n");
      out.write("                    <input type=\"text\" name=\"pqty\" class=\"form-control\" onkeyup=\"showBill()\">\n");
      out.write("\n");
      out.write("\t    \t\t</div>\n");
      out.write("\n");
      out.write("\t    \t\t<div class=\"form-group\">\n");
      out.write("\t    \t\t\t<label>Product Bill</label>\n");
      out.write("                    <input type=\"text\" name=\"pbill\" class=\"form-control\">\n");
      out.write("\n");
      out.write("\t    \t\t</div> \n");
      out.write("\n");
      out.write("\t    \t\t<div class=\"form-group\">\n");
      out.write("\t    \t\t\t<label>Purchased By</label>\n");
      out.write("                    <input type=\"text\" name=\"purchasedby\" class=\"form-control\" value=\"");
      out.print(sname);
      out.write("\">\n");
      out.write("\n");
      out.write("\t    \t\t</div> \n");
      out.write("\n");
      out.write("\t    \t\t<div>\n");
      out.write("                            <button class=\"btn btn-success\" type=\"submit\">Add Entry</button>\n");
      out.write("                            <button class=\"btn btn-danger\" type=\"reset\">Reset</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t    \t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t    \t</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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

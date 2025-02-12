package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class All_005fenquiry_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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


      out.write("  \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n");
      out.write("    </script> \n");
      out.write("    \n");
      out.write("    <style type=\"text/css\"> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        body{\n");
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
      out.write("\n");
      out.write("    </style>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("     <div class=\"jumbotron brandname\">\n");
      out.write("   \t       <h2>EduMatrix Academic CRM</h2> \n");
      out.write("               <p style=\"float:right; margin-top:-35px;\">Welcome <span style=\"color:white\">");
      out.print(sname);
      out.write("</span> </p>\n");
      out.write("     </div> \n");
      out.write("     \n");
      out.write("\t   <div class=\"container formcontainer\"> \n");
      out.write("\n");
      out.write("\t   \t<h3 class=\"text-center\">Student Enquiry Form</h3>\n");
      out.write("\n");
      out.write("\t   \t<form method=\"post\" action=\"All_enquiry_InsertData.jsp\" name=\"f1\">\n");
      out.write("\n");
      out.write("\t   \t\t<div class=\"form-group\">\n");
      out.write("\t   \t\t\t<label>First Name</label>\n");
      out.write("\t   \t\t\t<input type=\"text\" name=\"fname\" class=\"form-control\">\n");
      out.write("\n");
      out.write("\t   \t\t</div>\n");
      out.write("\n");
      out.write("\t   \t\t<div class=\"form-group\">\n");
      out.write("\t   \t\t\t<label>Last Name</label>\n");
      out.write("\t   \t\t\t<input type=\"text\" name=\"lname\" class=\"form-control\">\n");
      out.write("\n");
      out.write("\t   \t\t</div>\n");
      out.write("\n");
      out.write("\t   \t\t<div class=\"form-group\">\n");
      out.write("\t   \t\t\t<label>Email</label>\n");
      out.write("\t   \t\t\t<input type=\"text\" name=\"email\" class=\"form-control\">\n");
      out.write("\n");
      out.write("\t   \t\t</div>\n");
      out.write("\n");
      out.write("\t   \t\t<div class=\"form-group\">\n");
      out.write("\t   \t\t\t<label>Branch</label>\n");
      out.write("\t   \t\t\t<select name=\"branch\" class=\"form-control\">\n");
      out.write("\t   \t\t\t\t<option disabled selected >----Select Branch -----</option>\n");
      out.write("\t   \t\t\t\t<option value=\"ENTC\">ENTC</option>\n");
      out.write("\t   \t\t\t\t<option value=\"IT\">IT</option>\n");
      out.write("\t   \t\t\t\t<option value=\"COMP\">COMP</option>\n");
      out.write("\t   \t\t\t\t<option value=\"CIVIL\">CIVIL</option>\n");
      out.write("\t   \t\t\t\t<option value=\"Other\">Other</option>\n");
      out.write("\t   \t\t\t</select>\n");
      out.write("\t   \t\t</div> \n");
      out.write("\n");
      out.write("\t   \t\t<div class=\"form-group\">\n");
      out.write("                <label>Technology</label> \n");
      out.write("                <input type=\"radio\" name=\"tech\" value=\"Java\"> Java\n");
      out.write("                <input type=\"radio\" name=\"tech\" value=\"PHP\"> PHP\n");
      out.write("                <input type=\"radio\" name=\"tech\" value=\"Python\"> Python\n");
      out.write("                <input type=\"radio\" name=\"tech\" value=\"Web\"> Web\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <div class=\"form-group\"> \n");
      out.write("            \t<label>Training Type</label>\n");
      out.write("            \t<input type=\"radio\" name=\"training_type\" value=\"JobOriented\" onclick=\"fess()\"> Job Oriented\n");
      out.write("            \t<input type=\"radio\" name=\"training_type\" value=\"Internship\" onclick=\"fess()\"> Internship\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"form-group\"> \n");
      out.write("            \t<label>Fees</label>\n");
      out.write("            \t<input type=\"text\" name=\"fees\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\"> \n");
      out.write("            \t<label>Status</label>\n");
      out.write("            \t<input type=\"radio\" name=\"status\" value=\"followUp\"> FollowUp\n");
      out.write("            \t<input type=\"radio\" name=\"status\" value=\"Lead\"> Lead\n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <label>Date</label> \n");
      out.write("                        <input type=\"date\" name=\"date\" class=\"form-control\"/>\n");
      out.write("                     </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("             <button type=\"submit\" class=\"btn btn-info\">Submit</button>\n");
      out.write("             <button type=\"reset\" class=\"btn btn-danger\">Reset</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t   \t</form>\n");
      out.write("\n");
      out.write("\t   </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

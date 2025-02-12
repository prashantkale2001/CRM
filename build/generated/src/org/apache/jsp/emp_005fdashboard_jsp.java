package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emp_005fdashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  
    
    String sname=(String)session.getAttribute("sname"); 


      out.write("   \n");
      out.write("<head>\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n");
      out.write("    </script> \n");
      out.write("</head>\n");
      out.write("<style> \n");
      out.write("    body{    \n");
      out.write("        background-color: #f8f9fa; /* Light grey background */\n");
      out.write("         background-image:url(\"pics/ad.png\");\n");
      out.write("\n");
      out.write("        \n");
      out.write("          }\n");
      out.write("    .brandname {\n");
      out.write("        padding: 10px;\n");
      out.write("       background:linear-gradient(to right, #1e3c72, #2a5298); /* Blue gradient */\n");
      out.write("       color: #f0f8ff; /* White text */\n");
      out.write("       text-align: center;\n");
      out.write("       border-bottom: 3px solid #0056b3; /* Darker border for definition */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("    \th3 {\n");
      out.write("         color: #007bff; /* Primary blue */\n");
      out.write("        font-weight: bold;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("     h3.text-center {\n");
      out.write("        text-transform: uppercase; /* Optional for emphasis */\n");
      out.write("        letter-spacing: 1px; /* Optional for style */\n");
      out.write("         } \n");
      out.write("        \n");
      out.write("    \t.well:hover{\n");
      out.write("    \t\t background-color: #0056b3; /* Darker blue on hover */\n");
      out.write("                 color: #ffffff;\n");
      out.write("                  }\n");
      out.write("        .well{\n");
      out.write("            font-size: 18px; \n");
      out.write("            background-color: #007bff; /* Vibrant blue */\n");
      out.write("            color: #ffffff; /* White text for contrast */\n");
      out.write("           border: none; /* Remove border for a clean look */\n");
      out.write("           transition: background-color 0.3s ease; /* Smooth hover effect */\n");
      out.write("        }   \n");
      out.write("        \n");
      out.write("        /* H2 Heading */\n");
      out.write("     h2 {\n");
      out.write("    color: #28a745; /* Emerald Green */\n");
      out.write("    font-weight: bold;\n");
      out.write("    text-transform: uppercase; /* Optional for emphasis */\n");
      out.write("    margin-bottom: 20px; /* Space below the heading */\n");
      out.write("    text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */\n");
      out.write("     }\n");
      out.write("\n");
      out.write("/* Anchor Tags */\n");
      out.write("   a {\n");
      out.write("    color: #007bff; /* Primary Blue */\n");
      out.write("    text-decoration: none; /* Remove underline by default */\n");
      out.write("    transition: color 0.3s ease; /* Smooth transition on hover */\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    a:hover {\n");
      out.write("    color: #0056b3; /* Darker Blue on hover */\n");
      out.write("    text-decoration: underline; /* Underline on hover for accessibility */\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("<body> \n");
      out.write("     <div class=\"jumbotron brandname\">\n");
      out.write("   \t       <h2>EduMatrix Academic CRM</h2> \n");
      out.write("              <a href=\"Logout.jsp\"><p style=\"float:right; margin-top:-35px;padding:10px 10px\">LogOut</p></a>\n");
      out.write("                <p style=\"float:right; margin-top:-35px; padding:10px 10px\">Welcome <span style=\"color:white\">");
      out.print(sname);
      out.write("</span> </p>\n");
      out.write("     </div> \n");
      out.write("\t \n");
      out.write("     <div class=\"container\"> \n");
      out.write("                  <h3 class=\"text-center\">Employee Dashboard</h3>\n");
      out.write("\n");
      out.write("     \t<div class=\"row\"> \n");
      out.write("            <h3 class=\"text-center\">Sales & Marketing </h3>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <a href=\"All_enquiry_form.jsp\"><div class=\"well text-center\">All Enquiry</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <a href=\"Show_FollowUp.jsp\"><div class=\"well text-center\">Follow-Up</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("              <a href=\"Show_Lead.jsp\"><div class=\"well text-center\">Lead</div></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("               <a href=\"#\"><div class=\"well text-center\">Demo plan</div></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("     \t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("     \t<div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <a href=\"StudentRegistrationForm.html\"><div class=\"well text-center\">New Registration</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<a href=\"RegisteredCandidate.jsp\"><div class=\"well text-center\">Registered Candidate</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Fees follow-up</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Receipt Entry</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("     \t</div>\n");
      out.write("\n");
      out.write("     \t<div class=\"row\">\n");
      out.write("                   <h3 class=\"text-center\">Training Department</h3>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\"> \n");
      out.write("            \t<div class=\"well text-center\">Batch Plan</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Display Batch Plan</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Task Entry</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Display Task</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("     \t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("     \t<div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Exam Entry</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Display Exam Records</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Score Card</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Student Performance</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("     \t</div>\n");
      out.write("\n");
      out.write("     \t<div class=\"row\"> \n");
      out.write("            <h3 class=\"text-center\">Admin & HR Department</h3>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <a href=\"Acc_management_DB.jsp\"><div class=\"well text-center\">Account Management</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <a href=\"Plac_management_DB.jsp\"> <div class=\"well text-center\">Placement Management</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <a href=\"Vendor_management_DB.jsp\"><div class=\"well text-center\">Vendor Management</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <a href=\"Client_management_DB.jsp\"><div class=\"well text-center\">Client Management</div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("     \t</div>  \n");
      out.write("         \n");
      out.write("         <div class=\"row\"> \n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Today's Plan</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Today's Birth Date</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Ask to Approval</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("            \t<div class=\"well text-center\">Certificate Request</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("     \t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
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

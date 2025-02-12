<%@ page import="java.sql.*" %>
<%
    // Retrieve form parameters
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String branch = request.getParameter("branch");
    String email = request.getParameter("email");
    String phno = request.getParameter("phno");
    String gender = request.getParameter("g");
    String technology = request.getParameter("tech");
    String trainingType = request.getParameter("training_type");
    int fees = Integer.parseInt(request.getParameter("fees"));
    String d1 = request.getParameter("d1");
    int in1 = Integer.parseInt(request.getParameter("in1"));
    String status1 = request.getParameter("status");
    String d2 = request.getParameter("d2");
    int in2 = Integer.parseInt(request.getParameter("in2"));
    String status2 = request.getParameter("status2");
    String d3 = request.getParameter("d3");
    int in3 = Integer.parseInt(request.getParameter("in3"));
    String status3 = request.getParameter("status3");
    String d4 = request.getParameter("d4");
    int in4 = Integer.parseInt(request.getParameter("in4"));
    String status4 = request.getParameter("status4"); 
    String btn=request.getParameter("setbtn");

    try {
        // Load MySQL driver
        Class.forName("com.mysql.jdbc.Driver");
        // Establish a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db", "root", "");

        // SQL Insert Query
        String query = "INSERT INTO registered_students2 (fname, lname, branch, email, phno, gender, technology, training_type, fees, d1, in1, status1, d2, in2, status2, d3, in3, status3, d4, in4, status4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Prepare statement
        PreparedStatement pstmt = con.prepareStatement(query);

        // Set parameters
        pstmt.setString(1, fname);
        pstmt.setString(2, lname);
        pstmt.setString(3, branch);
        pstmt.setString(4, email);
        pstmt.setString(5, phno);
        pstmt.setString(6, gender);
        pstmt.setString(7, technology);
        pstmt.setString(8, trainingType);
        pstmt.setInt(9, fees); 
        pstmt.setString(10, d1);
        pstmt.setInt(11, in1);
        pstmt.setString(12, status1);
        pstmt.setString(13, d2);
        pstmt.setInt(14, in2);
        pstmt.setString(15, status2);
        pstmt.setString(16, d3);
        pstmt.setInt(17, in3);
        pstmt.setString(18, status3);
        pstmt.setString(19, d4);
        pstmt.setInt(20, in4);
        pstmt.setString(21, status4); 
         
        

        // Execute the query
         pstmt.executeUpdate();

       
        // Close the connection
        con.close(); 
        response.sendRedirect("emp_dashboard.jsp");
    } catch (Exception e) 
    {
          System.out.println(e);
    }
%>

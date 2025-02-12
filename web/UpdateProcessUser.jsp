<%@page import="java.sql.*" %>
<%   
    int uid = Integer.parseInt(request.getParameter("userid"));
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");
    String phno = request.getParameter("phno");
    String uname = request.getParameter("uname");
    String pass = request.getParameter("pass");  

    try { 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project_db", "root", ""); 
        
        String sql = "update users set fname = ?, lname = ?, email = ?, phno = ?, uname = ?, pass = ? WHERE uid = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setString(1, fname);
        pstmt.setString(2, lname);
        pstmt.setString(3, email);
        pstmt.setString(4, phno);
        pstmt.setString(5, uname);
        pstmt.setString(6, pass);
        pstmt.setInt(7, uid); 
        
        pstmt.executeUpdate();
       response.sendRedirect("ShowUser.jsp");



        
        con.close();
    }
    catch (Exception e) {
        out.print("Error: " + e.getMessage());
    }
%>

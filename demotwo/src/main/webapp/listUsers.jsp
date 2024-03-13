<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection, java.sql.DriverManager, java.sql.PreparedStatement, java.sql.ResultSet, java.sql.SQLException" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
  <title>List of Users</title>
</head>
<body>
<%
  HttpSession session1 = request.getSession();
  String username = (String) session1.getAttribute("username");
  if (username == null) {
    response.sendRedirect("login.jsp");
    return;
  }
%>
<h2>List of Users (Accessed by <%= username %> )</h2>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Username</th>
    <th>Password</th>
  </tr>
  <%
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "");
      ps = con.prepareStatement("SELECT * FROM student_profile");
      rs = ps.executeQuery();

      while (rs.next()) {
  %>
  <tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("username") %></td>
    <td><%= rs.getString("password") %></td>
  </tr>
  <%
      }
    } catch (SQLException e) {
      out.println("SQLException: " + e.getMessage());
    } catch (ClassNotFoundException e) {
      out.println("ClassNotFoundException: " + e.getMessage());
    } finally {
      // Close resources in the reverse order of their creation to avoid potential leaks.
      if (rs != null) {
        try {
          rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (ps != null) {
        try {
          ps.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  %>
</table>
</body>
</html>

<%-- 
    Document   : search
    Created on : 16 Mar, 2023, 5:13:00 PM
    Author     : shrad
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <table>
           boarder="1">
           <tr>
               <th> id</th>
               <th>Username</th>
               <th>password</th>
           </tr>
           <%
           try{
               Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web","root","");       
            Statement stm = con.createStatement();
            String user = request.getParameter("user");
            String sqlstr = "select * from login where firstnm=user";
            ResultSet rs = stm.executeQuery(sqlstr);
            while(rs.next()){
            %>
            <tr>
                <td><%=rs.getInt("Sn")%> </td>
                <td><%=rs.getString("firstnm")%></td>
                <td><%=rs.getString("pass")%></td>
            </tr>
           <% }
           }catch(Exception e)
           {
System.out.print(e);
}}%>
          
        </table>>
    </center>
    </body>
</html>

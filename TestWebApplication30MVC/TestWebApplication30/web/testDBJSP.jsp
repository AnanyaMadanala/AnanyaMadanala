<%-- 
    Document   : testDBJSP
    Created on : 30 Apr, 2024, 10:59:17 AM
    Author     : Vipra
--%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Database Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            Connection con=null;
            Statement st=null;
            ResultSet rs=null;
            try
            {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db30","root","root");
            System.out.println("Connected");
            
            st = con.createStatement();
            
            String query = "SELECT * FROM emp";
            
            rs = st.executeQuery(query);
            %>
            <table width="500">
                <tr>
                    <td><strong>Emp ID:</strong></td>
                    <td><strong>Emp Name:</strong></td>
                    <td><strong>Emp Password:</strong></td>
                    <td><strong>Emp Salary:</strong></td>
                    <td><strong>Emp City:</strong></td>
                </tr>
            </table>
            <%
            while(rs.next())
            {
                %>
                <tr>
                    <td><strong><%=rs.getString(1)%></strong></td>
                    <td><strong><%=rs.getString(2)%></strong></td>
                    <td><strong><%=rs.getString(3)%></strong></td>
                    <td><strong><%=rs.getString(4)%></strong></td>
                    <td><strong><%=rs.getString(5)%></strong></td>
                </tr>
                <%
            }
            
            con.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    %>
        </table>
    </body>
</html>

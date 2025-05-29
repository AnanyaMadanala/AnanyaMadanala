<%-- 
    Document   : home
    Created on : 28 Jun, 2024, 5:50:09 PM
    Author     : Vipra
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body bgcolor="light blue">
        <a href="logout.jsp">Sign out</a>
        
        <%
        String username= (String) session.getAttribute("username");
        if(username== null)
        {
            response.sendRedirect("login.html");
        }
        %>
        <h1>Hello <%=username%>...!</h1>
        <h2>Login Successful...</h2>
    </body>
</html>

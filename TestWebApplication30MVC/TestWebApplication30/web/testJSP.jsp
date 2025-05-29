<%-- 
    Document   : testJSP
    Created on : 30 Apr, 2024, 9:52:50 AM
    Author     : Vipra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="cyan">
        <%!
            static int x;
            int add(int a,int b)
            {
                int c;
                c=a+b;
                return c;
            }
        %>   
        <%
        for(int i=0;i<=10;i++)
        {
        %>
            <h1>Hello World<%=i%>!</h1>    
        <%
        }
        %>
    </body>
</html>

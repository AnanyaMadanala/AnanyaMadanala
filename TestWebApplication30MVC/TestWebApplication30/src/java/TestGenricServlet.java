/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vipra
 */
public class TestGenricServlet extends GenericServlet 
{
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
    {
        //System.out.println("Service Method");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Generic Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan >");
        for (int i = 1; i <= 10; i++) 
        {
            out.println("<H1>Welcome to my Generic Servlet</H1>");            
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }
}

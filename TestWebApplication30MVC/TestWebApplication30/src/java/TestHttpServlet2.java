import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Vipra
 */
public class TestHttpServlet2 extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
   {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HELLO>");
        out.println("<TITLE>HttpServlet2-GET</TITLE>");
        out.println("<HEAD>");
        out.println("<BODY bgcolor=cyan>");
        out.println("<H1>Welcome to my HttpServlet2-GET</H1>");
        out.println("<FORM action=TestHttpServlet2 method=post>");
        out.println("Username:<INPUT type=text name=username/>");
        out.println("<BR/>");
        out.println("Password:<INPUT type=password name=password/>");
        out.println("<BR/>");
        out.println("<INPUT type=submit>");
        out.println("</FORM>");
        
        out.println("</BODY>");
        out.println("</HTML>");
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
   {
       String username=request.getParameter("username");
       String password=request.getParameter("password");
       PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HELLO>");
        out.println("<TITLE>HttpServlet-Post</TITLE>");
        out.println("<HEAD>");
        out.println("<BODY bgcolor=cyan>");
        out.println("<H1>Welcome to my HttpServlet2-Post</H1>");
        //out.println("<H2>Username="+username+"</H2>");
        //out.println("<H2>Password="+password+"</H2>");
        if(username!=null && password!=null &&!username.trim().equals("") && username.equalsIgnoreCase("Ananya") && password.equals("12345"))
        {
            out.println("<H2>Login Successful<H2/>");
        }    
        else
        {
            out.println("<H2>Login failed<H2/>.");
        }
        out.println("</BODY>");
        out.println("</HTML>");
   }
}

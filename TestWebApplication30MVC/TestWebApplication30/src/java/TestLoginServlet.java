//why showing login failed....
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
public class TestLoginServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>HttpServlet-GET</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan >");
        out.println("<H1>Welcome to my HttpServlet - GET</H1>");            

        out.println("<FORM action=TestLoginServlet method=post >");
        out.println("Username: <INPUT type=text name=username /><BR/>");
        out.println("Password: <INPUT type=password name=password /><BR/>");
        out.println("<INPUT type=submit value=Login >");
        out.println("</FORM>");

        out.println("</BODY>");
        out.println("</HTML>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>HttpServlet-Post</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan >");
        out.println("<H1>Welcome to my HttpServlet - Post</H1>");            

        //out.println("<H2>Username = "+username+"</H2>");            
        //out.println("<H2>Password = "+password+"</H2>");            
        
        if(username!=null && password!=null && username.equalsIgnoreCase("Ananya") && password.equals("12345"))
        {
            out.println("<H1>Login Successful...</H1>");
        }
        else
        {
            out.println("<H1>Login Failed...</H1>");            
        }
        
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
}

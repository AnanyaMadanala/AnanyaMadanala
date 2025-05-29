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
public class TesrHttpServlet extends HttpServlet 
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
   {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HELLO>");
        out.println("<TITLE>HttpServlet-GET</TITLE>");
        out.println("<HEAD>");
        out.println("<BODY bgcolor=cyan>");
        out.println("<H1>Welcome to my HttpServlet</H1>");
        
        out.println("<FORM action=TesrHttpServlet method=post>");
        out.println("<INPUT type=submit>");
        out.println("</FORM>");
        
        out.println("</BODY>");
        out.println("</HTML>");
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
   {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HELLO>");
        out.println("<TITLE>HttpServlet-Post</TITLE>");
        out.println("<HEAD>");
        out.println("<BODY bgcolor=cyan>");
        out.println("<H1>Welcome to my HttpServlet-Post</H1>");
        out.println("</BODY>");
        out.println("</HTML>");
   }
}


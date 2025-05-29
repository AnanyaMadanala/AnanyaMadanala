import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import java.io.PrintWriter;
import javax.servlet.ServletResponse;/**
 *
 * @author Vipra
 */
public class TestServlet implements Servlet
{
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init Method");
    }
    public ServletConfig getServletConfig() {
        return null;
    }
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //System.out.println("Service Method");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HELLO>");
        out.println("<TITLE>Test Servlet</TITLE>");
        out.println("<HEAD>");
        out.println("<BODY bgcolor=cyan>");
        for(int i=0;i<=10;i++)
        {
            out.println("<TITLE>Welcome to my HttpServlet-GET</TITLE>");
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }  
    public String getServletInfo() {
        return null;
    }
    public void destroy() {
        System.out.println("Destroy method");
    }
    
}

    

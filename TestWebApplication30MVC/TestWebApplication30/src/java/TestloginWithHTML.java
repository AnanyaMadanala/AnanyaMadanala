//not showing loginwithhtml
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Vipra
 */
public class TestloginWithHTML extends HttpServlet {

   public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
   {
        //RequestDispatcher rd=request.getRequestDispatcher("login.html");
        response.sendRedirect("login.html");
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
   {
       String username=request.getParameter("username");
       String password=request.getParameter("password");
       
        if(username!=null && password!=null && username.equalsIgnoreCase("Ananya") && password.equals("12345"))
        {
            response.sendRedirect("home.html");
        }
        else
        {
            response.sendRedirect("login.html");
        }
   }

}

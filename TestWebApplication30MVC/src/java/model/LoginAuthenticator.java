package model;

import db.DBConnector;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Vipra
 */
public class LoginAuthenticator 
{
    public boolean isLogin(UserDTO user)
    {
      String tablePassword="";
      String password = user.getPassword();
      String username = user.getUsername();
      try
      {
          Statement st=DBConnector.getStatement();
          String query = "SELECT emppassword FROM emp WHERE empname='"+username+"'";
          System.out.println("Query="+query);
          ResultSet rs =st.executeQuery(query);
          if(rs.next())
          {
              tablePassword = rs.getString(1);
          }
          else
          {
              return false;
          }
      } 
      catch(SQLException e)
      {
          System.out.println(e);
      }
      if(username!=null && password!=null && password.equals(tablePassword))
      {
          return true;
      }
      return false;
    }
}
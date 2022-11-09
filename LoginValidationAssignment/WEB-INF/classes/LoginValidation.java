
import java.io.PrintWriter;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;
public class LoginValidation extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
     
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
        PrintWriter printW= response.getWriter();
       
       String userName=(String)request.getParameter("userId");
       String userpass=(String)request.getParameter("password");
          String name="Ranjith";
          String password="123";
          if(name.equals(userName)){
          	 Cookie message = new Cookie("message",name);
			
			response.addCookie(message);
          	response.sendRedirect("Response.html");
         }
         else{
         	 Cookie message = new Cookie("message","UserIdIncorrect");
			
			response.addCookie(message);
          	response.sendRedirect("index.html");
         }
	}
} 
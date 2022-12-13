package kontroler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Logout() {
        super();
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
    	
    	
	 
    	response.setContentType("text/html");
    	
    	HttpSession httpSession = request.getSession();
		httpSession.removeAttribute("loginBean");
		response.sendRedirect("index.jsp");
  
    	 
}  
}  

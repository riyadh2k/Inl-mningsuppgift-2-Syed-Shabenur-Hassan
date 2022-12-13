package kontroler;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginBean;



@WebServlet("/LoginJava")
public class LoginJava extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginJava() {
        super();
        
    }
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome.jsp");
    		requestDispatcher.forward(request, response);
        
    }
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String uname= request.getParameter("uname");
			String pass= request.getParameter("pass");
			LoginBean loginBean = new LoginBean();
			
			loginBean.setUsername(uname);
			loginBean.setPassword(pass);
			
			if(loginBean.getInfo()){
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("loginBean", loginBean);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome.jsp");
				requestDispatcher.forward(request, response);
				
				
			}else {
				response.sendRedirect("error.jsp");
				
			}
			
	}

	
	

}

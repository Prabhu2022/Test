package user_servlet;

import java.io.IOException;
import java.util.logging.Filter;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Services_Logic.EncryptDecrypt;
import user_dao.LoginValidation;
import user_dao.UserLoginDao;
import user_model.Login;


/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/Login22")
public class LoginCheck extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String UserName = request.getParameter("UserName");
		String UserPass = request.getParameter("UserPass");
		String Dept = request.getParameter("Dept");

		Login login = new Login(UserName, UserPass);
		
		EncryptDecrypt encrypt=new EncryptDecrypt();
		
		
		String Password=encrypt.encryptUserPass(login);
		
		System.out.println("Decrypt upass "+Password);
				
		login.setCipherTxt(Password); 
										
		UserLoginDao uldao = new UserLoginDao();

		//System.out.println(request.getParameter("Dept"));
		
		//System.out.println(Dept.equals("Admin"));
		
		if (Dept.equals("Admin")) {
			
			uldao.admin(login);

			if (uldao.admin(login) == true) {
				HttpSession session = request.getSession();
				session.setAttribute("UserName", UserName);
				session.setAttribute("Dept", Dept);
				response.sendRedirect("Admin.jsp");
			}
			else
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher("LoginError.jsp");
				dispatcher.forward(request, response);
			}
		}
		
		else if (Dept.equals("Manager")) {
			
			uldao.manager(login);

			if (uldao.manager(login) == true) {

				HttpSession session1 = request.getSession();
				session1.setAttribute("UserName", UserName);
				session1.setAttribute("Dept", Dept);
				response.sendRedirect("Manager.jsp");
			}
			else
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher("LoginError.jsp");
				dispatcher.forward(request, response);
			}
			
		} else if(Dept.equals("Employee")){
			uldao.employee(login);

			if (uldao.employee(login) == true) {

				HttpSession session2 = request.getSession();
				session2.setAttribute("UserName", UserName);
				session2.setAttribute("Dept", Dept);
				response.sendRedirect("Employee.jsp");
			}
			else
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher("LoginError.jsp");
				dispatcher.forward(request, response);
			}
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginError.jsp");
			dispatcher.forward(request, response);
		}
	}

}
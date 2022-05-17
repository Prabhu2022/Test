	package user_servlet;

	import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import Services_Logic.EncryptDecrypt;
	import user_dao.RegisterDao;
	import user_model.RegisterUser;

	/**
	 * Servlet implementation class RegisterServlet
	 */
	@WebServlet("/Register11")
	public class RegisterForm extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			String UserName = request.getParameter("UserName");
			String UserPass = request.getParameter("UserPass");
			String UserCPass = request.getParameter("UserCPass");
			String UserEmail = request.getParameter("UserEmail");
			String UserMob = request.getParameter("UserMob");

			String Dept=request.getParameter("Dept");
			
			System.out.println(UserCPass);
			System.out.println(Dept);

			RegisterUser register = new RegisterUser(UserName, UserPass, UserCPass, UserEmail, UserMob,Dept);
			
			//Encrypt encrypt=new Encrypt();
				
			EncryptDecrypt encrypt=new EncryptDecrypt();
			
			//SecretKey secretKey=encrypt.generateKey();
			
			//register.setSecretKey(secretKey);
					
			//encrypt.encrypt(UserPass);
			
			String Password=encrypt.encrypt(register);
			
			String CPassword=encrypt.encrypt(register); 
								
			register.setUserPass(Password);
			
			register.setUserCPass(CPassword);
			
			RegisterDao regdao = new RegisterDao();

			if (regdao.insert(register) == true) {

				RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterSuccess.jsp");
				dispatcher.forward(request, response);

				// System.out.println("You Have Registered Successfully");
				// response.sendRedirect("Login.jsp");

			} else {

				RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterError.jsp");
				dispatcher.forward(request, response);

				// System.out.println("You Have entered wrong details");
				// response.sendRedirect("error.jsp");
			}

		}
	}




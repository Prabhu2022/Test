package user_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import user_model.Login;

public class LoginValidation {

	private String url = "jdbc:mysql://localhost:3306/userdb";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String dbuser = "root";
	private String dbpass = "Captain@32";

	public void loadDriver(String driver) {

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {

			con = DriverManager.getConnection(url, dbuser, dbpass);

		}

		catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}

	public String validate(Login login) {

		String data = null;

		try {

			loadDriver(driver);
			Connection con = getConnection();

			//String sql = "SELECT Password from member where Username='admin'";
			
			String sql1 = "SELECT Password from member where Username=?";

			//System.out.println(sql1); //1

			//Statement stmt = con.createStatement();
			
			PreparedStatement ps;   		        	
   	 	 	ps=con.prepareStatement(sql1);
			
			ps.setString(1,login.getUserName());
			
			//ResultSet rs = stmt.executeQuery(sql1);
			
			ResultSet rs = ps.executeQuery();

			//System.out.println("reseltset"+rs);//2
			
			rs.next();
			
			data=rs.getString("Password");
			
			System.out.println("uname "+login.getUserName());//3
			//System.out.println(rs.getString("Password"));//4

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("login pass "+data);//5
		
		return data;

	}

}

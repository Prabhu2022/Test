package user_dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import user_model.RegisterUser;


public class RegisterDao
{
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

	public boolean insert(RegisterUser register) {

		// String result="You Have Registered Successfully";

		boolean result = true;

		PreparedStatement ps;
		
		loadDriver(driver);
		Connection con = getConnection();

		String sql = "insert into member values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, register.getUserName());
			ps.setString(2, register.getUserPass());
			ps.setString(3, register.getUserCPass());
			ps.setString(4, register.getUserEmail());
			ps.setString(5, register.getUserMob());
			ps.setString(6, register.getDept());
		

			ps.executeUpdate();

		}

		catch (SQLException ex) {
			ex.printStackTrace();
			result = false;
		}
		return result;

	}

}


	package user_dao;

	import java.sql.*;

import user_model.Login;


	public class UserLoginDao {

		public UserLoginDao() 
		{
			
		}
		
		private String url="jdbc:mysql://localhost:3306/userdb";
	    private String driver="com.mysql.cj.jdbc.Driver";
	    private String dbuser="root";
	    private String dbpass="Captain@32";
	         
	     public void loadDriver(String driver)
	         {
	    	 
	        	 try 
	        	 {
	        		 Class.forName(driver); 
	        	 }
	        	 catch(ClassNotFoundException e) 
	        	 {
	        		 e.printStackTrace();
	        	 }
	         }
	     
	         public Connection getConnection() 
	         {
	        	 Connection con=null;
	        	 try 
	        	 {
	        		 
	        		 con=DriverManager.getConnection(url,dbuser,dbpass);
	        		 
	        		 System.out.println("db conneted"+con);	        	 }
	         
	         catch(SQLException e) 
	        	 {      	 
	        	 System.out.println("db NOT conneted");
	        	 e.printStackTrace();
	        	 }
	        	return con;
	         }
	         
	         public boolean admin(Login login)
	         {
	        	 
	        	 boolean status=false;
	        	 	        	         	 
	        	 try {
	        		 
	        		loadDriver(driver);	        			        	
	        		Connection con=getConnection();
	        			        			
	        	 String sql="select *from member where BINARY Username=? and BINARY Password=? and Role='Admin'";
	        	        	 	        	 
	        	 	PreparedStatement ps;	        		        	
	        	 	 ps=con.prepareStatement(sql);
	        		 ps.setString(1,login.getUserName());
	        		// ps.setString(2,login.getUserPass());
	        		
	        		 ps.setString(2,login.getCipherTxt());
	        		
	        		// System.out.println(ps);
	        		 System.out.println("Dec pass"+login.getCipherTxt());
	        		 
	        		 ResultSet rs=ps.executeQuery();      		 
	        		       		 
	        		 status=rs.next();
	        		
	        		 System.out.println(status);
	        		 
	        		
	        	 }
	        	 
	        	catch(Exception e)
	        	 {
	        		e.printStackTrace();
	        	 }
	        	 
	        	return status;
	         }
	       public boolean manager(Login login)
	         {
	        	 
	        	 boolean status1=false;
	        	 
	        	 try {
	        		 
	        		loadDriver(driver);	        			        	
	        		Connection con=getConnection();
	        		
	        		System.out.println("Database is Connected Successfully !!");
	        		      	
	        	 String sql1="select *from member where BINARY Username=? and BINARY Password=? and Role='Manager'";
	        	        	 	        	 
	        	 	PreparedStatement ps1;
	        	
	        	 	 ps1=con.prepareStatement(sql1);
	        	 	 ps1.setString(1,login.getUserName());
	        		// ps1.setString(2,login.getUserPass());
	        		 ps1.setString(2,login.getCipherTxt());
	        		
	        			 
	        		 System.out.println(ps1);
	        		 
	        		 ResultSet rs1=ps1.executeQuery();      		 
	        		       		 
	        		 status1=rs1.next();
	        		
	        		 System.out.println(status1);
	        	 }
	        	 
	        	catch(Exception e)
	        	 {
	        		e.printStackTrace();
	        	 }
	        	 
	        	return status1;
	         }
	         public boolean employee(Login login)
	         {
	        	 
	        	 boolean status2=false;
	        	 
	        	 try {
	        		 
	        		loadDriver(driver);	        			        	
	        		Connection con=getConnection();
	        		
	        		System.out.println("Database is Connected Successfully !!");
	        		      	
	        		String sql2="select *from member where BINARY Username=? and BINARY Password=? and Role='Employee'";
	        	        	 	        	 
	        	 	PreparedStatement ps2;
	        	
	        	 	 ps2=con.prepareStatement(sql2);
	        	 	 ps2.setString(1,login.getUserName());
	        		//ps2.setString(2,login.getUserPass());
	        		 ps2.setString(2,login.getCipherTxt());
	        		
	        		 System.out.println(ps2);
	        		 
	        		 ResultSet rs2=ps2.executeQuery();      		 
	        		       		 
	        		 status2=rs2.next();
	        		
	        		 System.out.println(status2);
	        	 }
	        	 
	        	catch(Exception e)
	        	 {
	        		e.printStackTrace();
	        	 }
	        	 
	        	return status2;  
	         }
	         
	}	
	


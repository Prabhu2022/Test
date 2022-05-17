package user_model;

import javax.crypto.SecretKey;

public class RegisterUser {

	private String UserName;
	private String UserPass;
	private String UserCPass;
	private String UserEmail;
	private String UserMob;
	private String Dept;

	public RegisterUser() {
		super();
	}

	public RegisterUser(String userName, String userPass, String userCPass, String userEmail, String userMob,
			String dept) {
		super();
		UserName = userName;
		UserPass = userPass;
		UserCPass = userCPass;
		UserEmail = userEmail;
		UserMob = userMob;
		Dept = dept;
		
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPass() {
		return UserPass;
	}

	public void setUserPass(String userPass) {
		UserPass = userPass;
	}

	public String getUserCPass() {
		return UserCPass;
	}

	public void setUserCPass(String userCPass) {
		UserCPass = userCPass;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public String getUserMob() {
		return UserMob;
	}

	public void setUserMob(String userMob) {
		UserMob = userMob;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}
	
}
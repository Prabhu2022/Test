package user_model;

import javax.crypto.SecretKey;

public class Login {
	private String UserName;
	private String UserPass;
	private String CipherTxt;
	
	public Login() {
		super();
	}
	public Login(String userName, String userPass) {
		super();
		UserName = userName;
		UserPass = userPass;

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
	public String getCipherTxt() {
		return CipherTxt;
	}
	public void setCipherTxt(String cipherTxt) {
		CipherTxt = cipherTxt;
	}
	
}


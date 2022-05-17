package Services_Logic;

import java.util.Base64;
import java.util.Base64.Encoder;

import user_model.Login;
import user_model.RegisterUser;

import java.util.Base64.Decoder;


public class EncryptDecrypt {
	
	public static String encrypt(RegisterUser register)
	{

	Encoder encoder=Base64.getEncoder();
	
	String OriginalString=register.getUserPass();
	
	String encodedString = encoder.encodeToString(OriginalString.getBytes());
	
	System.out.println("Plain Text"+OriginalString +" "+"EncodedTxt"+encodedString);
	
	return encodedString;
			
}
	public static String decrypt(String cipherPass)
	{
	
	System.out.println("db pass bfr encrypt"+cipherPass);	
	
	Decoder decoder=Base64.getDecoder();
	
	byte[] bytes=decoder.decode(cipherPass);
	
	System.out.println("decry user pass"+ new String(bytes));
	
	String decodedString=new String(bytes);
	
	System.out.println("Plain Text"+decodedString);
	
	return decodedString;
}

	public static String encryptUserPass(Login login)
	{

	Encoder encoder=Base64.getEncoder();
	
	String OriginalString=login.getUserPass();
	
	String encodedString = encoder.encodeToString(OriginalString.getBytes());
	
	System.out.println("User pass "+OriginalString +" "+"Encoded upass "+encodedString);
	
	return encodedString;
			
}
	
	/*
	public static void main(String args[]) {
		
		String UserPass=null;
		String cipherPass=null;
		
		
		System.out.println(decrypt(UserPass));
		System.out.println(encrypt(cipherPass));
		
		
	}
	*/
	
}
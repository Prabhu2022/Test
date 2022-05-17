<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
            "http://www.w3.org/TR/html4/strict.dtd">
<HTML>
<HEAD>
<TITLE>check valid email</TITLE>
</HEAD>
<BODY bgcolor="#E0F8F7">
<script language = "Javascript">
/* This is code to check valid email using java script. */
function emailCheck(str) {
      		var at="@"
		var dot="."
		var lat=str.indexOf(at)
		var lstr=str.length
		var ldot=str.indexOf(dot)
        // check if '@' is at the first position or 
            at last position or absent in given email 
		if (str.indexOf(at)==-1 || str.indexOf(at)==0 ||
                str.indexOf(at)==lstr){
		   alert("Invalid E-mail ID")
		   return false
		}
		        // check if '.' is at the first position or at last 
        position or absent in given email
		if (str.indexOf(dot)==-1 || str.indexOf(dot)==0 ||
                str.indexOf(dot)==lstr){
		    alert("Invalid E-mail ID")
		    return false
		}
		        // check if '@' is used more than one times in given email
		if (str.indexOf(at,(lat+1))!=-1){
		    alert("Invalid E-mail ID")
		    return false
		 }
           // check for the position of '.'
		 if (str.substring(lat-1,lat)==dot || 
                 str.substring(lat+1,lat+2)==dot){
		    alert("Invalid E-mail ID")
		    return false
		 }
		         // check if '.' is present after two characters 
         from location of '@'
		 if (str.indexOf(dot,(lat+2))==-1){
		    alert("Invalid E-mail ID")
		    return false
		 }
		
				 // check for blank spaces in given email
		 if (str.indexOf(" ")!=-1){
		    alert("Invalid E-mail ID")
		    return false
		 }
		  		 return true					
	}
	function ValidateForm(){
	var emailID=document.form.txtEmail
	
	       //check if email is not entered or only spaces 
       are entereds in appropriate textbox
	if ((emailID.value==null)||(emailID.value=="")){
		alert("Please Enter your Email ID")
	
	// set cursor to the textbox provided for email entry
		emailID.focus()
		return false
    }
	if (emailCheck(emailID.value)==false){
		emailID.value=""
		emailID.focus()
		return false
	}
		return true
 }
</script>
	<form name="form" method="post" onSubmit="return ValidateForm()">
      <p>Enter an Email Address <input type="text" name="txtEmail"></p>
      <p> <input type="submit" name="Submit" value="Submit"></p>
    </form>
</BODY>
</HTML>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>
<title>Register</title>
<link href="css.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<h4 align="center">UserId already available ! "Try Different one"</h4>
	<div class="wrapper fadeInDown">
		<div id="formContent">
			<!-- Tabs Titles -->
			<h2 class="active">SignUp</h2>

			<h2>
				<a class="underlineHover" href="Login.jsp">Login</a>
			</h2>
			<!-- Icon -->
			<div class="fadeIn first">
				<img src="user.jpg" id="icon" alt="User Icon" class="user" />
			</div>
			<div align="center">
				<form method="post" action="Register11">
					<table>
						<tr>

							<td><input type="text" id="UserName" class="fadeIn second"
								name="UserName" placeholder="UserName" size="25"								
								maxlength = "10" minlength="5"
								title="UserName has 5-10 characters " required></td>
						</tr>
						<tr>
						<tr>

							<td><input type="password" id="Password"
								class="fadeIn third" name="UserPass" placeholder="Password" size="25"							
								maxlength = "8" minlength="5"
								 title="Password has 5-8 characters" required></td>
						</tr>
						<tr>

							<td><input type="password" id="CPassword"
								class="fadeIn third" name="UserCPass"
								placeholder="Confirm Password" size="25"								
								maxlength = "8" minlength="5"
								title="Enter Valid ConfirmPwd" required></td>
						</tr>
						<tr>

							<td><input type="text" id="UserEmail" class="fadeIn third"
								name="UserEmail" placeholder="UserEmail"
								pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"
								title="Enter Valid Email id" required></td>
						</tr>

						<tr>

							<td><input type="text" id="UserMob" class="fadeIn third"
								name="UserMob" placeholder="UserMob" pattern=".{10}"
								title="Enter Valid Mob No" required></td>
						</tr>

						<td><input type="submit" class="fadeIn fourth" value="SignUp"
							onclick="return Validate()"></td>
						</tr>
					</table>

					<script type="text/javascript">
						function Validate() {										              
							var UserPass = document.getElementById("Password").value;
							var UserCPass = document
									.getElementById("CPassword").value;
							if (UserPass != UserCPass) {
								alert("Passwords do not match.");
								return false;
							}
							return true;
						}
					</script>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
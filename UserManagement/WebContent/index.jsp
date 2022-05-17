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
<title>Login</title>
<link href="style3.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div class="wrapper fadeInDown">
		<div id="formContent">
			<!-- Tabs Titles -->
			<h2 class="active">Sign In</h2>

			<h2>
				<a class="underlineHover" href="Register.jsp">Sign Up</a>
			</h2>

			<!-- Icon -->
			<div class="fadeIn first">
				<img src="user.jpg" id="icon" alt="User Icon" class="user" />
			</div>
			<div align="center">
				<form method="post" action="Login22">
					<table>
					<div id="option" align="center">
						
							<h3>
							<label for="Dept">Select Dept:</label>
								<select name="Dept" id ="Dept">
										<option><--Select--></option>
										<option>Admin</option>
										<option>Manager</option>
										<option>Employee</option>
								</select>
							</h3>
						
						</div>
						<tr>
							<td><input type="text" id="UserName" class="fadeIn second"
								name="UserName" placeholder="UserName"></td>
						</tr>
						<tr>
						<tr>
							<td><input type="password" id="Password"
								class="fadeIn third" name="UserPass" placeholder="Password"></td>
						</tr>
						<tr align ="center">
							<td><input type="submit" class="fadeIn fourth" value="Login" onclick="Validate()"></td>
						</tr>
					</table>
				</form>
			</div>

			<div id="formFooter"> 
				<a class="underlineHover" href="PassReset.jsp">Forgot Password?</a>
			</div>
		</div>
	</div>
</body>
</html>
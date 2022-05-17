<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>
<title>Pass Reset</title>
<link href="style3.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div class="wrapper fadeInDown">
		<div id="formContent">
			<!-- Tabs Titles -->

			<div align="center">
				<form method="post" action="Reset">
					<table>

						<tr>
							<td><input type="text" id="UserEmail" class="fadeIn third"
								name="UserEmail" placeholder="Enter your Emailid"
								pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"
								title="Enter Valid Email id" required></td>
						</tr>
						<tr align="center">
							<td><input type="submit" class="fadeIn fourth" value="Reset"></td>							
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>

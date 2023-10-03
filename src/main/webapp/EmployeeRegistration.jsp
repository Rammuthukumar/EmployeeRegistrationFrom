<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!--  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"> -->
<style>
div{
	display:flex;
	align-items:center;
	justify-content:center;
}
h1{
	text-align:center;
}
</style>
</head>
<body>
	<h1>Employee Registration Form</h1>
	<div>
		<form action="EmployRegistrationServlet" method="post">
			Enter First Name: <input type="text" name="firstname" required /><br><br />
			Enter Last Name : <input type="text" name="lastname" required/><br><br/>
			Enter User Name : <input type="text" name="username" required/><br><br/>
			Enter Password  : <input type="password" name="password" required/><br><br/>
			Enter Address   : <input type="text" name="address" required /><br><br/>
			Enter Contact   : <input type="text" name="contact" required /><br><br/>
			<input type="submit">
		</form>
	</div>
</body>
</html>
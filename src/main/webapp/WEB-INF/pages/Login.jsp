<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

</head>

<body>

	<form action="submitobj" method="post">

		UserName: <input type="text" name="userName"><br>
		Password: <input type="text" name="password"> <br>
		Gender: <input type="radio" name="gender" value="male" checked>male
		<input type="radio" name="gender" value="female">female<br>
		Country: <select name="country">
			<option value="India">India</option>
			<option value="US">US</option>
			<option value="China">China</option>
		</select> <input type="submit" value="Login">

	</form>

</body>

</html>
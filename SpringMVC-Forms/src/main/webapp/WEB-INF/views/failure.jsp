<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red">Login Failed!</h1>
<form action="./authenticate" method="post">
        <input type="text" id="username" placeholder="Enter username here"><br><br>
        <input type="text" id="password" placeholder="Enter password here"><br><br>
        <button onclick="login()">Login</button>
        </form>
</body>
</html>
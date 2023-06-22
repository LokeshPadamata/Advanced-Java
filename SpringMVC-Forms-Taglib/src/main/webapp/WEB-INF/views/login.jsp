<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>I am in Login Page</h1>
<form:form action="./authenticate" method="post" modelAttribute="user">
<form:input type="text" path="username" placeholder="Enter Username Here"/>
<form:input type="text" path="password" placeholder="Enter password Here"/>
<button>Login</button>
</form:form>
</body>
</html>
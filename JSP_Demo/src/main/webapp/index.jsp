<html>
<head>

</head>
<body>
<!-- Scriplet -->
<%  out.print("<h1>Hello I am from JSP</h1><br><br>"); 
session.setAttribute("Username", "Rajesh");
out.print("<a href='User.jsp'>User</a>");

%>

</body>
</html>
package com.loginsystem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginSystem extends HttpServlet  {

    /**
     * Default constructor. 
     */
    public LoginSystem() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<html>\r\n"
				+ "    <head>\r\n"
				+ "        \r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <center>\r\n"
				+ "        <input type=\"text\" id=\"username\" placeholder=\"Enter username here\"><br><br>\r\n"
				+ "        <input type=\"text\" id=\"password\" placeholder=\"Enter password here\"><br><br>\r\n"
				+ "        <button onclick=\"login()\">Login</button>\r\n"
				+ "    </center>\r\n"
				+ "        <script>\r\n"
				+ "            function login(){\r\n"
				+ "                var usernameInput = document.getElementById(\"username\").value;  \r\n"
				+ "                var passwordInput = document.getElementById(\"password\").value;\r\n"
				+ "                if(usernameInput==\"lokesh\" && passwordInput==\"padamata\"){\r\n"
				+ "                    alert(\"Login success\");\r\n"
				+ "                }\r\n"
				+ "                else{\r\n"
				+ "                    alert(\"Login Failure\");\r\n"
				+ "                }\r\n"
				+ "            }\r\n"
				+ "        </script>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("<h1>Post Method is Called</h1>");
		String username = req.getParameter("uname");
		String password = req.getParameter("pswrd");
		PrintWriter out = resp.getWriter();
		if(username.contentEquals("lokesh") && password.contentEquals("padamata")) {
			out.print("<h1>Login Success<h1>");
		}
		else {
			out.print("<h1>Login Failure<h1>");
		}
	}
}

package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.loginValidation;
@WebServlet("/loginlink")
public class Loginvalue extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String user=req.getParameter("user");
	String pass=req.getParameter("pass");
	loginValidation service=new loginValidation();
	boolean status=service.loginValidation(user, pass);
	if(status) {
		req.setAttribute("user",user);
		RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, resp);
		
	}else {
		resp.sendRedirect("index.html");
	}
}
 
}

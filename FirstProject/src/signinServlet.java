

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/signinServlet")
public class signinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String n = request.getParameter("uname");
		String p = request.getParameter("pass");
		
		User obj = new User();
		obj.setUname(n);
		obj.setUpass(p);
		PrintWriter out = response.getWriter();
		
		userDao ob = new userDaoimpl();
		boolean b =ob.signin(obj);
		if(b==true)
		{	HttpSession session = request.getSession();
			session.setAttribute("name",obj.getUname());
			RequestDispatcher req = request.getRequestDispatcher("/Welcome.jsp");
			req.forward(request, response);
			
			
		}
		else
		{	
			out.println("Wrong UserName or Password");
			RequestDispatcher req = request.getRequestDispatcher("/SignIn.html");
			req.include(request, response);
		}
	}

}



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Myservlet() {
		super();
		
	}
	
  private String name;
  private String pass;
  private String mail;
  private long number;
  public String msg;
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		name=request.getParameter("uname");
		pass=request.getParameter("pass");
		mail=request.getParameter("em");
		number=Long.parseLong(request.getParameter("number"));
		
		User obj=new User();
		obj.setUname(name);
		obj.setUpass(pass);
		obj.setEmail(mail);
		obj.setNum(number);
		
		PrintWriter out = response.getWriter();
		userDao ob = new userDaoimpl();
		boolean re =ob.signup(obj);
		if(re==true)
		{
			out.println("Successful");
			RequestDispatcher req = request.getRequestDispatcher("/SignIn.html");
			req.forward(request, response);
		}
		else
		{ 
			out.println("Something Went Wrong");
			}
		
		
	}


}

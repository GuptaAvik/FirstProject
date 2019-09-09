

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteservlet")
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name =request.getParameter("uname");
		String password = request.getParameter("pass");
		
		
		PrintWriter out = response.getWriter();
		userDao ob = new userDaoimpl();
		boolean re =ob.delete(name,password);
		if(re==true)
		{
			RequestDispatcher req = request.getRequestDispatcher("/SignIn.html");
			req.forward(request, response);
		}
		else
		{
			out.println("Something Went Wrong");
			}
		
	
	}

	}



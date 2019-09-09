

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adminservlet")
public class adminservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public adminservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un =request.getParameter("uname");
		String up =request.getParameter("pass");
		PrintWriter out = response.getWriter();
		if(un.equals("admin")&& up.equals("pass"))
				{//String n = " admin ";
				//HttpSession session = request.getSession();
			    RequestDispatcher req = request.getRequestDispatcher("/adminhome.jsp");
		     	req.forward(request, response);
		     	//session.setAttribute("an",n);
		     
				}
		else
		{
			out.println("Wrong user name or password");
		}
		
	}

}

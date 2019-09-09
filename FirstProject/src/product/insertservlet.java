package product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertservlet")
public class insertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int price;
	private int categoryId;
	private String url;
	private int quantity; 
    
    public insertservlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	id=Integer.parseInt(request.getParameter("id"));
	name=request.getParameter("name");
	price=Integer.parseInt(request.getParameter("price"));
	categoryId=Integer.parseInt(request.getParameter("category"));
	url=request.getParameter("url");
	quantity=Integer.parseInt(request.getParameter("quantity"));
	
	product obj = new product();
	obj.setPid(id);
	obj.setPname(name);
	obj.setPrice(price);
	obj.setCategory(categoryId);
	obj.setUrl(url);
	obj.setQuantity(quantity);
	
	PrintWriter out = response.getWriter();
	productdao ob = new ProductDaoImpl();
	boolean re =ob.add(obj);
	if(re==true)
	{
		out.println("Successful");
		//RequestDispatcher req = request.getRequestDispatcher("/adminhome.jsp");
		//req.forward(request, response);
	}
	else
	{ 
		out.println("Something Went Wrong");
		}
	
	}



}

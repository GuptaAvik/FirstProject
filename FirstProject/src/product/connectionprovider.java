package product;


import java.sql.Connection;
import java.sql.DriverManager;

public class connectionprovider {

	public static Connection con = null;
	public static  Connection getconnection()
{
	try {
		Class.forName("org.h2.Driver");
		con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/user","sa","admin");
	}
	catch(Exception e)
	{
		System.out.println("error");
		e.printStackTrace();
	}
	
	
	return con;
}
}

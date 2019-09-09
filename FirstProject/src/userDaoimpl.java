

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userDaoimpl implements userDao{
private Connection con;
private PreparedStatement ps;

boolean b=false;
	@Override
	public boolean signup(User user) {
		try {
		
		
		con = connectionprovider.getconnection();
		String uname=user.getUname();
		String pass=user.getUpass();
		String email=user.getEmail();
		long no=user.getNum();
		ps=con.prepareStatement("insert into customer values(?,?,?,?)");
		ps.setString(1,uname);
		ps.setString(2,pass);
		ps.setString(3,email);
		ps.setLong(4,no);
		
		int res=ps.executeUpdate();
		if(res>0)
		{
			b=true;
		}
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}
		return b;
	}
	@Override
	public boolean signin(User user) {
		try {
		con = connectionprovider.getconnection();
		ps = con.prepareStatement("select * from customer where name=? and password=?");
		ps.setString(1, user.uname);
		ps.setString(2,user.upass);
		ResultSet res=ps.executeQuery();
		if(res.next())
		{
			b=true;
		}
		}
			
		catch(Exception e)
		{
			e.printStackTrace();
			}
		return b;
	}
	@Override
	public boolean update(User user) {
		try {
			
			
		con = connectionprovider.getconnection();
		String uname=user.getUname();
		String pass=user.getUpass();
		String email=user.getEmail();
		long no=user.getNum();
		ps=con.prepareStatement("update customer set password=?, email=?,number=? where name=?");
		
		ps.setString(1,pass);
		ps.setString(2,email);
		ps.setLong(3,no);
		ps.setString(4,uname);
		int res=ps.executeUpdate();
		if(res>0)
		{
			b=true;
		}
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}
		return b;
		
	}
	@Override
	public boolean delete(String name, String password) {
		
		try {
			con = connectionprovider.getconnection();
			ps = con.prepareStatement("delete from customer where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2,password);
			int res=ps.executeUpdate();
			if(res>0)
			{
				b=true;
			}
			}
				
			catch(Exception e)
			{
				e.printStackTrace();
				}
			return b;
		}
	}

	
	


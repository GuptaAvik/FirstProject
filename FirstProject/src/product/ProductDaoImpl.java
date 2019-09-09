package product;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDaoImpl implements productdao{
	private Connection con;
	private PreparedStatement ps;
	private boolean b;
	@Override
	public boolean add(product pro) {
		try {
			con = connectionprovider.getconnection();
			ps = con.prepareStatement("insert into product values(?,?,?,?,?,?)");
			ps.setInt(1,pro.getPid());
			ps.setString(2,pro.getPname());
			ps.setInt(3,pro.getPrice());
			ps.setInt(4,pro.getCategory());
			ps.setString(5,pro.getUrl());
			ps.setInt(6,pro.getQuantity());
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

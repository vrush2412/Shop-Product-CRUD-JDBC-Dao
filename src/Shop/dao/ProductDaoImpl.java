package Shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import Shop.DataSource.ShopDBConnection;
import Shop.entity.Customer;
import Shop.entity.Product;


public class ProductDaoImpl {
	
	int i=0;
    Connection con=ShopDBConnection.getConnection();
    
	
	public int createRecord(List<Product> lst1,List<Customer>lst) {
		// TODO Auto-generated method stub
//		for(int i=0;i<n;i++)
		try {
			
			PreparedStatement pstate =con.prepareStatement("insert into table productdb values(?,?,?,?,?)");
			Product pobj=lst1.get(0);
			Customer cobj=lst.get(0);
			pstate.setInt(1, pobj.getProdid());
			pstate.setString(2,pobj.getProdname());
			pstate.setInt(3,pobj.getProdquantity());
			pstate.setFloat(4,pobj.getProdprice());
			pstate.setInt(5,cobj.getCustid());
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		}

}

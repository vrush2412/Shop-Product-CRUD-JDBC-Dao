package Shop.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.List;
	import Shop.DataSource.ShopDBConnection;
	import Shop.entity.Customer;

	public class CustomerDaoImpl {
		
		int i;
		Connection con=ShopDBConnection.getConnection();
		
		
			
			public int createRecord(List<Customer> lst) {
				
				try {
				// TODO Auto-generated method stubtry {
				PreparedStatement pstate=con.prepareStatement("insert into  customerdb values(?,?,?)");
//				Object lst;
				Customer cobj=lst.get(0);
				pstate.setInt(1,cobj.getCustid());
				pstate.setString(2,cobj.getCustname());
				pstate.setLong(3,cobj.getMobno());
				i=pstate.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return i;
			}
			
	}
		
	
	


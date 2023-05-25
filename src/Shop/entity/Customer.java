package Shop.entity;

public class Customer {
	

	
		private int custid;
	    private String custname;
	    private long mobno;
		public Customer(int custid, String custname, long mobno) {
			super();
			this.custid = custid;
			this.custname = custname;
			this.mobno = mobno;
		}
		public int getCustid() {
			return custid;
		}
		public void setCustid(int custid) {
			this.custid = custid;
		}
		public String getCustname() {
			return custname;
		}
		public void setCustname(String custname) {
			this.custname = custname;
		}
		public long getMobno() {
			return mobno;
		}
		public void setMobno(long mobno) {
			this.mobno = mobno;
		}
	    
		
	    
	}



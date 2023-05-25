package Shop.entity;

public class Product {
	private int prodid;
	  String Prodname;
	  int prodquantity;
	  float prodprice;
	public Product( int prodid, String prodname, int prodquantity, float prodprice) {
		super();
		
		this.prodid = prodid;
		Prodname = prodname;
		this.prodquantity = prodquantity;
		this.prodprice = prodprice;
	}


	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return Prodname;
	}
	public void setProdname(String prodname) {
		Prodname = prodname;
	}
	public int getProdquantity() {
		return prodquantity;
	}
	public void setProdquantity(int prodquantity) {
		this.prodquantity = prodquantity;
	}
	public float getProdprice() {
		return prodprice;
	}
	public void setProdprice(float prodprice) {
		this.prodprice = prodprice;
	}


	}



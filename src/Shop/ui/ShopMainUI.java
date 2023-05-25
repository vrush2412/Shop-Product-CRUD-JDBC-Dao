package Shop.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Shop.dao.CustomerDaoImpl;
import Shop.dao.ProductDaoImpl;
import Shop.entity.Customer;
import Shop.entity.Product;



public class ShopMainUI 
{
	
		  private static final List<Customer> lst = null;

		public static void main(String[] args) {
			  
		  
			  Scanner sc=new Scanner(System.in);
			  int i;
			 // Customer ctemp=null;
			  CustomerDaoImpl cdao=new CustomerDaoImpl();
			  ProductDaoImpl pdao=new ProductDaoImpl();
			  List <Customer>lst=new ArrayList<Customer>();
			  List <Product >lst1=new ArrayList<Product>();
			  
			  do {
			  System.out.println("1-Create\n 2-Update \n 3-Delete \n 4-Search \n 5-Display All");
			  System.out.println("Enter your choice........");
			  int ch=sc.nextInt();
			
			  switch(ch) {
			  case 1:
				  System.out.println("Enter custid,custname,mobileno:");
				  Customer cobj=new Customer(sc.nextInt(),sc.next(),sc.nextLong());
		    	  lst.add(cobj);
		    	  i=cdao.createRecord(lst);
		    	  if(i>0)
		    	  {
		    		  System.out.println("how many products do you want: ");
		        	  int choi=sc.nextInt();
		        	  for(int j=0;j<choi;j++) {
		        	  System.out.println("Enter prodid,name,prodQuantity,prodprice");
		        	  Product pobj=new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextFloat());
		        	  lst1.add(pobj);
		    		  i=pdao.createRecord(lst1,lst);}
		    		  
		    	  if(i>0) {
	        			 
	        			 System.out.println("Record Saved");
	        		 }
		    	  else {
	    			  System.out.println("Could not save the product record.....");
	    		  }
	    		  break;
	    	  }
		    	  else {
	    		  System.out.println("Could not save the customer record.....");
	    	  }
	    	 
		    	  }
		  
			  
		  System.out.println("DO YOU WANT TO CONTINUE TYPE YES /n");
	  }while(sc.next().equals("yes"));

		  }
		  }

package org.customerview;
import org.Customer.Customer;
import org.Customer.Product;
public class Mainview {
	
	private static Mainview Model1;

	int getCustomerIdFromCustomer(Customer Custobj1) {
		int CustId =Custobj1.getCustomerId();
		return CustId;
	}
	
	String getProductName(Product prdt1) {
		String product1Name =prdt1.getProductName();
		return product1Name;
	}
	
	int Doubleprice (int price) {
		return 2*price;
	}

	public static void main(String[] args) {
		//1
		Customer Cust1 =new Customer (1,"Rajesh");
		Mainview CustomerMV =new Mainview();
		int CustID=CustomerMV.getCustomerIdFromCustomer(Cust1);
		System.out.println("1.Customer ID :"+ CustID);
		
		
		//2
		Product Product1 = new Product (1 , 5000 , "Amron");
		Mainview ProductNM = new Mainview();
		String Pname = ProductNM.getProductName(Product1);
		System.out.println("2. Product name :"+Pname);
		
		//4
		Product Product2 = new Product (1 , 5000 , "Amron");
		Mainview.Model1 = new Mainview();
		int price = Product2.getPrice();
		int NewPrice=Model1.Doubleprice(price);
		
		System.out.println("4.DoublePrice : "+NewPrice);
		
		
		
		
		
		}
		
		
		
				
				
		
		
		
	}


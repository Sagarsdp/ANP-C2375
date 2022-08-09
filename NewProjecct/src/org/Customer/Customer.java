package org.Customer;

public class Customer {
		private int customerId;
		private String CustomerName;
		
		public Customer () {
			
		}
		public Customer(int id ,String CustName) {
			this.customerId =id;
			this.CustomerName=CustName;
			}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return CustomerName;
		}
		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}
		
		
		
}

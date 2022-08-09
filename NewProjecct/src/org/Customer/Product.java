package org.Customer;

public class Product {
		private int ProductId;
		private int price;
		private String productName;
		
		public Product( ) {
			
			
		}
		public Product (int PdtId , int Prc, String PdtName)
		{
			this.ProductId=PdtId;
			this.price = Prc;
			this.productName = PdtName;
		}

		public int getProductId() {
			return ProductId;
		}

		public void setProductId(int productId) {
			ProductId = productId;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}
}

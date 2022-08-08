package com.car.General;

public class Seden {
		private char CarName;
		private int ModelNo;
		private int Price;
		
		public Seden(char a,int MN,int prce) {
			CarName=a;
			ModelNo =MN;
			Price=prce;
		System.out.println("Constructor called");
			
		}

		public char getCarName() {
			return CarName;
		}

		public void setCarName(char carName) {
			CarName = carName;
		}

		public int getModelNo() {
			return ModelNo;
		}

		public void setModelNo(int modelNo) {
			ModelNo = modelNo;
		}

		public int getPrice() {
			return Price;
		}

		public void setPrice(int price) {
			Price = price;
		}
		

			
}


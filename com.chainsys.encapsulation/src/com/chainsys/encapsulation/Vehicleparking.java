package com.chainsys.encapsulation;

public class Vehicleparking {
	
		String CustomerName;
		String location;
		
		String VechileModel;
		
		public String getCustomerName() {
			return CustomerName;
		}
		public void setCustomerName(String customerName) {
			CustomerName = customerName;
			if(customerName.matches("^[a-zA-Z]+ $")){
				this.CustomerName=customerName;
			}
			else {
				System.out.println("Enter the Name in alphabet:");
			}
		}
		public String getLocation() { 
			return location;
		}
		public void setLocation(String location) {
			 String Location = location;
			if(location.matches("^[a-zA-Z]+$")) {
				this.location = location;
				
			}
			else {
				System.out.println("Enter the Name in alphabet:");
			}
			
		}
		public String getVechileModel() {
			return VechileModel;
		}
		public void setVechileModel(String vechileModel) {
			VechileModel = vechileModel;
			if(vechileModel.matches("^[a-zA-Z]+$")) {
				this.VechileModel=vechileModel;
				
			}
			else {
				System.out.println("Enter the VehicleModel in Alphabets:");

			}
		}
		
		@Override
		public String toString() {
			return "vechileparking [CustomerName=" + CustomerName + ", location=" + location + ", VechileModel=" + VechileModel + "]";
		}
}

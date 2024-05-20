package com.chainsys.encapsulation;

public class ProductExeAbs extends ProductAbs implements ProductRules{

	@Override
	public int welcome() {
		System.out.println("WELCOME TO OUR PAGE");
		return 0;
	}

	@Override
	public int thanks() {
		System.out.println("THANKS FOR VISIT OUR PRODUCT");
		return 0;
	}

	@Override
	public void Productrules() {
		System.out.println("Please Update Console Regularly"+"\n"+"If you facing any Issue please contact customer servies"+"\n"+"Turn On Two-Step-Verification");
		
	}
	
}

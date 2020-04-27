package com.lec.java.inherit03;

public class BusinessPerson extends person {

	String company;
	
	public void showInfo() {
		whoAmI();
		System.out.println("회사는" + company + "입니다");
		
	}
}

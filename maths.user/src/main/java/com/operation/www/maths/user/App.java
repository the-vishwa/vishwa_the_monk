package com.operation.www.maths.user;

import com.operation.www.maths.service.CalService;

public class App {
	public static void main(String[] args) {
		
		
		CalService calcy =new CalService();
		
		Integer i =calcy.doOperation(3, 3, "div");
		
		System.out.println(i);
	}
	
	
}

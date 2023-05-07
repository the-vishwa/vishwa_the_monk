package com.operation.www.maths.opt;

public class Calculation {

	public Integer sum(Integer a, Integer b) {

		if (a != null && b != null) {

			Integer s = a + b;

			return s;

		}

		return null;

	}
	public Integer div(Integer a, Integer b) {
		
		if (a != null && b != null && b!=0) {
			
			Integer s = a / b;
			
			return s;
			
		}
		
		return null;
		
	}
	public Integer multi(Integer a, Integer b) {
		
		if (a != null && b != null) {
			
			Integer s = a * b;
			
			return s;
			
		}
		
		return null;
		
	}
	public Integer sub(Integer a, Integer b) {
		
		if (a != null && b != null) {
			
			Integer s = a - b;
			
			return s;
			
		}
		
		return null;
		
	}

	
}

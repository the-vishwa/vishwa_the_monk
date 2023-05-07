package com.junit5.www.junit.example;

public class App {
	public  String message(String msg) {
		
		if(msg!=null) {
			
			return "Hello "+msg;
		}
		return null;
	}
}

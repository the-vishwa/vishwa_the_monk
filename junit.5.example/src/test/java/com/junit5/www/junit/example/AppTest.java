package com.junit5.www.junit.example;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {

	private App app;

	@BeforeEach
	public void befoEachMethod() {
		this.app = new App();

	};

	@Test
	public void testing() {

		// App app = new App();
		String str = this.app.message("vishwa");
		Assertions.assertEquals("Hello vishwa", str);
	}

	@Test
	public void nullTesting() {
		// App app = new App();
		String str = this.app.message(null);
		Assertions.assertEquals(null, str);
	}
	@AfterEach
	public void aftEachMethod() {
		this.app = null;

	};
	
	
}

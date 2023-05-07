package mathOperation;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

	@Test
	public void testAdd() {

		Sum s = new Sum();
		Integer integer = s.addition(10,20);
		Integer a= 30;
		Assert.assertEquals(a, integer);
		
		
	}

}

package share.info;

import org.junit.Assert;
import org.junit.Test;


public class PMessageTest {

//	@Test
//	public void testingPositiveGetmsg() {
//		PMessage pm = new PMessage();
//		String r =pm.getMsg("Vishwa");
//		Assert.assertEquals("hello Vishwa", r);
//	}
	
//	@Test(expected = NullPointerException.class)
//	public void chekException() {
//		PMessage pmm = new PMessage();
//		pmm.getMsg(null);
//		
//	}
	
	
//	@Test
//	public void chekNotNull() {
//		PMessage pm = new PMessage();
//		String r =pm.getMsg(null); // return null
//		Assert.assertNotNull(r);
//		
//	}
	
	
	@Test
	public void testingNegativeGetmsg() {
		PMessage pm = new PMessage();
		String r =pm.getMsg("Vishwa");
		Assert.assertNotEquals("hello  Vishwa", r);
	}
	
	
	
	

}

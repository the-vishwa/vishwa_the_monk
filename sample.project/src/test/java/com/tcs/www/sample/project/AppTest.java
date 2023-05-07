package com.tcs.www.sample.project;

import org.junit.Assert;
import org.junit.Test;


public class AppTest 
{
   
    @Test
    public void testinMethod(){
       
    	  App re = new App();
    	
    	 String st =re.getmsg("vishwa");
    	Assert.assertEquals("hello vishwa", st);
    	
    }
    @Test
    public void nullChecking(){
    	
    	App re = new App();
    	String st =re.getmsg(null);
    	Assert.assertEquals(null, st);
    	
    }
    
    
    
    
    
}

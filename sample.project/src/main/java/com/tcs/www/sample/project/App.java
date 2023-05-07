package com.tcs.www.sample.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! its my fisr project" );
        
        App result = new App();
        
        String msg =result.getmsg("Arjun");
        
        System.out.println("msg="+msg);
        
    }
    
    public String getmsg(String str) {
    	
    	if(str==null) {
    		return null;
    	}
    	
    	return "hello "+ str;
    }
}

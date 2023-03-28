package com.practicing.ExceptionHandling.Exception__;

/**
 * Hello world!
 *
 */
public class ExceptionHandling 
{
    public static void main( String[] args )
    {
        // Exception handling is a techniques in every programming language that help us to handle the errors like Runtime,logical,Compile time errors
    	
    	// Try, Catch, Throw, Throws, Finally these 5 keywords are used to implement this technique
    	
    	// Try is block in which a code which is suspicious to have error is placed
    	
    	// Catch is used to catch the error and perform the appropriate action
    	
    	// Throw is used to throw the error from the catch block
    	
    	// Throws is used to skip the exception of class
    	
    	// finally the code written inside the finally block will get execute despite of error
    	
    	
//    	int a=0,c;
//    	int b=10;
//    	try {
//    		c=b/a;
//    	}
//    	catch(Exception e) {
//    		System.out.println(e);
//    	}
//    	finally {
//    		System.out.println("Excecute even after the code having error");
//    	}
    	
    	int a=5;
    	try {
    		if(a==5) {
    			throw new AcontainsFive("a variable contains five");
    		}
    		System.out.println("a variable have value other than five");
    	}
    	catch(AcontainsFive a1) {
    		System.out.println(a1.getMessage());
    	}
    }
}

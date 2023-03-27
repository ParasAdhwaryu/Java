package com.java.traning.Java_Class_Object;

/**
 * Hello world!
 *
 */

//JDK is Java Development kit which is used to run byte code and jdk help us to compile the code and jvm is used to run the code.

// JRE provides the files which are required by the jvm to run the code


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // Calculator is the class whose object is created and a method add of calculator is called.
        
        Calculator c1=new Calculator();
        
        System.out.println(c1.add(1, 2));
        
        // Here we overloaded the add function in 2 ways either by increasing the number of arguments 
        // or by changing the data type of arguments
        
        System.out.println(c1.add(1, 2,3));
        
        System.out.println(c1.add(1,2.1));
    }
}



package com.practice.stetics.Stetics;

//public class myclass{
//	static int a=10;
//	public myclass(int a){
//		this.a=a;
//		System.out.println("This is my class");
//	}
//	static {
//		int k=20;
//		System.out.println("Inside Static block");
//	}
//	public static void printa() {
//		System.out.println(a);
//	}
//}

// Points to remember for the Static key word are as follows

// 1) Static key word method and variables belongs to the class not to the instance

// 2) Whenever you will create an object of class that have static blocks,methods,variables then they will get called before the constructor 

// 3) we can access the static variable and methods without creating an object of a class by using class.forName("class_name") method 

public class Stetics {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
//        myclass.a=20;
//        myclass.printa();
//        myclass my=new myclass(30);
//        myclass.printa();
		Class.forName("myclass");
	}

}

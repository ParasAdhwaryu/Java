package com.practice.stetics.Stetics;

public class myclass {
	static int a=10;
	public myclass(int a){
		this.a=a;
		System.out.println("This is my class cons");
	}
	static {
		int k=20;
		System.out.println("Inside Static block");
	}
	public static void printa() {
		System.out.println(a);
	}
}

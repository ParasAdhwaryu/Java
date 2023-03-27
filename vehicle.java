package com.practice.oops.oops_concept;

public class vehicle {
	 String color;
	 int wheels;
    public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public void vehicleClass() {
		System.out.println("Vehicle is a parent class");
	}
	public void overridemethod() {
		System.out.println("vehicle class");
	}
//	public void twoWheeler() {
//    	 System.out.println("2 wheels vehicle");
//    }
//	public void fourWheeler() {
//   	 System.out.println("4 wheels vehicle");
//   }
}

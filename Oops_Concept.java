package com.practice.oops.oops_concept;

/**
 * Hello world!
 *
 */
public class Oops_Concept 
{
    public static void main( String[] args )
    {
    	//*******Concept**************
   
        // Encapsulation, Polymorphism, Abstraction, Interface, Inheritance are the core concepts of oops in java
        
        // 1) Encapsulation -> It is way of binding data member and member function together in order to archive data hiding
    	
        // this keyword is used to access the instance variable of the particular object and it also help us to (this()) call the constructor of current class
        
    	// Every class in java extends the Object class
    	
    	// Super() is used to call the constructor of parent class
    	
    	// new Encapsulation.getName() is a anonymous object 
    	
//    	  Encapsulation enp=new Encapsulation();
//        enp.setAge(10);
//        enp.setId(1);
//        enp.setName("Paras");
//        System.out.println(enp.getAge()+","+enp.getId()+","+enp.getName());
    	
    	//*******Concept**************
       
    	// 2) Inheritance is a is kind of relationship between parent class and a child class where child class inherit the properties of it's parent class
    	
    	// In java multiple inheritance is not possible but it can be implemented by using the concept of interface.
    	
    	// Extend keyword is used to inherit the super of parent class.
        
    	// U can create an object of child class by assigning the value to the parent class type variable but converse is not true 
    	
    	// it is known as dynamic dispatch and is a runtime polymorphism.
    	
//    	car c=new car();
//    	c.vehicleClass();
    	
    	// Java didn't support multiple inheritance because it may create a ambiguity if the multiple parent class have the methods.
    	
    	// Method overriding is a process of overriding the function or two provide the different definition to the function.
    	
    	// Packages are the folder which contain the classes which are linked together and it is used to maintain the folder structure of the project.
    	
    	// Access modifiers there are 4 types of access modifier
    	
    	// Public,private,protected,default(package level)
    	
    	// variable, class, method declared with a public access modifier is available anywhere in the code.
    	
    	// variable, class, method declared with a private access modifier is available only inside the class.
    	
    	// variable, class, method declared with a protected access modifier is available inside the class which have it and the class which is inheriting it.
    	
    	// variable, class, method declared with a Default access modifier is available anywhere inside the particular package.
    
    	// final keyword is like making variable,class method constant so that changes can not be performed
    	
    	
    	//*******Concept**************
    	
//    	vehicle cc=new vehicle();
//    	cc.overridemethod();
//    	vehicle c=new car();
//    	c.overridemethod();
    	
    	//*******Concept**************
    	
//    	3) Polymorphism the way of representing the same massage in different ways.
    	
    	// There are two type of Polymorphism 1) Runtime 2) Compile time
    	
    	// 1) Runtime is a method overriding
    	
    	// 2) Compile time is a method overloading 
    	
    	// Equals method is method in a object class which is override in the myClass
    	
//    	myClass c1=new myClass();
//    	c1.name="Paras";
//    	c1.id=1;
//    	myClass c2=new myClass();
//    	c2.name="Paras";
//    	c2.id=1;
//    	System.out.println(c1.equals(c2));
    	
    	//*******Concept**************
    	
    	// UpCasting and DownCasting
    	
    	// When you have a object child class but reference of parent class then it is a upCasting
    	// But in upCasting parent reference will not able to call the method of child class 
    	//so when we take a reference of Parent class and cast it into the child class then 
    	//it will be able to access the child class method 
    	
    	vehicle v=new car();
    	v.vehicleClass();// UpCasting
    	car c=(car)v;
    	c.carclass(); // DownCasting
    	
    	//*******Concept**************
    	
    	// Wrapper classes are classes which can be wrapped around the primitive type of variable
    	
//    	String str="111";
//    	int a=Integer.parseInt(str);
//    	System.out.println(a);
    	
    	//*******Concept**************
    	
//    	4) Abstraction -> the process of hiding all inessential details and displaying only the essential one is Abstraction
           // We are not allow to create the instance of abstract class.
    	   // And may have 0 or more abstract methods
    	   // Class inheriting this abstract class should define the abstract method of this class 
    	  //  if class inheriting this class does not define the abstract method of this class then it will become a abstract class 
        
//    	abstract2_0 a2=new abstract2_0();
//    	a2.anotherDisp();
//    	a2.display();
    	
    	//*******Concept**************
    	
//    	5) Inner class -> as the name suggests the class inside the class is a inner class 
    	// now to create an object of inner class parent_class.inner_class=parent_obj.new inner_class();
    	// if the inner class is static parent_class.inner_class=new parent_obj.inner_class();
    	
    	//*******Concept**************
    	
    	// Anonymous class A a=new A(){public void show(){System.out.println("New Show")}} // A class without name is anonymous class
    	
    	//*******Concept**************
    	
    	// Interface -> It is similar to abstraction but by using abstract keyword 100% abstraction can not be achieved but it can be done using Interface
    	// All methods in Interface should only be declared without definition
    	// If any class wants to inherit the properties of Interface than it has to use Implement keyword
    	// If any Interface want's to inherit the properties of other Interface than it will use Extends keyword
    	// Through Interface Multiple Inheritance can be achieved
    	// All the variables present in Interface are treated like final and static
    	
//    	InterfaceImpl iimp=new InterfaceImpl();
//    	iimp.method1();
//    	iimp.method2();
    }
}

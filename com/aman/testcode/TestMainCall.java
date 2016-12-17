package com.aman.testcode;

/*
 1)  Learning from code : JVm automatically looks for class which has main method and calls main method by itself
 * Doubt : does JVM create instance of class with main method and then calls main method ??
 * Ans: main method is static so JVM calls main method by direct class name
 *  
 2) There can be more than 1 class with their own main method.
 on doing >> javac file1.java 
 It creates two class files 1: B.class 2: TestmainClass.class
 
 Executing each class files java B >> Executes its main method
 Executing java TestmainMethod >> Executes its own main method
 *  */

public class TestMainCall {
	void anotherFunction() {
		System.out.println("Another function called");
	}
	
	public static void main(String args[]) {
		TestMainCall t1 = new TestMainCall();
		t1.anotherFunction();
		//anotherFunction() static method cannot call instance methods directly..
		//it needs to create object of the same class and then access instance methods
		B test = new B();
		System.out.println(test.p);
	}
}

class B {
	int p=10;
	
	public static void main(String args[]) {
		System.out.println("Main method in class B");
	}
}

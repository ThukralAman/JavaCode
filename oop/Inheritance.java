package oop;



/*
 *   NOTE: parent class object cannot be casted to child-type and assigned to child-type reference - runTime Exception(classCastException)
 *   BUT: child class object can be assigned to parent class object reference.
 */
public class Inheritance {

	public static void main(String[] args) {
		A objA = new A();
		//B b = (B)objA;
		B objB = new B();
		
		A a = objB;
		
		Object o1 = new Object();
		String s1 = (String) o1;
	}
}

class A {
	int p=10;
	
	Integer get() {
		return p;
	}
	
}

class B extends A {
	int r=20;
}

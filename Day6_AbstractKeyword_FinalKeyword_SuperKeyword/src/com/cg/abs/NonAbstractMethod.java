package com.cg.abs;

abstract class A
{
	void print()
	{
		System.out.println("Non-abstract class");
	}
}
class B extends A 
{
	void display()
	{
		super.print();
		System.out.println("Child class-B");
	}
	// an B is inheriting the properties of A class then it has print method
}

public class NonAbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A s = new B();
		s.print();
		B a = new B();
		a.display();
		

	}

}

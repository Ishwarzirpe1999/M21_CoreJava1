package com.cg.abs;
//program for abstract class

abstract class Fruit
{  
	// abstract method
	abstract void display();
}

class Apple extends Fruit
{
	//provide implementation for abstract methodvcx
	void display()
	{
		System.out.println("Apple is good for out brain");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fruit f = new Fruit();
		//We can not create the obj for abstract class
		Fruit a =new Apple();
		Apple b = new Apple();
		a.display();
		b.display();

	}

}

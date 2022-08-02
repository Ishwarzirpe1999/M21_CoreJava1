package com.cg.superkeyword;
//super keyword = it is program for method 

class Animal
{
	public int a =75,b=56;
	public void display()
	{
		System.out.println("The addition of a and b is:"+(a+b));
	}
}
class Tiger extends Animal
{
	public void display() {
		System.out.println("Tiger");
	}
	void print()
	{
		display();
		//accessing the parent class method using super keyword
		super.display();
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// obj.creation
		Tiger t= new Tiger();
		t.print();

	}

}

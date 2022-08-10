package com.cg.generics;
//Example on Generic class

public class GenericClass<T> {
	//T is a type
	T num;
	public void display()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		GenericClass<Integer>obj=new GenericClass<Integer>();//Generics advantage
		obj.num=15;
		obj.display();

	}

}

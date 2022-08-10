package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj=new LinkedList<Integer>();
		obj.add(11);
		obj.add(12);
		//1.compile time checking and type safe
		//obj.add("12");
		
		System.out.println(obj);
		//2.Typecasting is not required in generics
		List<String>obj1 =new LinkedList<String>();
		//List obj1=new LinkedList();
		obj1.add("Ishwar");
		obj1.add("Prashant");
		String str = obj1.get(1);
		//Type casting explictely if there is not an object  type
		//String str1=(String)obj1.get(1);
		System.out.println(str);
		
		

	}

}

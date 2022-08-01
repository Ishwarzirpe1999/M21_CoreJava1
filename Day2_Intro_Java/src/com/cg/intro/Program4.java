package com.cg.intro;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char c=s.next().charAt(0);
		System.out.println("The character is "+c);
		s.close();


	}

}

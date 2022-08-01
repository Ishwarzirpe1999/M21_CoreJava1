package com.cg.encap;

import com.cg.encap.pack3.HDFC;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC h = new HDFC();
		h.setATM_PIN(1258);
		System.out.println("The ATM Pin is :"+h.getATM_PIN());

	}

}

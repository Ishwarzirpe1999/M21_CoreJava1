package com.cg.client1;

import com.cg.application1.MMBankFactory;
import com.cg.application1.MMCurrentAcc;
import com.cg.application1.MMSavingAcc;
import com.cg.framework1.BankFactory;
import com.cg.framework1.CurrentAcc;
import com.cg.framework1.SavingAcc;

public class Client1 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b = new MMBankFactory();
		
		CurrentAcc c = new MMCurrentAcc(623,"Rohit Zirpe",72160,30000);
		SavingAcc s = new MMSavingAcc(552,"Ishwar Zirpe",92160,true);
		s.withdraw(30000);
		c.withdraw(50000);
		System.out.println(s);
		System.out.println(c);
	}
}
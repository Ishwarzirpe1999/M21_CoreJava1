package com.cg.testing;
//program on assertion
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class FourthUnitTestingProgram {
	@Test
	void display()
	{
		int arr[]= {1,2,3,4,5};
		//assertEquals method will check whether the two parameters value are same or not 
		//if it is same them you will not get any failure otherwise you will get failures
		assertAll("arr",()->assertEquals(arr[3],4),//arr[3]=4//4==4//true//it runs successfully
				()->assertEquals(arr[2],3));
	}

	

}

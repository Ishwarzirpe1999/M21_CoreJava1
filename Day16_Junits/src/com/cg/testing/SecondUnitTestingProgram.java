package com.cg.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram
{
	@Test
	@BeforeAll
	static void display()
	{
		System.out.println("@BeforeAll-executes once before all the test method");
	}
	@Test
	@BeforeEach
	void accept()
	{
		System.out.println("@BeforEach-execute before each test method in this class");
	}
	

}

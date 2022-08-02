package com.cg.superkeyword;
//Super keyword - it is used to access parent class instance variable

class Mobile
{
	protected String name="Samsung";
}
class Samsung extends Mobile{
	String name ="Galxy M31s";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Samsung s = new Samsung();
		s.display();
	}

}

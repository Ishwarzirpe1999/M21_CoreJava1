package com.cg.framework;

public abstract class NormalAcc extends ShopAcc
{
	private final float deliveryCharges;
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account No is"+this.getAccNo()+" Accout Name is:"+this.getAccNm()+ 
				"Charges is:"+(charges+deliveryCharges));
	}
	
}

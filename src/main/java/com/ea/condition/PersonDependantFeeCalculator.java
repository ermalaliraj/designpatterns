package com.ea.condition;

public class PersonDependantFeeCalculator implements IPersonVisitor {

	public double InitialFee = 0.0d;

	public void HandleWoman(Woman visitee){
	        // we first look, what age the woman has and which age discount is to be granted
	        CarInsuranceAgeFeeDiscountVisitor visitor = new  CarInsuranceAgeFeeDiscountVisitor();
	        visitee.getAge().AcceptAgeCategoryVisitor(visitor);
	        
	        // then we calculate the overall discount
	        //this.InitialFee = InitialFee * (0.8 – visitor.GetDiscount());
	    }

	@Override
	public void HandleMan(Man visitee) {
		
	}

	@Override
	public void HandleBoy(Boy visitee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HandleGirl(Girl visitee) {
		// TODO Auto-generated method stub
		
	}

}

package com.ea.condition;

public class FeeCalculator implements IPersonVisitor {

	public double CalculateFee(Policy p) {
		PersonDependantFeeCalculator visitor = new PersonDependantFeeCalculator();
		p.getPerson().AcceptPersonVisitor(visitor);
		return visitor.InitialFee;
	}

	@Override
	public void HandleMan(Man visitee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HandleWoman(Woman visitee) {
		// TODO Auto-generated method stub
		
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

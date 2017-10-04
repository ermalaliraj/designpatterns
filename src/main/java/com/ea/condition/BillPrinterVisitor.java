package com.ea.condition;

public class BillPrinterVisitor implements IPersonVisitor {

	private Policy p;
	private String bill = "";

	public BillPrinterVisitor(Policy p) {
		this.p = p;
		bill += p.getPerson().getAddress().toString();
	}

	// prints the bill if the visited person is a man
	public void HandleMan(Man visitee) {
		this.bill += "Dear Mr. " + visitee.getName();
		this.PrintRest();
	}

	// prints the bill if the visited person is a woman
	public void HandleWoman(Woman visitee) {
		this.bill += "Dear Ms. " + visitee.getName();
		this.PrintRest();
	}

	// adds the value of policy fee to the bill regardless
	// if the policy is attached to a man or a woman
	private void PrintRest() {
		bill += "The fee for your police is: ";
		FeeCalculator feeCalculator = new FeeCalculator();
		bill += feeCalculator.CalculateFee(p);
	}

	public Policy getP() {
		return p;
	}

	public void setP(Policy p) {
		this.p = p;
	}

	public String getBill() {
		return bill;
	}

	public void setBill(String bill) {
		this.bill = bill;
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

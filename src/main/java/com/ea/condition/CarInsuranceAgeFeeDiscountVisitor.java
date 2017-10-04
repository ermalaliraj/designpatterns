package com.ea.condition;

public class CarInsuranceAgeFeeDiscountVisitor implements IAgeCategoryVisitor {

	private double discount = 0.0;
	private int age;

	public double GetDiscount() {
		return this.discount;
	}

	public void HandleChild(Child visitee) {
		//throw new ChildrenOughtNotDriveCarsException();
	}

	// young people cause more accidents, thus 50% higher insurance fee
	public void HandleYoungAged(YoungAged visitee) {
		this.discount = -.5;
	}

	// people in this age are assumed to be more responsible in traffic
	// as well, thus grant an additional discount of say 20%
	public void HandleMatureAged(MatureAged visitee) {
		this.discount = .2;
	}

	// elder people again cause more accidents due to lower reactivity, thus no discount
	public void HandleElderAged(ElderAged visitee) {
		this.discount = 0.0;
	}
	
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

package com.ea.condition;

public class Child extends AgeCategory {
	public void AcceptAgeCategoryVisitor(IAgeCategoryVisitor visitor) {
		visitor.HandleChild(this);
	}
}
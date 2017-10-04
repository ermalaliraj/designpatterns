package com.ea.condition;

// i.e for persons, which are between 61 and more years old
public class ElderAged extends AgeCategory {
	public void AcceptAgeCategoryVisitor(IAgeCategoryVisitor visitor) {
		visitor.HandleElderAged(this);
	}
}

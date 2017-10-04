package com.ea.condition;

// i.e for persons, which are between 26 and 60 years old
public class MatureAged extends AgeCategory {
	public void AcceptAgeCategoryVisitor(IAgeCategoryVisitor visitor) {
		visitor.HandleMatureAged(this);
	}
}
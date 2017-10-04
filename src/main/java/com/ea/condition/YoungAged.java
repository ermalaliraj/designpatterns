package com.ea.condition;

// i.e for persons, which are between 18 and 25 years old
public class YoungAged extends AgeCategory {
	
	public void AcceptAgeCategoryVisitor(IAgeCategoryVisitor visitor) {
		visitor.HandleYoungAged(this);
	}
	
}
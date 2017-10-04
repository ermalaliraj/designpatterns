package com.ea.condition;

public class Man extends Person {

	@Override
	public void AcceptPersonVisitor(IPersonVisitor visitor) {
		visitor.HandleMan(this);
	}

}

package com.ea.condition;

public class Woman extends Person {

	public void AcceptPersonVisitor(IPersonVisitor visitor) {
        visitor.HandleWoman(this);
    }
}


package com.ea.condition;

public class Girl extends Underage {

	public void AcceptPersonVisitor(IPersonVisitor visitor) {
		visitor.HandleGirl(this);
	}
}

package com.ea.condition;

public class Boy extends Underage {

	public void AcceptPersonVisitor(IPersonVisitor visitor) {
		visitor.HandleBoy(this);
	}
}

package com.ea.gof.behavioral.visitor;

public interface ComputerPart {
	
	public void accept(ComputerPartVisitor computerPartVisitor);
	
}
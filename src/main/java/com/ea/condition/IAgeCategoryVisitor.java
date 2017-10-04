package com.ea.condition;

public interface IAgeCategoryVisitor {
	
	void HandleChild(Child visitee);
	void HandleYoungAged(YoungAged visitee);
	void HandleMatureAged(MatureAged visitee);
	void HandleElderAged(ElderAged visitee);
	
}
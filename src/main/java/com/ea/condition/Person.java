package com.ea.condition;


public abstract class Person {
    
	public String name;
    public String address;
    public AgeCategory age;
    
    public abstract void AcceptPersonVisitor(IPersonVisitor visitor);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AgeCategory getAge() {
		return age;
	}

	public void setAge(AgeCategory age) {
		this.age = age;
	}
    
}
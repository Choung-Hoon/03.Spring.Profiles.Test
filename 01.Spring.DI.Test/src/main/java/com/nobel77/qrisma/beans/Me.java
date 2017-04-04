package com.nobel77.qrisma.beans;

public class Me extends Person{

	Family family;
	
	int age;

	public Me() {
		super();
	}
	
	public Me(Family family, String name, String address, int age) {
		this.name 		= name;
		this.address 	= address;
		this.age 		= age;
		this.family		= family;
	}
	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Name    : %s\nAddress : %s\nAge     : %d\nFamily  : %s", name, address, age, family.toString());
	}

}
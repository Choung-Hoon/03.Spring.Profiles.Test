package com.nobel77.qrisma.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

	String name;
	String address;
	int age;

	public Person() {
		super();
	}
	
	public Person(String name, String address, int age) {
		this.name 		= name;
		this.address 	= address;
		this.age 		= age;
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
		return String.format("Name    : %s\nAddress : %s\nAge     : %d", name, address, age);
	}

}
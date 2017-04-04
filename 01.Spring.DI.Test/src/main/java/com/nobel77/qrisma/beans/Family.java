package com.nobel77.qrisma.beans;

public class Family {

	String relation;	// one of mother/father/child
	Person info;
	
	public Family() {
		super();
	}
	
	public Family(Person info, String relation) {
		this.info		= info;
		this.relation 	= relation;
	}

	public Person getInfo() {
		return info;
	}

	public void setInfo(Person info) {
		this.info = info;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

}
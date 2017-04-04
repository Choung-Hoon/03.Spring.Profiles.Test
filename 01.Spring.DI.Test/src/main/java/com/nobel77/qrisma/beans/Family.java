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
	
	@Override
	public String toString() {
		return String.format("\n[\n관계 : %s\n정보\n%s\n]", nvl(relation), nvl(info));
	}
	
	public String nvl(Object value) {
		return (null == value ? "" : value.toString());
	}

}
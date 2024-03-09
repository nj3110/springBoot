package com.pg.springboot.db.springjdbc.emp;

public class EmpTable {

	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmpTable(int id, String name) {
		super();
		id = id;
		this.name = name;
	}

	public EmpTable() {
		super();
	}

	@Override
	public String toString() {
		return "EmpTable [Id=" + id + ", name=" + name + "]";
	}

}

package com.pg.springboot.db.springjdbc.emp;

public class EmpTable {

	int Id;
	String name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmpTable(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public EmpTable() {
		super();
	}

	@Override
	public String toString() {
		return "EmpTable [Id=" + Id + ", name=" + name + "]";
	}

}

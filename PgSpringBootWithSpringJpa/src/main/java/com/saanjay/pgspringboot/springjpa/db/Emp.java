package com.saanjay.pgspringboot.springjpa.db;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {
    @Id
	int id;
    
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "Emp [Id=" + id + ", name=" + name + "]";    
	}

	
}

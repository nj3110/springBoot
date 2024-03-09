package com.saanjay.pgspringboot.springjpa.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpSpringJpaRepository {
	@Autowired
	private EntityManager eManager ;
	
 public void insert(Emp emp) {
	 
	 eManager.merge(emp);
 }

}

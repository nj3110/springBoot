package com.saanjay.pgspringboot.springdatajpa.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpSpringDataJpaRepository extends JpaRepository<Emp, Integer> {

	
}

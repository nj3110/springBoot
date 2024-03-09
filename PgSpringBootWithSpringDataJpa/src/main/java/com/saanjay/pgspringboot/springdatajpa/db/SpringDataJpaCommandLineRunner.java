package com.saanjay.pgspringboot.springdatajpa.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class SpringDataJpaCommandLineRunner implements CommandLineRunner{
	@Autowired
	EmpSpringDataJpaRepository empSpringDataJpaRepository;
	
	@Override
	public void run(String... args) {
		
		empSpringDataJpaRepository.save(new Emp (1,"DataInsertedWithSpringDataJpa"));
		
	}

}

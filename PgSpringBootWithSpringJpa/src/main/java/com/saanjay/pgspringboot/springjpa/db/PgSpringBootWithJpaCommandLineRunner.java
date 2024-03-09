package com.saanjay.pgspringboot.springjpa.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class PgSpringBootWithJpaCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	EmpSpringJpaRepository empSpringJpaRepository ;
	@Override
	public void run(String...args) {
		
//		List<Emp> empData = new ArrayList<Emp>() ;
//		
//		empData.add(new Emp ())
		
		empSpringJpaRepository.insert(new Emp(1,"DataInsertedWithSpringJpa"));
		
	}

}

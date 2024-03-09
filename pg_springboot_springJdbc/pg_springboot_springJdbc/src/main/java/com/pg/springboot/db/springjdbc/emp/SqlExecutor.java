package com.pg.springboot.db.springjdbc.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class SqlExecutor implements CommandLineRunner {

	@Autowired
	DbOperations dbOperations;

	@Override
	public void run(String... args) {
		dbOperations.empInsert();
	}

}

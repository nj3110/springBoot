package com.pg.springboot.db.springjdbc.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DbOperations {
	@Autowired
	JdbcTemplate springJdbc;
	static String insertStr = """
			insert into emp (id, name) values (1, 'Neeraj') ;
			""";

	public void empInsert() {
		springJdbc.update(insertStr);
	}
}

package com.bytecode.startcms.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GrupoRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

}

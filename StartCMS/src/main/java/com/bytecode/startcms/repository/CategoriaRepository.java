package com.bytecode.startcms.repository;

import java.util.List;

import com.bytecode.startcms.mapper.CategoriaMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.startcms.model.Categoria;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

//@Repository
public class CategoriaRepository implements CategoriaRep {
	
	private Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;

	@PostConstruct
	public void postConstruct(){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean save(Categoria categoria) {
		try {
			String sql = String.format(
					"insert into Categoria (Nombre,Descripcion,CategoriaSuperior), values('%s', '%s', '%d'), values('%s', '%s', %d)",
					categoria.getNombre(), categoria.getDescripcion(), categoria.getCategoriaSuperiorior());
					jdbcTemplate.execute(sql);
						return true;
					}catch(Exception e) {
						logger.error(e);
					return false;
		}
	}
		public Categoria findById(int Id) {
		Object[] params = new Object[] {Id};
		return jdbcTemplate.queryForObject("select * from Categoria where IdCategoria = ?", params, new CategoriaMapper());
	}

	public void deleteAll(){
		jdbcTemplate.execute("delete from Categoria");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean update(Categoria object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Categoria> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
}

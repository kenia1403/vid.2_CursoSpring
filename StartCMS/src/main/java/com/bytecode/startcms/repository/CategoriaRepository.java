package com.bytecode.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.startcms.model.Categoria;

@Repository
public class CategoriaRepository implements CategoriaRep {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Categoria categoria) {
		try {
			String sql = String.format(
					"Insert into Categoria (Nombre,Descripcion,CategoriaSuperior)" 
					+ "values('%s', '%s', '%d')", 
					categoria.getNombre(), categoria.getDescripcion(), categoria.getCategoriaSuperior());
			jdbcTemplate.execute(sql);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean upDate(Categoria categoria) {
		if(categoria.getIdCategoria()!=0) {
			String sql = String.format("update Categoria set Nombre='%s', Descripcion='%s', CategoriaSuperior='%d'"
					+ " where ICategoria='%d' ", 
			categoria.getNombre(), categoria.getDescripcion(), categoria.getCategoriaSuperior(),
			categoria.getIdCategoria());
			jdbcTemplate.execute(sql);		
			
			return true;
		}
		return false;
	}

	@Override
	public List<Categoria> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
}

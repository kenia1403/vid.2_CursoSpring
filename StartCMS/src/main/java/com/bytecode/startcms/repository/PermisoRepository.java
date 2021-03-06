package com.bytecode.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.startcms.model.Permiso;

@Repository
public class PermisoRepository implements PermisoRep {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Permiso object) {
		try {
			String sql = String.format("insert into Permiso (Nombre) values ('%s')", 
					object.getNombre());
			jdbcTemplate.execute(sql);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean update1(Permiso object) {
		if(object.getIdPermiso()>0) {
			String sql = String.format("update Permiso set Nombre='%s' where IdPermiso='%d'", 
					object.getNombre(), object.getIdPermiso());
			jdbcTemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<Permiso> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permiso findById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object update(Permiso permiso) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.bytecode.startcms.mapper;

import org.springframework.jdbc.core.RowMapper;

import com.bytecode.startcms.model.Grupo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GrupoMapper implements RowMapper<Grupo> {
    @Override
    public Grupo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Grupo grupo = new Grupo();
        grupo.setIdgrupo(rs.getInt("IdGrupo"));
        grupo.setNombre(rs.getString("Nombre"));
        return grupo;
    }

}

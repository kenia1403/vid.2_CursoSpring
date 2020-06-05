package com.bytecode.startcms.mapper;

import org.springframework.jdbc.core.RowMapper;

import com.bytecode.startcms.model.UsuarioMetadata;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMetadataMapper implements RowMapper<UsuarioMetadata> {
    @Override
    public UsuarioMetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
        UsuarioMetadata usuarioMetadata = new UsuarioMetadata();
        usuarioMetadata.setClave(rs.getString("Clave"));
        usuarioMetadata.setIdUsuario(rs.getInt("IdUsuario"));
        usuarioMetadata.setIdUsuarioMetadata(rs.getInt("IdUsuarioMetadata"));
        usuarioMetadata.setValor(rs.getString("Valor"));
        usuarioMetadata.setTipo(rs.getString("Tipo"));
        return usuarioMetadata;
    }

}

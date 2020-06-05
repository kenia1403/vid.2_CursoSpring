package com.bytecode.startcms.mapper;

import org.springframework.jdbc.core.RowMapper;

import com.bytecode.startcms.model.Comentario;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ComentarioMapper implements RowMapper<Comentario> {
    @Override
    public Comentario mapRow(ResultSet rs, int rowNum) throws SQLException {
        Comentario comentario = new Comentario();
        comentario.setComentario(rs.getString("Comentario"));
        comentario.setFecha(rs.getDate("Fecha"));
        comentario.setIdComentario(rs.getInt("IdComentario"));
        comentario.setIdPost(rs.getInt("IdPost"));
        comentario.setIdUsuario(rs.getInt("IdUsuario"));
        comentario.setRespuesta(rs.getString("Respuesta"));
        return comentario;
    }


}
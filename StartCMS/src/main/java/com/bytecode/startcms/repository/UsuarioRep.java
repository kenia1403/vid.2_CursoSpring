package com.bytecode.startcms.repository;

import com.bytecode.startcms.model.Usuario;
import com.bytecode.startcms.model.UsuarioMetadata;

public interface UsuarioRep extends BaseRep<Usuario> {

	boolean save(UsuarioMetadata object);

	boolean update(UsuarioMetadata object);

}
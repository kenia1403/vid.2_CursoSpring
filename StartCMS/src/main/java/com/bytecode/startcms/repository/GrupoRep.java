package com.bytecode.startcms.repository;

import java.awt.print.Pageable;
import java.util.List;

import com.bytecode.startcms.model.Grupo;

public interface GrupoRep extends BaseRep<Grupo> {

	List<Grupo> findAll(Pageable pageable);

}

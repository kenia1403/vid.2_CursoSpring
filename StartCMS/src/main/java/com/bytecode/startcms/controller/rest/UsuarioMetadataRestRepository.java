package com.bytecode.startcms.controller.rest;

import com.bytecode.startcms.model.Usuario;
import com.bytecode.startcms.model.UsuarioMetadata;
import com.bytecode.startcms.model.common.RepBase;
import com.bytecode.startcms.repository.UsuarioMetadataRepository;
import com.bytecode.startcms.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuariometadata")
public class UsuarioMetadataRestRepository {
    @Autowired
    private UsuarioMetadataRepository repository;

    @PutMapping
    public ResponseEntity<RepBase> save(@RequestBody UsuarioMetadata usuario){
        return ResponseEntity.ok(new RepBase(repository.save(usuario)));
    }

    @PostMapping
    public ResponseEntity<RepBase> update(@RequestBody UsuarioMetadata usuario){
        return ResponseEntity.ok(new RepBase(repository.update(usuario)));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioMetadata>> findAll(SpringDataWebProperties.Pageable pageable){
        return ResponseEntity.ok(repository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioMetadata> findById(@PathVariable int id){
        return ResponseEntity.ok(repository.findById(id));
    }

}

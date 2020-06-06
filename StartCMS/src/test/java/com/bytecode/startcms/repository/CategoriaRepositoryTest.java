package com.bytecode.startcms.repository;

import com.bytecode.startcms.component.TestDatabaseConfiguration;
import com.bytecode.startcms.model.Categoria;

import java.sql.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class CategoriaRepositoryTest {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Test
    public void testInsert(){
        Categoria categoria = new Categoria();

        categoria.setNombre("Test2");
        categoria.setDescripcion("Este es un ejemplo de categoria superior");
        categoria.setCategoriaSuperiorior(1);

        boolean result = categoriaRepository.save(categoria);
        
        //categoriaRepository.deleteAll();

        Assert.assertTrue(result);
        
        
    }

}
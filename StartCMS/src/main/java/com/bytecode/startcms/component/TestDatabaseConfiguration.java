package com.bytecode.startcms.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.bytecode.startcms.repository.CategoriaRepository;
import com.bytecode.startcms.repository.UsuarioRepository;

import javax.sql.DataSource;

@Configuration
public class TestDatabaseConfiguration {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test_blog?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        dataSource.setUsername("bytecode");
        dataSource.setPassword("root1234");
        return dataSource;
    }

    @Bean
    public CategoriaRepository categoriaRepository(){
        return new CategoriaRepository();
    }

    @Bean
    public UsuarioRepository UsuarioRepository(){
        return new UsuarioRepository();
    }

}
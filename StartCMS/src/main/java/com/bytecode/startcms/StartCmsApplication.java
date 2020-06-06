package com.bytecode.startcms;

import org.apache.commons.logging.LogFactory;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartCmsApplication implements CommandLineRunner {
	
	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(StartCmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LogFactory.getLog(getClass()).info(environment.getProperty("bytecode.propiedad"));
	}

}

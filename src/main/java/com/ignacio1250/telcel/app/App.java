package com.ignacio1250.telcel.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan({"com.ignacio1250"})
@EntityScan("com.ignacio1250.telcel.model")
@EnableJpaRepositories("com.ignacio1250.telcel.dao")
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class,args);
	}

}

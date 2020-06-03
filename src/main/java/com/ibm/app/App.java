package com.ibm.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan
@EnableWebMvc
@EnableAutoConfiguration
@MapperScan("com.ibm.app.dao")
public class App {

	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

package com.bank.spring.mongo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bank.spring.mongo.api.controller", "com.bank.spring.mongo.api.model", "com.bank.spring.mongo.api.repository"})
public class BankApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApiApplication.class, args);
	}

}

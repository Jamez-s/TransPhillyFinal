package com.septaroutes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableAutoConfiguration
public class SeptaRoutesApplication {
	public static void main(String[] args) {
		SpringApplication.run(SeptaRoutesApplication.class, args);
	}
}

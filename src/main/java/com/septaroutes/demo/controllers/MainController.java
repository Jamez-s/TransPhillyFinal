package com.septaroutes.demo.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
}

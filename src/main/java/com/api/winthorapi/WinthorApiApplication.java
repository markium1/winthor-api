package com.api.winthorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WinthorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WinthorApiApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "<h1>Olá Mundo</h1>";
	}
}

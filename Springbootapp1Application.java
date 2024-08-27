package com.verizon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class Springbootapp1Application {
	public static void main(String[] args) {
		SpringApplication.run(Springbootapp1Application.class, args);
	}
}

//http://localhost:8089/swagger-ui/index.html
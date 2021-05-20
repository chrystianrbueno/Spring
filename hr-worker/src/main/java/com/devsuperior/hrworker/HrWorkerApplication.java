		package com.devsuperior.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HrWorkerApplication {

	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(HrWorkerApplication.class, args);
	}

}
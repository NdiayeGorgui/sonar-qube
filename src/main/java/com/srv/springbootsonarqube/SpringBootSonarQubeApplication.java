package com.srv.springbootsonarqube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSonarQubeApplication {

	@GetMapping("/test")
	public String getMessage() {
		return "sonar-qube";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSonarQubeApplication.class, args);
	}

}

package com.srv.springbootsonarqube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSonarQubeApplication {
String s="";

	@GetMapping("/test")
	public String getMessage() {
		System.out.println("aaaa");
		return "sonar-qube";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSonarQubeApplication.class, args);
	}

}

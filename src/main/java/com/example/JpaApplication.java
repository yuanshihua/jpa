package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.service.JpaService;

@SpringBootApplication
public class JpaApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);
		JpaService service = context.getBean(JpaService.class);
//		service.findEmployee();
		service.insertEmployee(6,"john",4000,"clerk");
//		service.deleteEmployee(6);
	}
}

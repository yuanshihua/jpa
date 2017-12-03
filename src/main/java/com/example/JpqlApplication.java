package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.entity.Employee;
import com.example.service.JpqlService;

@SpringBootApplication
public class JpqlApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpqlApplication.class, args);
		JpqlService service = context.getBean(JpqlService.class);
//		service.update();
		Employee e = service.query("john", 6);
		System.out.println(e);
	}
}

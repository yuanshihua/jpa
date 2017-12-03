package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.CustomerService;
import com.example.service.JpqlService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpqlApplicationTests {
	@Autowired
	JpqlService service;
	
	@Autowired
	private CustomerService cs;

	@Test
	public void query() {
//		service.query();
		cs.findByLastName();
	}
	
	@Test
	public void update() {
//		service.update("wanger",6);
		cs.update(4, "you", "sb");
		
	}
	@Test
	public void delete() {
//		service.delete("wanger");
		cs.delete(4);
	}
	@Test
	public void insert() {
		cs.insert("liu","heh");
		
	}

}

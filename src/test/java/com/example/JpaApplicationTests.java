package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.JpaService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaApplication.class)
public class JpaApplicationTests {
	@Autowired
	private JpaService service;

	@Test
	public void find() {
		service.findEmployee(0);
	}
	
	@Test
	public void insert() {
		service.insertEmployee(0, null, 0, null);
	}

}

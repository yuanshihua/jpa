package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerRepository;
import com.example.entity.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository cr;

	public List<Customer> findByLastName() {
		return cr.findByLastName("heheda");
	}

	public void update(long id, String firstName, String lastName) {
		Customer c = new Customer();
		c.setId(id);
		c.setFirstName(firstName);
		c.setLastName(lastName);
		cr.saveAndFlush(c);
		System.out.println("更新成功");
	}

	public void insert(String firstName, String lastName) {
		cr.save(new Customer("li", "si"));
		cr.save(new Customer("wang", "wu"));
		cr.save(new Customer("zhao", "lv"));
		cr.save(new Customer(firstName, lastName));
		System.out.println("插入成功");
	}

	public void delete(long id) {
		Customer c = new Customer();
		c.setId(id);
		cr.delete(c);
	}

	public void deleteByName(String firstName) {
		cr.deleteByFirstName(firstName);
	}
}

package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
public class JpaService {
	@PersistenceContext
	EntityManager manager;
	
	public void findEmployee(int id) {
		Employee e  = manager.find(Employee.class, id);
		System.out.println(e);
	}
	
	@Transactional
	public void insertEmployee(int id ,String name , int salary , String deg) {
		Employee e  = new Employee();
		e.setEid(id);
		e.setEname(name);
		e.setSalary(salary);
		e.setDeg(deg);
		//別忘記持久化
		manager.persist(e);
	}
	
	@Transactional
	public void deleteEmployee(int id) {
		Employee e = manager.find(Employee.class, id);
		manager.remove(e);
	}
}

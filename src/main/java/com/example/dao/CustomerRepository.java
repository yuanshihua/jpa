package com.example.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.example.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {
	public List<Customer> findByLastName(String lastName);
	
	@Transactional
	@Modifying
	public void deleteByFirstName(String firstName);
}

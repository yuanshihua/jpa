package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Data
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long eid;

	private String ename;

	private double salary;
	
	@ManyToOne
	private Dept dept;

}
package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Data
@Table(name="employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int eid;
	
	private String deg;

	private String ename;

	private double salary;

}
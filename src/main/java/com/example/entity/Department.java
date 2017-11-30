package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="dept")
public class Department {
	@Id
	private int deptno;
	@Column(name="deptname")
	private String name;
	@Column(name="id")
	private int id;
}

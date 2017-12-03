package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CriteriaService {
	@PersistenceContext
	private EntityManager em;

//	public List<Employee> cquery() {
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Employee> criteriaQuery = cb.createQuery(Employee.class);
//		Root<Employee> emp = criteriaQuery.from(Employee.class);
//		CriteriaQuery<Employee> query = criteriaQuery.select(emp).where(cb.equal(emp.get("ename"), "lisi"));
//	}
}

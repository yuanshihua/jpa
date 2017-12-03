package com.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
public class JpqlService {
	@PersistenceContext
	EntityManager em;

	public void query() {
		TypedQuery<Employee> query = em.createQuery("select e from Employee e where e.ename='john'", Employee.class);
		List<Employee> list = query.getResultList();
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

	public Employee query(String ename, int eid) {
		Employee e = new Employee();
		e = em.createQuery("select e from Employee e where e.ename=?1 and eid=?2", Employee.class)
				.setParameter(1, ename).setParameter(2, eid).getSingleResult();
		return e;
	}

	@Transactional
	public int update(String ename, int eid) {
		int result = em.createQuery("update Employee e set e.ename =?1 where e.eid=?2")
				.setParameter(1, ename)
				.setParameter(2, eid)
				.executeUpdate();
		return result;
	}
	
	@Transactional
	public int delete(String ename) {
		int result = em.createQuery("delete from Employee as e where ename=:ename")
		.setParameter("ename", ename)
		.executeUpdate();
		return result;
	}
}

package cn.com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import cn.com.example.entity.Employee;

public class FindEmployee {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_link");
		EntityManager em = emf.createEntityManager();
		Employee emp = em.find(Employee.class, 110);
		System.out.println(emp);
	}
}

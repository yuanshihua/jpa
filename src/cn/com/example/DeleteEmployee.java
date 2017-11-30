package cn.com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import cn.com.example.entity.Employee;

public class DeleteEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_link");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//主键不能为0
		Employee e = em.find(Employee.class, 1);
		em.remove(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}	

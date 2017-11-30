package cn.com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cn.com.example.entity.Employee;

public class InsertEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("jpa_link");
		EntityManager manager = emfactory.createEntityManager();

		manager.getTransaction().begin();

		Employee employee = new Employee();
		employee.setEid(110);
		employee.setEname("yuanshihua");
		employee.setSalary(20000);
		employee.setDeg("Manager");

		manager.persist(employee);
		manager.getTransaction().commit();
		manager.close();
		emfactory.close();
		System.out.println("插入成功");
	}
}

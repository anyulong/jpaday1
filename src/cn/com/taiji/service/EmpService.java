package cn.com.taiji.service;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Temporal;
import javax.persistence.Transient;

import org.eclipse.persistence.annotations.Transformation;

import cn.com.taiji.pojo.Employee;

public class EmpService {
	
	protected EntityManager entityManager;
	 public EmpService(EntityManager entityManager) {
	 this.entityManager = entityManager;
	 }
	 @PersistenceContext 
	 private EntityManager em;
	 
	public Employee insEmp(String name,double salary) {
	
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSalary(BigDecimal.valueOf(salary));	
		return employee;
	
	}
	
	
	public void insEmp2() {
		Employee employee  = new Employee();
		employee.setName("李四");
		em.persist(employee);
	}
}

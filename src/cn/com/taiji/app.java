package cn.com.taiji;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import cn.com.taiji.pojo.Employee;
import cn.com.taiji.service.EmpService;

public class app {
	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myjpa");
		EntityManager entityManager = emfactory.createEntityManager();
		EmpService es = new EmpService(entityManager);
		entityManager.getTransaction().begin();
		
		Employee employee  = es.insEmp("张三", 80.0);
		
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		emfactory.close();
		
		
		
		
	}
	
}

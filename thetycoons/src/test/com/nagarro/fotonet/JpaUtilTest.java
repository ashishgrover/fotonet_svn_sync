package com.nagarro.fotonet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class JpaUtilTest {
	
	private static String PERSISITENCE_UNIT_NAME = "fotomgmt";
	
	public static void main(String[] args) {
		JpaUtilTest jpaUtilTest = new JpaUtilTest();
		jpaUtilTest.executeQueryTest();
	}
	
	private void createEmfTest() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISITENCE_UNIT_NAME);
	}
	
	
	private void createEmTest() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISITENCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
	}
	
	private void executeQueryTest () {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISITENCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		Query query = em.createNativeQuery("Select * from student");
		query.getResultList();
	}
	
	
	/*@Test
	public void testJPASetup() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("fotomgmt");
	}*/
}

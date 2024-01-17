package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		AssPerson p=em.find(AssPerson.class, 1);
		PanCard p1=p.getCard();
		
		et.begin();
		em.remove(p);
		em.remove(p1);
		et.commit();
		
		
		System.out.println("deleted...");
				
		

	}

}

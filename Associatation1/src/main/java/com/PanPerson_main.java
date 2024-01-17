package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PanPerson_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		PanCard p=new PanCard();
		p.setPanno(11);
		p.setAddress("abc123");
		p.setDob("15/02/2002");
		
		AssPerson Ap=new AssPerson();
		Ap.setGender("male");
		Ap.setMobile(902515912);
		Ap.setName("jayakumar");
		Ap.setCard(p);
		
		
		try {
			et.begin();
			em.persist(Ap);
			em.persist(p);
			et.commit();
			
			System.out.println("data saved..");
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
			// TODO: handle exception
		}

	}

}

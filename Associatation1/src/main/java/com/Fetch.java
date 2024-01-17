package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		/*Query q=em.createQuery("select A from AssPerson A");
		 List <AssPerson> list=q.getResultList();
		 for (AssPerson a : list) {
			 System.out.println(a);
		 }*/
		
		
		
		//or
		
		 AssPerson p=em.find(AssPerson.class,1 );
		 System.out.println(p);
		 
		 PanCard p1=em.find(PanCard.class, 11);
		 System.out.println(p1);
		
		
		 
		 System.out.println("Data reterived...");
	}

}

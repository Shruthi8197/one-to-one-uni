package com.ty.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class,1);
		if(person!=null) {
			System.out.println("Person id is:"+person.getId());
			System.out.println("Person name is:"+person.getName());
			System.out.println("Person gender is:"+person.getGender());
			System.out.println("******************************");
		}else {
			System.out.println("Person not found");
		}
		
		Pan pan=person.getPan();
		if(pan!=null) {
			System.out.println("Pan id:"+pan.getId());
			System.out.println("Pan number is:"+pan.getNumber());
			System.out.println("Pan type is:"+pan.getType());
		}

	}

}

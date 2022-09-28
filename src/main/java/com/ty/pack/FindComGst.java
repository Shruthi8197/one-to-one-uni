package com.ty.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindComGst {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		GST gst=entityManager.find(GST.class, 2);
		
		if(gst!=null) {
			System.out.println("Gst id is:"+gst.getId());
			System.out.println("Gst number is:"+gst.getNumber());
			System.out.println("Gst Status is:"+gst.getStatus());
			System.out.println("****************");
		}else {
			System.out.println("GST details not found");
		}
		
		Company company=gst.getCompany();
		if(company!=null) {
			System.out.println("Company id is:"+company.getId());
			System.out.println("Company name is:"+company.getName());
			System.out.println("Company address is:"+company.getAddress());
		}else {
			System.out.println("No company found");
		}
		
		

	}

}

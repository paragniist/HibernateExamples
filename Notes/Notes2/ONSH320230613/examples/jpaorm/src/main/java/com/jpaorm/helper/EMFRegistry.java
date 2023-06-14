package com.jpaorm.helper;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMFRegistry {
	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("pu1");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static EntityManagerFactory getEmf() {
		return emf;
	}

	public static void closeEmf() {
		if (emf != null) {
			emf.close();
			emf = null;
		}
	}
}

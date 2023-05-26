package com.flc.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFRegistory {
	private static SessionFactory sessionFactory;
	
	static {
		try {
			Configuration configuration=new Configuration().configure();
			sessionFactory=configuration.buildSessionFactory();
		}catch(Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}
	public static SessionFactory getsessSessionFactory() {
		return sessionFactory;
	}
	public static void closeSessionFactory() {
		if(sessionFactory!=null) {
			sessionFactory.close();
			sessionFactory=null;
		}
	}
}
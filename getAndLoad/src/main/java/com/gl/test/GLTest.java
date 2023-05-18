package com.gl.test;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryRegistry;

import com.gl.entities.IPassenger;
import com.gl.entities.Passenger;
import com.gl.helper.SFRegistry;

public class GLTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Passenger passenger=null;
		
		try {
			sessionFactory=SFRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			
			//getEagerAndLoadLazy(session, 11);
			//getEagerAndLoadNoRecord(session,1);
			//getEagerandLoadDisableLazyLoading(session, 10);
			//getAndLoadInterface(session,10);
			getAndLoadActivesession(session,10);

		}finally {
			if(session!=null) {
				session.close();
			}
			SFRegistry.closesSessionFactory();
		}
	}
	private static void getEagerAndLoadLazy(Session session,int passengerNo) {
		Passenger passenger1=null;
		Passenger passenger2=null;
		
		//passenger1=session.get(Passenger.class,passengerNo);
		passenger2=session.load(Passenger.class,passengerNo);
		//System.out.println("passenger1 class type is "+ passenger1.getClass().getName());
		System.out.println("passenger2 class type is "+ passenger2.getClass().getName());
		//System.out.println(passenger1.getPassengerName());
		System.out.println(passenger2.getPassengerName());
	}
	private static void getEagerAndLoadNoRecord(Session session,int passengerNo) {
		Passenger passenger1=null;
		Passenger passenger2=null;
		
		passenger1=session.get(Passenger.class,passengerNo);
		if(passenger1==null) {
			System.out.println("object not found");
		}else {
			System.out.println("passenger2 class type is "+ passenger1.getClass().getName());
			System.out.println("Passenger name "+passenger1.getPassengerName());
		}
		try {
			passenger2=session.load(Passenger.class,passengerNo);
			System.out.println("object not found");
			System.out.println("passenger2 class type is "+ passenger2.getClass().getName());
			System.out.println("Passenger name "+passenger2.getPassengerName());
		}catch(Exception e) {
			System.out.println("data not found");
		}
		
	}
	
	private static void getEagerandLoadDisableLazyLoading(Session session,int passengerNo) {
		Passenger passenger=null;
		passenger=session.load(Passenger.class,passengerNo);
		System.out.println("passenger1 class type is "+ passenger
				.getClass().getName());
		System.out.println("Passenger name "+passenger.getPassengerName());
	}
	
	private static void getAndLoadInterface(Session session,int passengerNo) {
		IPassenger passenger=null;
		passenger=session.load(IPassenger.class,passengerNo);
		System.out.println("passenger class type is "+ passenger.getClass().getName());
		System.out.println("Passenger name "+passenger.getPassengerName());
	}
	private static void getAndLoadActivesession(Session session,int passengerNo) {
		Passenger passenger1=null;
		Passenger passenger2=null;
		
		passenger1=session.get(Passenger.class,passengerNo);
		session.close();
		System.out.println("Passenger name "+passenger1.getPassengerName());
		//passenger2=session.load(Passenger.class,passengerNo);
		//session.close();
		//System.out.println("Passenger name "+passenger2.getPassengerName());
	}

}

package com.HibernateExample;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
      cfg.configure("com/hb/common/Hibernate.cfg.xml");
      SessionFactory factory = cfg.buildSessionFactory();
      
      Student st = new Student();
     st.setId(10);
      st.setStudentName("Rafiya");
      st.setCourse("8th pass");
      st.setDuration("2 years");
      st.setFee(4000);
      
//      // My Address 
//     Address1 ad = new Address1();
//     ad.setAddressId(2);
//     ad.setStreet("kachikuda coloney");
//     ad.setCity("Hyderbad");
//     ad.setOpen(true);
//     ad.setX(234.9);
//     //ad.setAddedDate(new Date());
//     
     
      Session session = factory.openSession();
      Transaction tx = session.beginTransaction();
      session.save(st);
      tx.commit();
      session.close();
      System.out.println("Done............!");
    }
}

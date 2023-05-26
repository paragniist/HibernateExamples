package com.flc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flc.entities.Product;
import com.flc.helper.SFRegistory;

public class FLCTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Transaction transaction=null;
		Session session=null;
		boolean flag=false;
		try {
			sessionFactory=SFRegistory.getsessSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			//Product product1=session.get(Product.class,1);
			//session.close();
			
			//session=sessionFactory.openSession();
			//Product product2=session.get(Product.class,1);
			
			//System.out.println("product1==product2? :"+(product1==product2));

			/*Product product=new Product();
			product.setProductNo(11);
			product.setProductNm("washing machine");
			product.setDescription("automatic");
			product.setManufacturerNm("LG");
			product.setCategory("electronics");
			product.setPrice(30000);
			
			session.persist(product);
			session.flush();*/
			
			Product product=session.get(Product.class, 11);
			product.setProductNm("AC");
			session.update(product);
			//session.evict(product);
			session.clear();
			//session.clear();
			flag=true;
		}finally {
			if(transaction!=null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
			if(session!=null) {
				session.close();
			}
			SFRegistory.closeSessionFactory();
		}
	}
}

/*
 * 1.first level cache: is implemented at session/operation level, hb f/w provides cache internally we no need to
explicitly give any for storing in cache.
2. only once we create a session it will go to database and cache the data at once, whenever we want fetch
same data it will be fetched from cache.
3. if my data in cache is out-dated(stale) then evict(object)
4. one session one cache

*/


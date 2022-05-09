package com.csi.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {

	private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Customer customer = new Customer("RAJ", 4546567677L, 4554656.22);

		session.save(customer);
		transaction.commit();

	}

}

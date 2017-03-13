package io.shop;

import java.util.Random;
import java.util.UUID;

import io.persistance.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("shop")
				                                 .createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.remove(entityManager.find(Customer.class, 1l));
			entityManager.remove(entityManager.find(Customer.class, 2l));
			explode();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw e;
		}
	}

	private static void explode() {
		throw new RuntimeException("In purpose ...");
	}
}

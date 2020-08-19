package br.udesc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Dao <T> {

	public String salvar(T tipo) {
		System.out.println("aqui1");
	   EntityManager entityManager = JPAUtil.getEntityManager();
	   System.out.println("aqui2");
	   EntityTransaction entityTransaction = entityManager.getTransaction();
	   System.out.println("aqui3");
	   entityTransaction.begin();
	   entityManager.persist(tipo);
	   entityTransaction.commit();
	   entityManager.close();
	   return"Salvo com sucesso";
	}
	
}

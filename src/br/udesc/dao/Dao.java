package br.udesc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public abstract class Dao<T> {

	public String salvar(T tipo) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(tipo);
		entityTransaction.commit();
		entityManager.close();
		return  tipo.getClass().getSimpleName()+" Salvo(a) com sucesso!";
	}

}

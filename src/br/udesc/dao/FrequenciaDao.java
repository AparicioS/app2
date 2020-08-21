package br.udesc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.udesc.excecoes.RegistroNaoEncontrado;
import br.udesc.modelo.Disciplina;
import br.udesc.modelo.Frequencia;

public class FrequenciaDao extends Dao<Frequencia> {
	
	public List<Frequencia> listar() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM frequencia d", Frequencia.class);
		List<Frequencia> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new RegistroNaoEncontrado();
		}
		return lista;
	}
	
	public Frequencia getId(int id) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM frequencia d WHERE id_frequencia = " +id, Disciplina.class);
		List<Frequencia> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new RegistroNaoEncontrado();
		}
		return lista.get(0);
	}

}

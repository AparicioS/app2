package br.udesc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.sound.midi.Soundbank;

import br.udesc.excecoes.RegistroNaoEncontrado;
import br.udesc.modelo.Disciplina;

public class DisciplinaDao extends Dao<Disciplina> {
	
	public List<Disciplina> listar() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM disciplina d", Disciplina.class);
		List<Disciplina> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new RegistroNaoEncontrado();
		}
		return lista;
	}
	
	public Disciplina getId(int id) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM disciplina d WHERE cd_disciplina = " +id, Disciplina.class);
		List<Disciplina> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new RegistroNaoEncontrado();
		}
		return lista.get(0);
	}
}

package br.udesc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.udesc.excecoes.ObjetoInexistente;
import br.udesc.modelo.Disciplina;
import br.udesc.modelo.Professores;

public class ProfessoresDao extends Dao<Professores> {
	
	public List<Professores> listar() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM professores d", Professores.class);
		List<Professores> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new ObjetoInexistente("Professor");
		}
		return lista;
	}
	
	public Professores getId(int id) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM professores d WHERE cd_professor = " +id, Professores.class);
		List<Professores> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new ObjetoInexistente("Professor");
		}
		return lista.get(0);
	}

}

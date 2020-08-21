package br.udesc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.udesc.excecoes.RegistroNaoEncontrado;
import br.udesc.modelo.Disciplina;
import br.udesc.modelo.DisciplinaProfessores;

public class DisciplinaProfessorDao extends Dao<DisciplinaProfessores> {
	
	public List<DisciplinaProfessores> listar() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM disciplina_professores d", DisciplinaProfessores.class);
		List<DisciplinaProfessores> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new RegistroNaoEncontrado(" Turma ");
		}
		return lista;
	}
	
	public DisciplinaProfessores getId(int id) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM disciplina_professores d WHERE ds_semestre = " +id, DisciplinaProfessores.class);
		List<DisciplinaProfessores> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new RegistroNaoEncontrado();
		}
		return lista.get(0);
	}

}

package br.udesc.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


import br.udesc.modelo.Avaliacoes;
import br.udesc.modelo.Disciplina;


public class AvaliacaoDao extends Dao<Avaliacoes> {

	public List<Avaliacoes> listar() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM avaliacao d", Avaliacoes.class);
		List<Avaliacoes> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new ObjetoInexistente("Avalia��o");
		}
		return lista;
	}
}

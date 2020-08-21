package br.udesc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.udesc.excecoes.RegistroNaoEncontrado;
import br.udesc.modelo.ServicoUsuarioAutorizado;

public class ServicosUsuarioDao extends Dao<ServicoUsuarioAutorizado> {
	
	public List<ServicoUsuarioAutorizado> listar() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query q  = entityManager.createNativeQuery("SELECT * FROM servicousuarioautorizado d", ServicoUsuarioAutorizado.class);
		List<ServicoUsuarioAutorizado> lista = q.getResultList();
		entityTransaction.commit();
		entityManager.close();
		if(lista.size() == 0) {
			throw new RegistroNaoEncontrado();
		}
		return lista;
	}

}

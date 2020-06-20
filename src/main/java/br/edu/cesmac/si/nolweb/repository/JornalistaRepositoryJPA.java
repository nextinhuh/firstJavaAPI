package br.edu.cesmac.si.nolweb.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.edu.cesmac.si.nolweb.domain.Editoria;
import br.edu.cesmac.si.nolweb.domain.Jornalista;

public class JornalistaRepositoryJPA implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public JornalistaRepositoryJPA() {}

	public JornalistaRepositoryJPA(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<Jornalista> listarTodos() {
		CriteriaQuery<Jornalista> query = manager.getCriteriaBuilder().createQuery(Jornalista.class);
		query.select(query.from(Jornalista.class));

		List<Jornalista> lista = manager.createQuery(query).getResultList();

		return lista;		
	}
	
	public void salvar(Jornalista jornalista) {
		manager.getTransaction().begin();
		manager.merge(jornalista);
		manager.getTransaction().commit();
	}
	
}

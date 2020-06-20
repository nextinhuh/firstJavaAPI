package br.edu.cesmac.si.nolweb.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.cesmac.si.nolweb.domain.Editoria;
import br.edu.cesmac.si.nolweb.domain.Jornalista;
import br.edu.cesmac.si.nolweb.repository.JornalistaRepositoryJPA;

@ApplicationScoped
public class JornalistaService {
	
	@Inject
	JornalistaRepositoryJPA jornalistaRepository;
	
	public List<Jornalista> listarTodos() {
			return jornalistaRepository.listarTodos();		
	}	
	
	public void salvar(Jornalista jornalista) {
		this.jornalistaRepository.salvar(jornalista);
	}

}

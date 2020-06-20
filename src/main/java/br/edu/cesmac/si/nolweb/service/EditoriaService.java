package br.edu.cesmac.si.nolweb.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.cesmac.si.nolweb.domain.Editoria;
import br.edu.cesmac.si.nolweb.repository.EditoriaRepositoryJPA;

@ApplicationScoped
public class EditoriaService {

	@Inject
	EditoriaRepositoryJPA editoriaRepository;

	public List<Editoria> listarTodos() {
		return this.editoriaRepository.listarTodos();
	}

	public void salvar(Editoria editoria) {
		this.editoriaRepository.salvar(editoria);
	}

}

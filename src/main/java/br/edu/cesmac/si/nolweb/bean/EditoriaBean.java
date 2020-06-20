package br.edu.cesmac.si.nolweb.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.cesmac.si.nolweb.domain.Editoria;
import br.edu.cesmac.si.nolweb.service.EditoriaService;

@Named
@ViewScoped
public class EditoriaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Editoria editoria;
	
	@Inject
	private EditoriaService editoriaService;	
	
	public EditoriaBean() {
		this.editoria = new Editoria();
	}

	public List<Editoria> getEditorias() {
		return this.editoriaService.listarTodos();
	}
	
	public String salvar() {
		this.editoriaService.salvar(editoria);
		return "consultar?faces-redirect=true";
	}

	public Editoria getEditoria() {
		return editoria;
	}

	public void setEditoria(Editoria editoria) {
		this.editoria = editoria;
	}

}

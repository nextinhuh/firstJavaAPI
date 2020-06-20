package br.edu.cesmac.si.nolweb.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.cesmac.si.nolweb.domain.Jornalista;
import br.edu.cesmac.si.nolweb.service.JornalistaService;

@Named
@ViewScoped
public class JornalistaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Jornalista jornalista;
	private List<Jornalista> jornalistas;
	
	@Inject
	private JornalistaService jornalistaService;	
	
	public JornalistaBean() {
		this.jornalista = new Jornalista();
	}

	public Jornalista getJornalista() {
		return this.jornalista;
	}

	public void setJornalista(Jornalista jornalista) {
		this.jornalista = jornalista;
	}

	public void setJornalistas(List<Jornalista> jornalistas) {
		this.jornalistas = jornalistas;
	}

	public List<Jornalista> getJornalistas() {
		return jornalistaService.listarTodos();
	}

	public String salvar() {
		this.jornalistaService.salvar(jornalista);
		return "consultar?faces-redirect=true";
	}

}

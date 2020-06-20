package br.edu.cesmac.si.nolweb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Noticia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNoticia;

	@NotEmpty(message = "Obrigatório informar o título da Notícia")
	private String titulo;
	
	@ManyToOne
	@NotNull(message = "Obrigatório informar editoria da Notícia")
	private Editoria editoria;
	
	@ManyToOne
	@NotNull(message = "Obrigatório informar o Jornalista da Notícia")	
	private Jornalista jornalista;

	public Long getIdNoticia() {
		return idNoticia;
	}

	public void setIdNoticia(Long idNoticia) {
		this.idNoticia = idNoticia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Editoria getEditoria() {
		return editoria;
	}

	public void setEditoria(Editoria editoria) {
		this.editoria = editoria;
	}

	public Jornalista getJornalista() {
		return jornalista;
	}

	public void setJornalista(Jornalista jornalista) {
		this.jornalista = jornalista;
	}


}

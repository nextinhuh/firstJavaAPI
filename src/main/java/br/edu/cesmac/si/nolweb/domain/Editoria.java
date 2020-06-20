package br.edu.cesmac.si.nolweb.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Editoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_editoria")
	private Long idEditoria;

	@NotEmpty(message = "Obrigatório informar o nome da Editoria")
	private String nome;
	
	@OneToMany(mappedBy = "editoria", fetch = FetchType.LAZY)
	private List<Noticia> noticias;
	
	public Editoria() {
	}
	
	public Editoria(Long idEditoria, String nome) {
		this.idEditoria = idEditoria;
		this.nome = nome;
	}

	public Long getIdEditoria() {
		return idEditoria;
	}

	public void setIdEditoria(Long idEditoria) {
		this.idEditoria = idEditoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}
	
	

}

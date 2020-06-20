package br.edu.cesmac.si.nolweb.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Jornalista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_jornalista")
	private Long idJornalista;

	@NotEmpty(message = "Obrigatório informar o nome do Jornalista")
	private String nome;

	@NotNull(message = "Obrigatório informar um e-mail")
	@Email(message = "Informe um e-mail válido")
	private String email;

	@NotEmpty(message = "Obrigatório informar a Biografia do Jornalista")
	private String biografia;

	@OneToMany(mappedBy = "jornalista")
	private List<Noticia> noticias;

	public Long getIdJornalista() {
		return idJornalista;
	}

	public void setIdJornalista(Long idJornalista) {
		this.idJornalista = idJornalista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public List<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}

}

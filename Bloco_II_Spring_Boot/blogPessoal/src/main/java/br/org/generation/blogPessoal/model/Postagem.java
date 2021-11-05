package br.org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_postagem")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/** 
	 * A annotation @NotNull indica que um atributo não pode ser nulo
	 * O parametro messege indica a mensagem que sera exibida caso o atributo seja nulo
	 * 
	 * A annotation @Size determina a quantidade de caracteres que pode
	 */
	
	@NotNull(message = "O atributo título é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo titulo deve conter no mínimo 5 e no máximo 100 caracteres")
	private String titulo;
	
	@NotBlank (message = "O atributo título é obrigatório")
	@Size (min = 10, max = 1000, message = "O Atributo título deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}

/*Ela serve de apoio no processo de recebimento de dados da API, mas ela não vai
armazenar nada no banco de dados (por isso que ela não tem anotação)*/

package br.org.generation.DriBlog.model;

public class UserLogin {

	private String nome;

	private String usuario;

	private String senha;

	private String token;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}

package br.com.caelum.estoque.modelo.usuario;

public class Usuario {

	private String nome;
	private String login;
	private String senha;
	
	Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
	
	public static class Builder {
		
		private String nome;
		private String login;
		private String senha;
		
		public Builder comNome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Builder comLogin(String login) {
			this.login = login;
			return this;
		}
		
		public Builder comSenha(String senha) {
			this.senha = senha;
			return this;
		}
		
		public Usuario build() {
			return new Usuario(nome,login,senha);
		}
	}
	
	
	
}

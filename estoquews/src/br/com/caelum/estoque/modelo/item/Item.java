package br.com.caelum.estoque.modelo.item;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {

	private String codigo;
	private String nome;
	private String tipo;
	private int quantidade;

	Item() {
		super();
	}

	public Item(String codigo, String nome, String tipo, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
	}

	Item(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return this.codigo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Item item = (Item)obj;
		return this.codigo.equals(item.codigo);
	}
	
	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", nome=" + nome + ", tipo=" + tipo + ", quantidade="
				+ quantidade + "]";
	}

	public static class Builder {
		
		private String codigo;
		private String nome;
		private String tipo;
		private int quantidade;
		
		public Builder comNome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Builder comTipo(String tipo) {
			this.tipo = tipo;
			return this;
		}
		
		public Builder comCodigo(String codigo) {
			this.codigo = codigo;
			return this;
		}
		
		public Builder comQuantidade(int quantidade) {
			this.quantidade = quantidade;
			return this;
		}
		
		public Item build() {
			return new Item(this.codigo,this.nome,this.tipo,this.quantidade);
		}
		
	}
	
}

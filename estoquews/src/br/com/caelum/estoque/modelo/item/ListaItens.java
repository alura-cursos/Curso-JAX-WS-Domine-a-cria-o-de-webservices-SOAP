package br.com.caelum.estoque.modelo.item;

import java.util.List;

public class ListaItens {

	private List<Item> itens;

	public ListaItens(List<Item> itens) {
		this.itens = itens;
	}

	ListaItens() {
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
}

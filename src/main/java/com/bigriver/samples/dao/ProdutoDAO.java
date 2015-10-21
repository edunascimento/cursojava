package com.bigriver.samples.dao;

import java.util.Collection;
import com.bigriver.samples.model.Produto;

public class ProdutoDAO implements DAO<Produto> {

	@Override
	public Produto salvar(Produto objeto) {
		
		//System.out.println("Salvou - " + objeto.getNome());
		
		return null;
	}

	@Override
	public Produto buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Produto> todos() {
		// TODO Auto-generated method stub
		return null;
	}

}

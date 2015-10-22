package com.bigriver.samples.dao;

import java.util.Collection;

import javax.persistence.EntityManager;

import com.bigriver.samples.BancoDeDados;
import com.bigriver.samples.model.Pessoa;
import com.bigriver.samples.model.Produto;

public class ProdutoDAO implements DAO<Produto> {

	@Override
	public Produto salvar(Produto objeto) {
		
		EntityManager gerente  = BancoDeDados.abreEntityManager();
		
		gerente.getTransaction().begin();
		
		gerente.persist(objeto);
				
		gerente.getTransaction().commit();
		
		gerente.close();
		
		return objeto;
	}

	@Override
	public Produto buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Produto> todos() {
		
		EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
		gerenteEntidades.getTransaction().begin();
		//Cria uma QUERY que buscará TODAS as Pessoas no BD
		@SuppressWarnings("unchecked")
		Collection<Produto> todos = gerenteEntidades.createQuery("from Produto")
				.getResultList();
		//Garante a conclusão da operação
		gerenteEntidades.getTransaction().commit();
		gerenteEntidades.close();
		
		return todos;
	}

}

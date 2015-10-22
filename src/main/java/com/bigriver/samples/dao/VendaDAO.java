package com.bigriver.samples.dao;

import java.util.Collection;

import javax.persistence.EntityManager;

import com.bigriver.samples.BancoDeDados;
import com.bigriver.samples.model.Pessoa;
import com.bigriver.samples.model.VendadosProdutos;

public class VendaDAO implements DAO<VendadosProdutos>{

	@Override
	public VendadosProdutos salvar(VendadosProdutos objeto) {
		
		//Abre um gerente de entidades
		EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
		//Abre uma transação com o BD
		gerenteEntidades.getTransaction().begin();
		//Guarda o Objeto no BD
		gerenteEntidades.persist(objeto);
		//Conclui a transação com o BD, garantindo a execução da operação
		gerenteEntidades.getTransaction().commit();
		//Fecha o Gerente de Entidades, concluindo o ciclo de vida de operações
		gerenteEntidades.close();
		
		return objeto;
	}

	@Override
	public VendadosProdutos buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<VendadosProdutos> todos() {
	
		EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
		gerenteEntidades.getTransaction().begin();
		//Cria uma QUERY que buscará TODAS as Pessoas no BD
		@SuppressWarnings("unchecked")
		Collection<VendadosProdutos> todos = gerenteEntidades.createQuery("from VendadosProdutos")
				.getResultList();
		//Garante a conclusão da operação
		gerenteEntidades.getTransaction().commit();
		gerenteEntidades.close();
		
		return todos;
		
	}

}

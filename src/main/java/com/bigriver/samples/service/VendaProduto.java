package com.bigriver.samples.service;

import java.util.Collection;

import com.bigriver.samples.dao.ProdutoDAO;
import com.bigriver.samples.dao.VendaDAO;
import com.bigriver.samples.model.Pessoa;
import com.bigriver.samples.model.Produto;
import com.bigriver.samples.model.VendadosProdutos;

public class VendaProduto implements ServicoVenda<Produto>{
	
	private VendaDAO vendaDAO;
	
	private ProdutoDAO produtoDAO;
	
	public VendaProduto() {
		vendaDAO = new VendaDAO();
		
		produtoDAO = new ProdutoDAO();
	}
	
	@Override
	public Collection<Produto> todosNaoVendidos() {
		return produtoDAO.todos();
	}

	@Override
	public void vender(Produto produto, Pessoa cliente) {
		
		VendadosProdutos venda = new VendadosProdutos();
		venda.setCliente(cliente);
		venda.setProduto(produto);
		
		venda.setQuantVenda(1);
		venda.setDataVenda(22);
		
		vendaDAO.salvar(venda);
		produto.setQuantidade(produto.getQuantidade() - 1);
		
		produtoDAO.salvar(produto);
		
	}
	
	public VendaDAO getVendaDAO() {
		return vendaDAO;
	}

}

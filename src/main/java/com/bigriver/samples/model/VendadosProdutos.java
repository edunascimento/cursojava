package com.bigriver.samples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.property.Getter;

@Entity
public class VendadosProdutos {

	private int quantVenda,dataVenda,codVenda;
	
	private Pessoa cliente;
	private Produto produto;
	
	@OneToOne
	public Produto getProduto(){
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	@OneToOne
	public Pessoa getCliente() {
		return cliente;
	}
	
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	@Id
	@GeneratedValue
	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public int getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(int dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getQuantVenda() {
		return quantVenda;
	}

	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}

	@Override
	public String toString() {
		return getCliente().getNome() + " " + getProduto().getNome();
	}
	
}

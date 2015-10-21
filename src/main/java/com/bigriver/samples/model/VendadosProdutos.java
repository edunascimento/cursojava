package com.bigriver.samples.model;

public class VendadosProdutos extends Pessoa {

	public int quantVenda,dataVenda;
	
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

	public int getId(){
	return super.getId();}
}

package com.bigriver.samples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VendadosProdutos {

	public int quantVenda,dataVenda,codVenda;
	
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

	
}

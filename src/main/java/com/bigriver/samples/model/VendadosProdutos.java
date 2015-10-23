package com.bigriver.samples.model;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.property.Getter;

import com.bigriver.samples.listener.VendadosProdutosListener;

@Entity
@EntityListeners(VendadosProdutosListener.class)
public class VendadosProdutos {

	private int quantVenda,dataVenda,codVenda;
	
	private Pessoa cliente;
	private Produto produto;
	private Date timestamps;
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
		return getCliente().getNome() + " " + getProduto().getNome() +""+getTimestamps();
	}

	/*public void setTimesamps(Date from) {
		// TODO Auto-generated method stub
		return timestamps;
	}*/
	
	public void setTimestamps(Date timestamps) 
	{
		this.timestamps = timestamps;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getTimestamps() 
	{
		return timestamps;
	}
}

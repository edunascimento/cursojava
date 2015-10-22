package com.bigriver.samples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import com.dooapp.fxform.annotation.NonVisual;

@NamedQueries({
	@NamedQuery(name = "Produto.findAll", query="SELECT produto FROM Produto produto"),
//	@NamedQuery(name = "Produto.findAllNotSelled", query ="SELECT produto FROM Produto WHERE produto.venda!=null")
})
@Entity
public class Produto {

	private VendadosProdutos venda;
	
	//atributos de produto
	
	
	@NonVisual
	private int codigo;
	
	@OneToOne(mappedBy="produto")
	public VendadosProdutos getVenda() {
		return venda;
	}
	public void setVenda(VendadosProdutos venda) {
		this.venda = venda;
	}

	private int quantidade,valor;
	private String marca,nome,cor;
	
	@Id
	@GeneratedValue
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return getMarca() + " " + getNome();
	}
	
}
 

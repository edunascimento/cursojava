package com.bigriver.samples.listener;

import java.security.Timestamp;
import java.time.Instant;
import java.util.Date;

import javax.persistence.PrePersist;

import com.bigriver.samples.model.VendadosProdutos;

public class VendadosProdutosListener {
	@PrePersist
	public void salvandoVenda(VendadosProdutos vendaproduto){
		vendaproduto.setTimestamps(Date.from(Instant.now()));
	}
	
}

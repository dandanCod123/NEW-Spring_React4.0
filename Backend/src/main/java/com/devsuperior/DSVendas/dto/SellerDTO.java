package com.devsuperior.DSVendas.dto; //DTO CONVERTER DADOS DE UMA ENTITIY PARA BITS PRA MANDA PRO CONTROLER REST

import java.io.Serializable;

import com.devsuperior.DSVendas.entities.Seller;

public class SellerDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public SellerDTO() {
	}

	public SellerDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(Seller entitiy) {
		super();
		id = entitiy.getId();
		name = entitiy.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

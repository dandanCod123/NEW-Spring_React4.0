package com.devsuperior.DSVendas.service; //ESSA CAMADA QUE VAI CONECTAR COM A CAMADA DE DADOS 

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.DSVendas.dto.SellerDTO;
import com.devsuperior.DSVendas.entities.Seller;
import com.devsuperior.DSVendas.repositories.SellerRepository;

@Service
public class SellerServices {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){ //VAI RETORNA UMA LISTA DE SELLER
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
	
	
}

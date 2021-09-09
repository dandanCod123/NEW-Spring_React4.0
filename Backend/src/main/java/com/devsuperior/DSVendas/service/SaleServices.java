package com.devsuperior.DSVendas.service; //ESSA CAMADA QUE VAI CONECTAR COM A CAMADA DE DADOS 


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.DSVendas.dto.SaleDTO;
import com.devsuperior.DSVendas.dto.SaleSuccessDTO;
import com.devsuperior.DSVendas.dto.SaleSumDTO;
import com.devsuperior.DSVendas.entities.Sale;
import com.devsuperior.DSVendas.repositories.SaleRepository;
import com.devsuperior.DSVendas.repositories.SellerRepository;

@Service
public class SaleServices {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerrepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){ //VAI RETORNA UMA LISTA DE sale
		sellerrepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
	
}

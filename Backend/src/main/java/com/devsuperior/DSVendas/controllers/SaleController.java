package com.devsuperior.DSVendas.controllers; //CAMADA DE WEB SERVICES

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.DSVendas.dto.SaleDTO;

import com.devsuperior.DSVendas.service.SaleServices;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleServices services;
	
    @GetMapping
    private ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
    	Page<SaleDTO> list = services.findAll(pageable);
    	return ResponseEntity.ok(list);
    }
	
}

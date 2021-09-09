package com.devsuperior.DSVendas.controllers; //CAMADA DE WEB SERVICES

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.DSVendas.dto.SellerDTO;
import com.devsuperior.DSVendas.service.SellerServices;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerServices services;
	
    @GetMapping
    private ResponseEntity<List<SellerDTO>> findAll(){
    	List<SellerDTO> list = services.findAll();
    	return ResponseEntity.ok(list);
    }
	
}

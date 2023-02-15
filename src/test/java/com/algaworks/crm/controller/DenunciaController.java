package com.algaworks.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.reposotory.DenunciaRepository;

@RestController
@RequestMapping("/denuncia")
public class DenunciaController {
	
	@Autowired
	private DenunciaRepository denunciaRepository;
	
	@GetMapping
	public List<Denuncia> listar( ) {
		return DenunciaRepository();
		}

	private List<Denuncia> DenunciaRepository() {
		// TODO Auto-generated method stub
		return null;
	}
	@GetMapping
	public DenunciaRepository getDenunciaRepository() {
		return denunciaRepository;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Object adicionar (@RequestBody Denuncia denuncia) {
		return (Object) DenunciaRepository.save(denuncia);
	}
	}


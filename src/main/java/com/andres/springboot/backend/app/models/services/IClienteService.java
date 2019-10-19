package com.andres.springboot.backend.app.models.services;

import java.util.List;

import com.andres.springboot.backend.app.models.entity.Cliente;

public interface IClienteService {
	

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);

}

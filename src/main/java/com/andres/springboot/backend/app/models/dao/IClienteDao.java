package com.andres.springboot.backend.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.andres.springboot.backend.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}

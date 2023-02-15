package com.algaworks.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.crm.controller.Denuncia;

public interface ClienteRepository extends JpaRepository <Denuncia, Long> {

}

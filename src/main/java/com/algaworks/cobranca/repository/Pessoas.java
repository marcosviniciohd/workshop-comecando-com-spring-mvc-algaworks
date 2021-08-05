package com.algaworks.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.cobranca.model.Pessoa;

public interface Pessoas extends JpaRepository<Pessoa, Long>{

}

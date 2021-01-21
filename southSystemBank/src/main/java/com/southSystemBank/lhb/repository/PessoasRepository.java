package com.southSystemBank.lhb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.southSystemBank.lhb.model.Pessoa;


/**
 * @author Luciano Hermany Bandeira
 *
 */
public interface PessoasRepository extends JpaRepository<Pessoa, Long> {

}

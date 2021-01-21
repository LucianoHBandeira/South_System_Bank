package com.southSystemBank.lhb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.southSystemBank.lhb.model.Conta;

/**
 * @author Luciano Hermany Bandeira
 *
 */
public interface ContasRepository extends JpaRepository<Conta, Long> {

}

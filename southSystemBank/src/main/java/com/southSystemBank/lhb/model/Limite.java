package com.southSystemBank.lhb.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Luciano Hermany Bandeira
 *
 */
@Entity
public class Limite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int score;

	@Column(name = "limite_cheque_especial")
	private BigDecimal limiteChequeEspecial;

	@Column(name = "limite_cartao_de_credito")
	private BigDecimal limiteCartaoDeCredito;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public BigDecimal getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(BigDecimal limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public BigDecimal getLimiteCartaoDeCredito() {
		return limiteCartaoDeCredito;
	}

	public void setLimiteCartaoDeCredito(BigDecimal limiteCartaoDeCredito) {
		this.limiteCartaoDeCredito = limiteCartaoDeCredito;
	}

}

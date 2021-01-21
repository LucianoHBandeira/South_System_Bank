package com.southSystemBank.lhb.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Luciano Hermany Bandeira
 *
 */
@Entity
public class Conta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int numero;

	private int agencia;

	private char tipo;

	@Column(name = "limite_cheque_especial")
	private BigDecimal limiteChequeEspecial;

	@Column(name = "limite_cartao_de_credito")
	private BigDecimal limiteCartaoDeCredito;

	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private Pessoa pessoa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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

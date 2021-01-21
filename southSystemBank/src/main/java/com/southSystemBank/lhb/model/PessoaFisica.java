package com.southSystemBank.lhb.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Luciano Hermany Bandeira
 *
 */
@Entity(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "CPF é obrigatório")
	@Size(min = 11, max = 11, message = "tamanho do CPF é de 11 dígitos. Utilizar apenas números.")
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

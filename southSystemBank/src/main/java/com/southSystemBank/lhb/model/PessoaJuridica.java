package com.southSystemBank.lhb.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Luciano Hermany Bandeira
 *
 */
@Entity(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "CNPJ é obrigatório")
	@Size(min = 14, max = 14, message = "tamanho do CNPJ é de 14 dígitos. Utilizar apenas números.")
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}

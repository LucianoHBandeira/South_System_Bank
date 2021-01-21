package com.southSystemBank.lhb.service;

import java.util.List;

import com.southSystemBank.lhb.model.Conta;
import com.southSystemBank.lhb.model.Pessoa;
import com.southSystemBank.lhb.model.PessoaFisica;
import com.southSystemBank.lhb.model.PessoaJuridica;


/**
 * @author Luciano Hermany Bandeira
 *
 */
public interface SouthSystemBankService {

	public List<Pessoa> listarPessoas();

	public List<PessoaFisica> listarPessoasFisicas();

	public List<PessoaJuridica> listarPessoasJuridicas();

	public void listarContasECartoes();

	public List<Conta> listarContas();

	public void cadastrarPessoaFisica(PessoaFisica pessoa);

	public void cadastrarPessoaJuridica(PessoaJuridica pessoa);

	public void criarConta(Pessoa pessoa);

}

package com.southSystemBank.lhb.service;

import java.util.List;


import java.util.Random;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.southSystemBank.lhb.model.Conta;
import com.southSystemBank.lhb.model.Limite;
import com.southSystemBank.lhb.model.Pessoa;
import com.southSystemBank.lhb.model.PessoaFisica;
import com.southSystemBank.lhb.model.PessoaJuridica;
import com.southSystemBank.lhb.repository.ContasRepository;
import com.southSystemBank.lhb.repository.LimitesRepository;
import com.southSystemBank.lhb.repository.PessoasFisicasRepository;
import com.southSystemBank.lhb.repository.PessoasJuridicasRepository;
import com.southSystemBank.lhb.repository.PessoasRepository;

/**
 * @author Luciano Hermany Bandeira
 *
 */
@Service
public class SouthSystemBankServiceImp implements SouthSystemBankService {

	@Autowired
	private ContasRepository contasRepository;

	@Autowired
	private PessoasRepository pessoasRepository;

	@Autowired
	private PessoasFisicasRepository pessoasFisicasRepository;

	@Autowired
	private PessoasJuridicasRepository pessoasJuridicasRepository;

	@Autowired
	private LimitesRepository limitesRepository;

	final ResourceBundle bundle = ResourceBundle.getBundle("configuration");

	public List<Pessoa> listarPessoas() {

		return pessoasRepository.findAll();
	}

	public List<PessoaFisica> listarPessoasFisicas() {

		return pessoasFisicasRepository.findAll();

	}

	public List<PessoaJuridica> listarPessoasJuridicas() {

		return pessoasJuridicasRepository.findAll();

	}

	public void listarContasECartoes() {
	}

	public List<Conta> listarContas() {

		return contasRepository.findAll();
	}

	public void cadastrarPessoaFisica(PessoaFisica pessoa) {

		pessoa.setScore(atribuirScore());

		pessoasFisicasRepository.save(pessoa);

		criarConta(pessoa);

	}

	public void cadastrarPessoaJuridica(PessoaJuridica pessoa) {

		pessoa.setScore(atribuirScore());

		pessoasJuridicasRepository.save(pessoa);

		criarConta(pessoa);

	}

	public void criarConta(Pessoa pessoa) {

		Conta conta = new Conta();
		conta.setAgencia(Integer.valueOf(bundle.getString("AGENCIA"))); // peagar de uma arquivo de configuracoes
		conta.setNumero(criarNumeroDeConta()); // gerar aleatóriamente
		conta.setPessoa(pessoa);

		if (pessoa.getTipo().equalsIgnoreCase("PF"))
			conta.setTipo('C');
		else
			conta.setTipo('E');

		criarLimiteChequeEspecialECartaoDeCredito(conta);

		contasRepository.save(conta);

	}

	private int atribuirScore() {

		Random gerador = new Random();
		return gerador.nextInt(10);

	}

	private int criarNumeroDeConta() {

		final int min = Math.min(100000, 999999);
		final int max = Math.max(100000, 999999);

		Random r = new Random();
		return min + r.nextInt((max - min) + 1);

	}

	private void criarLimiteChequeEspecialECartaoDeCredito(Conta conta) {

		List<Limite> limites = limitesRepository.findAll();

		for (Limite limite : limites) {
			if (limite.getScore() == conta.getPessoa().getScore()) {
				conta.setLimiteCartaoDeCredito(limite.getLimiteCartaoDeCredito());
				conta.setLimiteChequeEspecial(limite.getLimiteChequeEspecial());
			}
		}

	}

}

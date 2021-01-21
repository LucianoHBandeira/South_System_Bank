package com.southSystemBank.lhb.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.southSystemBank.lhb.service.SouthSystemBankService;
import com.southSystemBank.lhb.model.Conta;
import com.southSystemBank.lhb.model.Pessoa;
import com.southSystemBank.lhb.model.PessoaFisica;
import com.southSystemBank.lhb.model.PessoaJuridica;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Luciano Hermany Bandeira
 *
 */
@RestController
@RequestMapping("/southSystemBank")
public class SouthSystemBankRestController {

	@Inject
	private SouthSystemBankService southSystemBankService;

	@GetMapping("/listarPessoas")
	public List<Pessoa> listarPessoas() {

		return southSystemBankService.listarPessoas();
	}

	@GetMapping("/listarPessoasFisicas")
	public List<PessoaFisica> listarPessoasFisicas() {

		return southSystemBankService.listarPessoasFisicas();

	}

	@GetMapping("/listarPessoasJuridicas")
	public List<PessoaJuridica> listarPessoasJuridicas() {

		return southSystemBankService.listarPessoasJuridicas();

	}

	@GetMapping("/listarContas")
	public List<Conta> listarContas() {

		List<Conta> contas = southSystemBankService.listarContas();

		return contas;
	}

	@PostMapping("/cadastrarPessoaFisica")
	@ResponseStatus(HttpStatus.CREATED)
	public void cadastrarPessoaFisica(@Valid @RequestBody PessoaFisica pessoa) {

		southSystemBankService.cadastrarPessoaFisica(pessoa);

	}

	@PostMapping("/cadastrarPessoaJuridica")
	@ResponseStatus(HttpStatus.CREATED)
	public void cadastrarPessoaJuridica(@Valid @RequestBody PessoaJuridica pessoa) {

		southSystemBankService.cadastrarPessoaJuridica(pessoa);

	}

}

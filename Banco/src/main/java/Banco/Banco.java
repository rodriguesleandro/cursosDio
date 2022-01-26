package Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private final int AGENCIA_PADRAO = 1;
	private final String NOME;
	
	private List<Conta> contas;
		

	public Banco(String nomeBanco) {
		this.NOME = nomeBanco;
		contas = new ArrayList<Conta>();
	}
	
	public String getNome() {
		return this.NOME;
	}
	
	public void CriarContaCorrente(String nomeNovoCliente)
	{
		Cliente novoCliente = new Cliente(nomeNovoCliente);
		Conta novaConta = new ContaCorrente(AGENCIA_PADRAO, novoCliente);
		contas.add(novaConta);
	}
	
	public void CriarContaPoupanca(String nomeNovoCliente)
	{
		Cliente novoCliente = new Cliente(nomeNovoCliente);
		Conta novaConta = new ContaPoupanca(AGENCIA_PADRAO, novoCliente);
		contas.add(novaConta);
	}
	
	public Conta obterConta(int codigoConta) {
		return contas.get(codigoConta);
	}
	
	
	
	

}

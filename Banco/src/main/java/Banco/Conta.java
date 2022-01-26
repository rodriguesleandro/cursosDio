package Banco;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected Cliente cliente;
	protected List<MovimentoBancario> movimentos;
	
		
	public Conta(int agencia, Cliente cliente) {
		this.agencia = agencia;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.movimentos = new ArrayList<MovimentoBancario>();
	}

	public void sacar(double valor)	{
		if  (obterSaldo() >= valor){
			   valor*= -1;
               MovimentoBancario mov = new MovimentoBancario("saque", valor);
               movimentos.add(mov);
           }		
	}
	
	public double obterSaldo()
	{
		double saldo = 0;        
        for(MovimentoBancario mov : movimentos){
            saldo += mov.getValor();
        }
       return saldo; 
	}
	
	public void depositar(double valor)	{
		if (valor > 0){
            MovimentoBancario mov = new MovimentoBancario("deposito", valor);
            movimentos.add(mov);
           }
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected abstract void imprimirTipoConta();
	
	public void imprimirExtrato() {
		imprimirTipoConta();
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		imprimirMovimentacao();
		System.out.println(String.format("Saldo: \t\t %.2f", this.obterSaldo()));
	}
	
	private void imprimirMovimentacao() {
		for(MovimentoBancario mov : movimentos){
			System.out.println(mov.getDescricao() + "\t" +  String.format(" %.2f", mov.getValor()));
        }
	}
	
	
	


}

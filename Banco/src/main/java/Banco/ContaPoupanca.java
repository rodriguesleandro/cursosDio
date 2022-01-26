package Banco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, Cliente cliente) {
		super(agencia, cliente);		
	}

	@Override
	protected void imprimirTipoConta() {
		System.out.println("=== Extrato Conta Poupança ===");		
	}

}

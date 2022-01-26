package Banco;

public class ContaCorrente extends Conta {

	private final double LIMITE = -100;
	
	public ContaCorrente(int agencia, Cliente cliente) {
		super(agencia, cliente);		
	}

	@Override
	public void sacar(double valor) {
		boolean saqueDentroLimite = obterSaldo()-valor >= LIMITE;
		if  (saqueDentroLimite){
			   valor*= -1;
            MovimentoBancario mov = new MovimentoBancario("saque", valor);
            movimentos.add(mov);
        }
		
	}

	@Override
	protected void imprimirTipoConta() {
		System.out.println("=== Extrato Conta Corrente ===");
		
	}
	
	
	

}

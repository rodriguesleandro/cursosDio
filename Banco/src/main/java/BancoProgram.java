import Banco.Banco;
import Banco.Conta;

public class BancoProgram {

	public static void main(String[] args) {
		Banco banco = new Banco("Meu Banco");
		
		banco.CriarContaCorrente("Joao");
		banco.CriarContaPoupanca("Maria");
		
		Conta contaJoao = banco.obterConta(0);
		Conta contaMaria = banco.obterConta(1);
		
		
		
		contaJoao.depositar(100);
		contaMaria.depositar(10);
		
		contaJoao.imprimirExtrato();
		System.out.println("====================================================");
		contaMaria.imprimirExtrato();
		
		
		contaJoao.transferir(10, contaMaria);
		contaMaria.transferir(5, contaJoao);
		
		contaJoao.imprimirExtrato();
		System.out.println("====================================================");
		contaMaria.imprimirExtrato();

	}

}

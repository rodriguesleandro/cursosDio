package BancoTests;

import Banco.ContaCorrente;
import Banco.Cliente;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class ContaCorrenteTest {

	@Test
	public void saqueLimiteInferiorTest()
	{	
		Cliente cliente = new Cliente("Testador");
		ContaCorrente conta = new ContaCorrente(1, cliente);
		
		conta.sacar(99);
		 assertEquals(-99.0, conta.obterSaldo());
	}
	
	@Test
	public void saqueLimiteTest()
	{	
		Cliente cliente = new Cliente("Testador");
		ContaCorrente conta = new ContaCorrente(1, cliente);
		
		conta.sacar(100);
		assertEquals(-100, conta.obterSaldo());
	}
	
	@Test
	public void saqueLimiteSuperiorTest()
	{	
		Cliente cliente = new Cliente("Testador");
		ContaCorrente conta = new ContaCorrente(1, cliente);
		
		conta.sacar(101);
		assertEquals(0.0, conta.obterSaldo());
	}
	
	
	
}

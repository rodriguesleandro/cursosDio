package BancoTests;

import Banco.ContaPoupanca;
import Banco.Cliente;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaPoupancaTest {
	
	@Test
	public void depositarTest()
	{
		Cliente cliente = new Cliente("Testador");
		ContaPoupanca poupanca = new ContaPoupanca(1, cliente);
		
		poupanca.depositar(1.0);
		
		assertEquals(1.0, poupanca.obterSaldo());	
		
	}
	
	@Test
	public void depositarValorZeradoTest()
	{
		Cliente cliente = new Cliente("Testador");
		ContaPoupanca poupanca = new ContaPoupanca(1, cliente);
		
		poupanca.depositar(0.0);
		
		assertEquals(0.0, poupanca.obterSaldo());	
		
	}
	
	@Test
	public void sacarLimiteSaldoInferiorTest()
	{
		Cliente cliente = new Cliente("Testador");
		ContaPoupanca poupanca = new ContaPoupanca(1, cliente);
		
		poupanca.depositar(10);
		poupanca.sacar(9.0);
		
		assertEquals(1.0, poupanca.obterSaldo());	
		
	}
	
	@Test
	public void sacarLimiteSaldoTest()
	{
		Cliente cliente = new Cliente("Testador");
		ContaPoupanca poupanca = new ContaPoupanca(1, cliente);
		
		poupanca.depositar(10);
		poupanca.sacar(10);
		
		assertEquals(0.0, poupanca.obterSaldo());	
		
	}
	
	@Test
	public void sacarForaLimiteSaldoTest()
	{
		Cliente cliente = new Cliente("Testador");
		ContaPoupanca poupanca = new ContaPoupanca(1, cliente);
		
		poupanca.depositar(10);
		poupanca.sacar(11);
		
		assertEquals(10.0, poupanca.obterSaldo());	
		
	}
	

}

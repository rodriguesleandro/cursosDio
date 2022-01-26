package Banco;

public class Cliente {
	
	private static int SEQUENCIAL = 1;
	
	public String nome;
	public int codigo;	
	
	public Cliente(String nome) {
		
		this.nome = nome;
		this.codigo = SEQUENCIAL++;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}

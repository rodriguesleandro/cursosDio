package Banco;

public class MovimentoBancario {
	private String descricao;
    private double valor;
    
    public MovimentoBancario( String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }
        
    public double getValor(){
        return valor;
    }
    
    public String getDescricao(){
        return descricao;
    }
}

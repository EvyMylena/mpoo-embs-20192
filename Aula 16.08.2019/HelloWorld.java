package br.ufrpe.bsi.mpoo;

public class HelloWorld {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimir() {
		System.out.println("Olá"+" "+this.nome+"!");
		
	}
		
	
}

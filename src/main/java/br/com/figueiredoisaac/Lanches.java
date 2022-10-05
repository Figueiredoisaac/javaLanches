package main.java.br.com.figueiredoisaac;

public class Lanches {

	private int id;
	private String nome;
	private double valor;
	private static int total;
	
	public Lanches(String nome, double valor) {
		this.setId(total);
		this.setNome(nome);
		this.setValor(valor);
		total++;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}



package main.java.br.com.figueiredoisaac;

import java.util.Objects;

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

	@Override
	public String toString() {
		return this.id + "[nome=" + nome + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lanches other = (Lanches) obj;
		return id == other.id && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
}



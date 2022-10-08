package main.java.br.com.figueiredoisaac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuardaLanches {

	private List<Lanches> lanches = new ArrayList<Lanches>();
	
	public void adicionaLanche() {
		Scanner inputNome = new Scanner(System.in);
		System.out.println("Nome do produto: ");

		String nome = inputNome.next();
		Scanner inputValor = new Scanner(System.in);

		System.out.println("Valor do produto: ");
		double valor = inputValor.nextDouble();

		Lanches l = new Lanches(nome, valor);
		lanches.add(l);
		System.out.println("Nome do Produto: " + l.getNome() + "| ID do produto: " + l.getId()
		+ "| Valor do produto: R$" + l.getValor());
	}

	public void removerPorId() {
		Scanner inputConsulta = new Scanner(System.in);
		System.out.println("Insira o ID do produto: ");
		int consulta = (inputConsulta.nextInt());
		for (Lanches l : lanches) {
			if (l.getId() == consulta) {
				lanches.remove(l);
				System.out.println("Concluído");
			}
		}
	}
	
	public Lanches consultaPorIndex(int i) {
		
		Lanches l = lanches.get(i);
		System.out.println(l);
		
		return l;
	}
	
	public void consultarPorId() {
		Scanner inputConsulta = new Scanner(System.in);
		System.out.println("Insira o ID do produto: ");
		int consulta = (inputConsulta.nextInt());
		for (Lanches l : lanches) {
			if (l.getId() == consulta) {
				System.out.println("Nome do Produto: " + l.getNome() + "| ID do produto: " + l.getId()
				+ "| Valor do produto: R$" + l.getValor());
			}
		}
	}
	public void listarProdutos() {
		for (Lanches l : lanches) {
			System.out.println("Nome do Produto: " + l.getNome() + "| ID do produto: " + l.getId()
			+ "| Valor do produto: R$" + l.getValor());
		}
	}
	public void modificaPorId() {
		Scanner inputConsulta = new Scanner(System.in);
		System.out.println("Insira o ID do produto: ");
		int consulta = (inputConsulta.nextInt());
		for (Lanches l : lanches) {
			if (l.getId() == consulta) {
				Scanner inputNovaDescricao = new Scanner(System.in);
				System.out.println("Novo nome do produto: ");
				String novaDescricao = inputNovaDescricao.next();
				Scanner inputNovoValor = new Scanner(System.in);
				System.out.println("Novo valor do produto: ");
				double novoValor = inputNovoValor.nextDouble();
				l.setNome(novaDescricao);
				l.setValor(novoValor);
				System.out.println("Nome do Produto: " + l.getNome() + "| ID do produto: " + l.getId()
						+ "| Valor do produto: R$" + l.getValor());
			}
		}
	}
	
	@Override
	public String toString() {
		for (Lanches l : lanches) {String s = l.toString();
		System.out.println(s);
		}
		return "...";
	}
	
}

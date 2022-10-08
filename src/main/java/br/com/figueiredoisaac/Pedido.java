package main.java.br.com.figueiredoisaac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {

	private List<Lanches> lanches = new ArrayList<Lanches>();
	private int numeroPedido;
	private static int total;

	public Pedido(GuardaLanches lista) {
		int contador = 0;
		while (contador == 0) {
			
			System.out.println("Informe o ID do lanche:");
			System.out.print(lista.toString());
			Scanner inputPedido = new Scanner(System.in);
			int id = inputPedido.nextInt();
			Lanches l = lista.consultaPorIndex(id);
			lanches.add(l);
			System.out.println("Adicionar outro produto?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			Scanner inputNovoProduto = new Scanner(System.in);
			int novoProduto = inputNovoProduto.nextInt();
			switch (novoProduto) {
			case 1: contador = 0;
			break;
			case 2: contador = 1;
			break;
			}
			
		}
		int n = total + 1;
		this.numeroPedido = n;
		total++;
		System.out.println("Pedido Concluido. o número do seu pedido é: " + n);
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

}

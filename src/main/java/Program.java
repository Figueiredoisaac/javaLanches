package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.br.com.figueiredoisaac.GuardaLanches;
import main.java.br.com.figueiredoisaac.Pedido;

public class Program {

	public static void main(String[] args) {
		GuardaLanches listaLanches = new GuardaLanches();
		List<Pedido> listaPedidos = new ArrayList();
		int contador = 0;
		while (contador == 0) {
			System.out.println("Bem-vindo");
			System.out.println("1 - Novo Pedido");
			System.out.println("2 - Pedidos Pendentes");
			System.out.println("3 - Cadastrar Produto");
			System.out.println("4 - Atualizar Produto");
			System.out.println("5 - Remover Produtos");
			System.out.println("6 - Listar Produtos");
			System.out.println("7 - Encerrar Programa");
			Scanner inputEscolha = new Scanner(System.in);
			int escolha = inputEscolha.nextInt();

			switch (escolha) {
			case 1:
				try {
					Pedido p = new Pedido(listaLanches);
					listaPedidos.add(p);
				} catch (Exception ex) {
					System.out.println("Operação Inválida");
					break;
				}
				break;
			case 2:
				int contadorCase2 = 0;
				while (contadorCase2 == 0) {
					try {
						listaPedidos
								.forEach(s -> System.out.println("Pedido de N°: " + s.getNumeroPedido() + "pendente"));
					} catch (Exception ex) {
						System.out.println("Operação Inválida");
						break;
					}
				}
				break;
			case 3:
				try {
					listaLanches.adicionaLanche();
				} catch (Exception ex) {
					System.out.println("Operação Inválida");
					break;
				}
				break;
			case 4:
				try {
					listaLanches.modificaPorId();
				} catch (Exception ex) {
					System.out.println("Operação Inválida");
					break;
				}
				break;
			case 5:
				try {
					listaLanches.removerPorId();
				} catch (Exception ex) {
					System.out.println("Operação Inválida");
					break;
				}
				break;
			case 6:
				try {
					listaLanches.listarProdutos();
				} catch (Exception ex) {
					System.out.println("Operação Inválida");
					break;
				}
				break;
			case 7:
				contador = 1;

			}
		}
	}
}

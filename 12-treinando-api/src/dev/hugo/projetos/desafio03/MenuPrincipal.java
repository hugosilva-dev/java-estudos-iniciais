package dev.hugo.projetos.desafio03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o limite do cartão:");
		double limite = leitura.nextDouble();

		double valorTotal = 0;
		List<Compras> compras = new ArrayList<>();

		while (valorTotal < limite) {
			System.out.println("Digite o item que você quer comprar:");
			String item = leitura.next();
			System.out.println("Digite o valor do item:");
			double valor = leitura.nextDouble();
			
			if(valor > limite) {
				System.out.println("Você não tem limite para essa compra.");
				break;
			}
			Compras compra = new Compras(item, valor);
			compras.add(compra);
			valorTotal += valor;
			if(valorTotal == limite) break;
			if(valorTotal < limite) {
				int i = 0;
				System.out.println("Compra realizada!");
				System.out.println("Digite 0 para sair ou 1 para continuar");
				i = leitura.nextInt();
				if(i!=1) break;
			}if(valorTotal > limite) {
				compras.remove(compra);
				valorTotal -= valor;
				System.out.println("Compra não realizada.");
				break;
			}
		}
		leitura.close();
		compras.sort(Comparator.comparingDouble(Compras::getValor));
		System.out.println("COMPRAS REALIZADAS:");
		System.out.println(compras);
		System.out.println(String.format("Saldo no cartão: %.2f", (limite - valorTotal)));

	}
}

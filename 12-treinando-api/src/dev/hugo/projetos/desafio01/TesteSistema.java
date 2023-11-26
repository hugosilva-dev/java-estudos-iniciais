package dev.hugo.projetos.desafio01;

import java.util.Scanner;

public class TesteSistema {

	public static void main(String[] args) {

		Conta cc1 = new ContaPoupanca(0414, 33650);
		Cliente hugo = new Cliente("Hugo Araujo Silva", 2222);
		cc1.setTitular(hugo);
		cc1.deposita(2500);

		String textoInicial = """
				********************************
				Dados iniciais do cliente:
				Nome: %s;
				Tipo de conta: %s;
				Saldo inicial: %.2f.

				********************************
				""".formatted(hugo.getNome(), cc1.toString(), cc1.getSaldo());
		System.out.println(textoInicial);

		String operacoes = """
				Operações

				1 - Consultar saldos;
				2 - Depositar valor;
				3 - Transferir valor;
				4 - Sair

				Digite a opção desejada:
				""";
		int opcao = 0;
		Scanner scanner = new Scanner(System.in);
		while (opcao != 4) {
			System.out.println(operacoes);
			opcao = scanner.nextInt();
			if (opcao == 1) {
				System.out.println(String.format("Saldo atual: R$%.2f", cc1.getSaldo()));
			} else if (opcao == 2) {
				System.out.println("Informe o valor que deseja depositar:");
				double valorDeDeposito = scanner.nextDouble();
				cc1.deposita(valorDeDeposito);
				System.out.println(String.format("Saldo atualizado: R$%.2f", cc1.getSaldo()));
			} else if (opcao == 3) {
				System.out.println("Informe o valor que deseja transferir:");
				double valorTransferencia = scanner.nextDouble();
				try {
					cc1.transferir(valorTransferencia);
				} catch (SaldoInsuficienteException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(String.format("Saldo atualizado: R$%.2f", cc1.getSaldo()));
			} else if (opcao == 4) {
				System.out.println("Sistema encerrado, volte sempre!");
			} else
				System.out.println("Opção inválida.");
		}
		scanner.close();

	}

}

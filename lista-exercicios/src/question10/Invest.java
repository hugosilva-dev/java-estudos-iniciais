package question10;

import java.math.BigDecimal;
import java.util.Scanner;

public class Invest {
    public static void main(String[] args) {
        calcularRetornoDoInvestimento();
    }

    private static void calcularRetornoDoInvestimento() {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Qual o saldo inicial? ");
        BigDecimal saldoInicial = leitura.nextBigDecimal();
        System.out.print("Qual será o valor do investimento por mês? ");
        BigDecimal aporteMensal = leitura.nextBigDecimal();
        System.out.print("Qual a taxa de juros mensal? ");
        BigDecimal taxaDeJuros = leitura.nextBigDecimal();

        BigDecimal investimento1ano = saldoInicial;
        boolean calcularProximoAno = true;
        while (calcularProximoAno) {
            for (int i = 1; i <= 12; i++) {
                investimento1ano = investimento1ano.add(aporteMensal);
                investimento1ano = investimento1ano.add(investimento1ano.multiply(taxaDeJuros));
                System.out.printf("Mês %d: Saldo = R$%.2f%n", i, investimento1ano);
            }
            System.out.print("Deseja processar mais um ano? (S/N): ");
            String loop = leitura.next();
            if (!loop.equalsIgnoreCase("S")) {
                calcularProximoAno = false;
            }
        }
        leitura.close();

    }
}

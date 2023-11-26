package br.com.bytebank.banco.teste;

/**
 * Classe para teste da calculadora de imposto para as classe tributáveis.
 * @author Hugo A. Silva
 * @version 1.0
 */

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SegurodeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SegurodeVida seguro = new SegurodeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());		
	}

}

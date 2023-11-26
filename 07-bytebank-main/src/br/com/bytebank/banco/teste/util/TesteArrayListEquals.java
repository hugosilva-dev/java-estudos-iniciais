package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe3 = lista.contains(cc3);
		if(existe3 == false) {
			lista.add(cc3);
		}
		
		Conta cc4 = new ContaCorrente(23, 22);
		boolean existe4 = lista.contains(cc4);
		if(existe4 == false) {
			lista.add(cc4);
		}
		
		System.out.println("Já existe conta com mesmo número e agência de cc3? " + existe3);
		System.out.println("Já existe conta com mesmo número e agência de cc4? " + existe4);
			
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	
	}

}

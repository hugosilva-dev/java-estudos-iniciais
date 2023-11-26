package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics = especificação das listas, tornando desnecessario o cast
		List<Conta> lista = new ArrayList<>(); //thread safe
				
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println("Tamanho:" + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho:" + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		 
		for(int i=0; i<lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
//Ao imprimir uma referencia de maneira direta, ocorre o acesso ao método toString() 
//que vem da classe Objeto e que foi reescrito na Classe Conta e nas filhas.
			
		System.out.println("----------- Outra forma simplificada para o for ------");
			
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	
	}

}

package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add("Entendendo exceções Java");
		aulas.add("Versionamento de Código");
		aulas.add("Posicionando vetores");
		aulas.remove(1);
		System.out.println(aulas);
		aulas.add("Certificação Java SE 8 Programmer I");
		System.out.println("O primeiro curso da lista é: " + aulas.get(0));
		Collections.sort(aulas);
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		

	}

}

package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; // object literal
//		String outro = new String("Alura");
	
//		String outro = nome.replace("A", "a");
//		String outro = nome.toLowerCase();
		String outro = nome.toUpperCase();
		
		char c = nome.charAt(3);
		System.out.println(c);
		
		int pos = nome.indexOf("lu");
		System.out.println(pos);
		
		String sub = nome.substring(2);
		System.out.println(sub);
		
		boolean vazio = nome.isEmpty();
		System.out.println(vazio);
		
		boolean possui = nome.contains("ra");
		System.out.println(possui);
		
		for(int i=0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//			Qualquer método de alteração devolve uma nova String, 
//			pois os objetos da Classe String são imutáveis
		
		System.out.println(nome);
		System.out.println(outro);
		
		
	}

}

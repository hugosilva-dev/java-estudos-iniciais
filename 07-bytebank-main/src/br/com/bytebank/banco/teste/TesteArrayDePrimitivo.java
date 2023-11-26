package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivo {

//	Array [] - estrutura de dado de baixo nível
//	Um array também é um objeto
	public static void main(String[] args) {

		int[] idades = new int[5]; // inicializa o array com os valores padrões (int = 0)
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}

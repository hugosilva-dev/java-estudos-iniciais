package exercícios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Atividade4Aula10 {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		
		System.out.println(pessoas.keySet());
		System.out.println(pessoas.values());
//		System.out.println(pessoas.entrySet());
		
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for (Entry<Integer, 
				String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
	}
}


package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

//		Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		System.out.println(alunos.size());

//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		boolean hugoEstaMatriculado = alunos.contains("Hugo Silva");
		System.out.println(hugoEstaMatriculado);

		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
}

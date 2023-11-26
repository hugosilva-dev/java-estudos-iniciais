package br.com.alura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestaCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
//		cursos.sort(Comparator.comparingInt(c -> c.getAlunos())); [com lambda]
		cursos.sort(Comparator.comparingInt(Curso::getAlunos)); //[com method reference]
//		cursos.forEach(System.out::println);
		
//		Transformando em Stream<String>:
		cursos.stream().map(Curso:: getNome).forEach(System.out::println);
		
//		Transformando em Stream<Integer>:
		cursos.stream().filter(c -> c.getAlunos() > 50).mapToInt(c -> c.getAlunos())
		.forEach(System.out::println);
		
//		Trabalhando com findAny e a classe Optional:
		cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().map(Curso::getNome).ifPresent(System.out::println);
		
//		Trabalhando com collect / Collectors:
		cursos.stream().filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		
//		Calculando média de alunos:
		OptionalDouble media = cursos.stream().mapToInt(Curso::getAlunos).average();
		System.out.println(media);
	}

}

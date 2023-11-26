package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenandoStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("gestão financeira");
		palavras.add("desenvolvimento de software");
		palavras.add("engenharia ambiental");

//		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
// 		palavras.sort((s1, s2) -> s1.length() - s2.length());
//		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
		

		
		
		new Thread(() -> System.out.println("Exencutando um Runnable")).start();

	}

}

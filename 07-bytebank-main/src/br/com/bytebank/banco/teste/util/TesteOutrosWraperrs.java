package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWraperrs {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue());//unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Float.valueOf(29.9f);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
		System.out.println(lista.toString());
		
	}

}

package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author hugou
 *	Kata: Digit*digit
 *	In this kata, you are asked to square every digit of a number and concatenate them.
 *	Ex.: Run 765, return 493625.
 *	Note: The function accepts an integer and returns an integer. 
 */

public class DigitDigit {
	//public int squareDigits(int n){

	public static void main(String[] args) {
		int n = 555;
		
		//Integer > String > Character[](separar) > Integer[](multiplicar) > String[] >
		//String (concatenar) > int(retornar o resultado).
		
		Integer numero = Integer.valueOf(n);
		String convertString = numero.toString();
		
		Character[] digito = new Character[convertString.length()];
		Integer[] valorDigito = new Integer[convertString.length()];
		String [] convertValor = new String[convertString.length()];
		String concatenado = null;
		for (int i = 0; i < digito.length; i++) {
			digito[i] = convertString.charAt(i);
			valorDigito[i] = Character.getNumericValue(digito[i]);
			valorDigito[i] *= valorDigito[i];
			convertValor[i] = Integer.toString(valorDigito[i]);
			if(i == 0) concatenado = convertValor[i];
			else concatenado = concatenado + convertValor[i];
		}
		int squareDigit = Integer.parseInt(concatenado);
		
//		System.out.println(Arrays.toString(digito));
//		System.out.println(Arrays.toString(valorDigito));
//		System.out.println(Arrays.toString(convertValor));
//		System.out.println(concatenado);
		System.out.println(squareDigit);
		
	}

}

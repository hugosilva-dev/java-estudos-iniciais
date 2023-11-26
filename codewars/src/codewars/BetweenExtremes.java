package codewars;

import java.util.Arrays;

/**
 * @author hugou
 *	Kata: Between Extremes
 *	Dada uma matriz de números, retorne a diferença entre o maior e o menor valor.
 *
 *	Ex.[23, 3, 19, 21, 16] retorna: 20 (= 23 - 3).
 *
 *	A matriz conterá no mínimo dois elementos. O intervalo de dados de entrada 
 *	garante que max-min não causará "NoIntegerOverflow".
 */

public class BetweenExtremes {

	public static void main(String[] args) {

		int[] n = {5,6,89,756,2563,445};
		Arrays.sort(n);
		int betweenExtrems = n[n.length-1]-n[0];
		System.out.println(betweenExtrems);
	}
}
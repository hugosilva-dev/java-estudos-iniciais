package codewars;

/**
 * @author hugou 
 * Kata: Multiples of 3 or 5 (6kyu):
 * 
 *         Se listarmos todos os números naturais abaixo de 10 que são múltiplos
 *         de 3 ou 5, obtemos 3, 5, 6 e 9. A soma desses múltiplos é 23.
 *
 *         Conclua a solução para que ela retorne a soma de todos os múltiplos
 *         de 3 ou 5 abaixo do número passado. Além disso, se o número for
 *         negativo, retorne 0.
 *
 *         Observação: se o número for múltiplo de 3 e 5, conte apenas uma vez.
 */

public class Multiple3or5 {

	public static void main(String[] args) {
		int n = 30;
		int ri = 0;
		
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				ri += i;
		}
		System.out.println(ri);
	}
}

//Outra solução:

//int n = 30;
//int ri = 0;
//int rj = 0;

//if (n >= 0) {
//	for (int i = 0; i < n; i += 3) {
//		ri += i;
//	}
//	for (int j = 0; j < n; j += 5) {
//		rj += j;
//		if (j % 3 == 0)
//			rj -= j;
//	}
//	System.out.println(ri + rj);
//} else
//	System.out.println(0);



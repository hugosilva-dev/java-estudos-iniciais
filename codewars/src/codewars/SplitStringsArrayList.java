package codewars;

import java.util.ArrayList;

/**
 * @author hugou Kata: SplitStrings (6kyu):
 * 
 *         Conclua a solução para que ela divida a string em pares de dois
 *         caracteres. Se a string contiver um número ímpar de caracteres, ela
 *         deverá substituir o segundo caractere ausente do par final por um
 *         sublinhado ('_').
 *
 *         Ex.: 'abc' => ['ab', 'c_']; 'abcdef' => ['ab', 'cd', 'ef'].
 *
 */
public class SplitStringsArrayList {

	public static void main(String[] args) {

		String s = "araujos";
		ArrayList<String> pair = new ArrayList<>();
		if (s.length() % 2 != 0)
			s = s + '_';
		for (int i = 0; i < s.length(); i += 2) {
			String sub = s.substring(i, i + 2);
			pair.add(sub);
		}
		System.out.println(pair.toString());
	}
}
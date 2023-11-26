package codewars;

import java.util.Arrays;

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
public class SplitStrings {

	public static void main(String[] args) {

		int i = 0;
		String s = "abcde";
		if (s.length() % 2 != 0)
			s = s + '_';
		String[] answer = new String[s.length() / 2];
		for (int j = 0; j < s.length(); j += 2) {{
			String sub = s.substring(j, j + 2);
			answer[i] = sub;
			i++;
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
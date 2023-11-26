package codewars;

import java.util.Arrays;

public class SplitStringChar {

	public static void main(String[] args) {

		int k = 0;
		String s = "abcde";
		if (s.length() % 2 != 0)
			s = s + '_';
		char[] letras = new char[s.length()];
		for (int i = 0; i < letras.length; i++) {
			letras[i] = s.charAt(i);
		}
		String[] answer = new String[s.length() / 2];
		for (int j = 0; j < s.length(); j += 2) {
			answer[k] = String.valueOf(letras[j]) + String.valueOf(letras[j + 1]);
			k++;
		}
		System.out.println(Arrays.toString(answer));
	}
}

package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "A";
		System.out.println(s.codePointAt(0)); //0 = posição dos argumentos dentro da String

		Charset charset = Charset.defaultCharset(); //olhando qual charset utilizado pela máquina
		System.out.println(charset.displayName());

		byte[] bytes = s.getBytes("windows-1252"); //convertendo em bytes utilizando o charset windows-1252 
		System.out.print(bytes.length + ", windows-1252, "); //vendo quantos bytes a String utilizou
		String sNovo = new String(bytes, "windows-1252"); //convertendo de volta bytes em String
		System.out.println(sNovo);

		bytes = s.getBytes("UTF-16"); //convertendo em bytes utilizando o charset UTF-16
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);

		bytes = s.getBytes(StandardCharsets.US_ASCII); //convertendo em bytes utilizando o charset US-ASCII
		System.out.print(bytes.length + ", US-ASCII, ");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);

	}

}

//Exercício: Encoding no Java
//
//Charset utf8 = StandardCharsets.UTF_8; //criando objeto da classe Charset para ser utilizado nos métodos
//String s1 = "13º Órgão Oficial";
//byte[] bytes = s1.getBytes(utf8); //convertendo a String em bytes utilizando o objeto da classe Charset
//String s2 = new String(bytes, utf8); // gerando nova String com os bytes capturados com o novo Charset
//System.out.println(s2);

package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("resumo2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("resumo2.txt"));
//		bw.write(" Estudando comandos de saída com a linguagem de programação Java!");
//		bw.newLine();
//		bw.newLine();
//		bw.write("Isso tudo antes do café da manhã, Carol ainda está dormindo!");
//		bw.close();
		
//		PrintStream ps = new PrintStream("resumo2.txt");
		PrintWriter ps = new PrintWriter("resumo2.txt", "UTF-8");
		ps.println("Estudando comandos de saída com a linguagem de programação Java!");
		ps.println();
		ps.println();
		ps.println();
		ps.println("Isso tudo antes do café da manhã, Carol ainda está dormindo!");
		
		ps.close();
		
	}
}

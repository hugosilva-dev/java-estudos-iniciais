package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroDeMatricula;
	
	public Aluno(String nome, int numeroDeMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}
	
	@Override
	public boolean equals(Object obj) { // No Eclipse você pode pressionar CTRL + 3 e digitar equals;
		Aluno outroAluno = (Aluno) obj; // Utilizou um casting para garantir que o objeto recebido 
										// seja um Aluno e tenha nome;
										// Existe uma referencia para outroAluno e tem eu, 
										// que sou o "this".
		return this.nome.equals(outroAluno.nome); // O nome do aluno é igual ao nome do outro? 
												  // Retorna boolean.
	}
	
	@Override
	public int hashCode() { 		//Se sobrescrever equals(), sempre sobrescreva hashCode()!
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		return "[" + this.nome + "]";
	}
	
	

}

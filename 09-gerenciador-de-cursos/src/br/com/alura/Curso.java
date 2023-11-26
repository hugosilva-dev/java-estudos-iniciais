package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	// Onde vamos guardar todos os alunos da classe curso? Na classe Curso!
	// Usando qual coleção?
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public String getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}

		return tempoTotal + "min";
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + getTempoTotal() + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroDeMatricula(), aluno);
		// cria a relação no Map utilizando o método put().
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
//	    for (Aluno aluno : alunos) {
//	        if (aluno.getNumeroDeMatricula() == numero) {
//	            return aluno;
//	        }
//	    }
//		throw new NoSuchElementException("Matricula " + numero + " não encontrada");
//	}
		return this.matriculaParaAluno.get(numero);
	}

}

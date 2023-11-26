
public abstract class Funcionario { // não pode instanciar dessa classe, pq é abstrata
	
	private String nome;
	private String cpf;
	private double salario;
	
	public abstract double getBonificacao(); //método sem corpo, não há implementação aqui, só nos filhos.
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}

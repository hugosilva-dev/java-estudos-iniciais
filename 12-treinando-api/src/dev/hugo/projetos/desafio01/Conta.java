package dev.hugo.projetos.desafio01;

public abstract class Conta {

	private Cliente titular;
	protected double saldo;
	protected String tipo;
	private int agencia;
	private int numeroDaConta;

	public Conta(int agencia, int numeroDaConta) {
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract void deposita(double valor);

	public abstract void transferir(double valor) throws SaldoInsuficienteException;

}

package dev.hugo.projetos.desafio01;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numeroDaConta) {
		super(agencia, numeroDaConta);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public void transferir(double valor) throws SaldoInsuficienteException {
		if (super.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		super.saldo -= (valor + 0.1);
	}
	
	@Override
	public String toString() {
		return "01 - Conta Corrente";
	}

}

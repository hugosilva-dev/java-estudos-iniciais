package dev.hugo.projetos.desafio01;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numeroDaConta) {
		super(agencia, numeroDaConta);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += (valor + 0.02);
	}

	@Override
	public void transferir(double valor) throws SaldoInsuficienteException {
		if (super.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		super.saldo -= valor;
	}
	
	@Override
	public String toString() {
		return "02 - Conta Poupança";
	}

}

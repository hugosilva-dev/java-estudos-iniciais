
public class ControleBonificacao {
	//CLASSE CRIADA PARA SOMAR TODAS AS BONIFICAÇÕES
	
	private double soma;
		
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
	
	//	DESCRIÇÃO
	//	O método "registra" recebe uma referência "f" da classe "Funcionario";
	//	Salva uma variável "boni" igual ao valor de retorno do método "getBonificacao" pertencente
	//	a cada objeto de referencia "f" criada. Sendo assim, "f" é uma referência genérica e pode receber valores
	//	de referência de outras classes filhas, com isso temos a vantagem do polimorfismo.
	
}

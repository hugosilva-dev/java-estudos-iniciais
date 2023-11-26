
public class TesteBonificacao {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		//	O "syso" é executado para cada método "getBonificacao" e o valor de retorno das 
		//	respectivas bonificações de cada um é salvo na variável "boni" dentro do método 
		//	"registra" e em seguida somado para o obter o resultado final "soma".
		
		System.out.println("A soma das bonificações é: " + controle.getSoma());

	}

}

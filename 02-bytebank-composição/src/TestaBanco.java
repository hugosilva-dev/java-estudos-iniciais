
public class TestaBanco {
	public static void main(String[] args) {
		Cliente hugo = new Cliente();
		hugo.nome = "Hugo Araujo Silva";
		hugo.cpf = "060.035.705-80";
		hugo.profissao = "servidor publico municipal";
		
		Conta contaDoHugo = new Conta();
		contaDoHugo.deposita(100);
		
		contaDoHugo.titular = hugo;
		contaDoHugo.agencia = 414;
		contaDoHugo.numero = 33650;
		   
		System.out.println(contaDoHugo.titular.profissao);
		System.out.println(contaDoHugo.getSaldo());
		System.out.println(contaDoHugo.agencia);
		System.out.println(contaDoHugo.numero);
	}

}

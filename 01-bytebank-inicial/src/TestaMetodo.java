
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoHugo = new Conta();
		contaDoHugo.saldo = 100;
		contaDoHugo.deposita(50);
		System.out.println(contaDoHugo.saldo);

		boolean conseguiuRetirar = contaDoHugo.saca(20);
		System.out.println(contaDoHugo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaCarol = new Conta();
		contaDaCarol.deposita(1000);
		boolean sucessoTransferencia =
				contaDaCarol.transfere(1100, contaDoHugo);
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaDaCarol.saldo);
		System.out.println(contaDoHugo.saldo);
		
		contaDoHugo.titular = "hugo araujo silva";
		System.out.println(contaDoHugo.titular);
	}

}

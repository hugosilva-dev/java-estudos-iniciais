
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaCarol = new Conta();
		System.out.println(contaDaCarol.getSaldo());
		
		contaDaCarol.titular = new Cliente();
		System.out.println(contaDaCarol.titular);
		
		contaDaCarol.titular.nome = "Caroline";
		System.out.println(contaDaCarol.titular.nome);
	}
}

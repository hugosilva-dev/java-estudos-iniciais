
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(414,33650);
		System.out.println(conta.getNumero());
		
		Cliente hugo = new Cliente();
		hugo.setNome("Hugo Araujo Silva");
		conta.setTitular(hugo); // atribuição da ref. ao obj. Cliente no atributo titular do obj. Conta
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("servidor publico municipal");
		
		System.out.println("A profissão de " + conta.getTitular().getNome() + " é "
				+ conta.getTitular().getProfissao() + ".");
		
	}

}

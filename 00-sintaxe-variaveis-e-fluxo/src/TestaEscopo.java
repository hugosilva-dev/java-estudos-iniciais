
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testanto condicionais");
		int idade = 17;
		int quantidadePessoas = 2;
		
		//boolean acompanhado = quantidadePessoas >=2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >=2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo");
		} else {
				System.out.println("Infelizmente você não pode entrar");
			}
		}
}

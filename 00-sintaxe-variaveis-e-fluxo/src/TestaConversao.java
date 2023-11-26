 
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		//o (int) é chamado de type casting e foi usado para converter um double em um int
		
		long numeroGrande = 32432423523l;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
	}

}

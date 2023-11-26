
public class TestaSomatoria {
	
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while(contador <= 3) {
			total += contador;
			contador++;
		}
		System.out.println("o total eh: " + total);
	}
}

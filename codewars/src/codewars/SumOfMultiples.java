package codewars;
/**
 * @author hugou
 * Kata: Sum of Multiples (8kyu):
 *	
 *	Encontre a soma de todos os múltiplos de n abaixo de m;
 *	O valor m é excluído dos múlplos;
 *
 *	Para números inválidos, a exceção IllegalArgumentException() foi
 *	implementada.
 *
 *	Ex.: Kata.sumMul(3, 13) ==> 3 + 6 + 9 + 12 = 30;
 *  
 */	

public class SumOfMultiples{
	
	public static void main(String[] args) {
		int n = 3;
		int m = 14;
		long sum = 0;
		
		if((n>=m) || n<=0 || m<=0) {
			throw new IllegalArgumentException(); 
		}
		System.out.print("Kata.sumMul("+n+", "+m+") ==> ");
		
		for (int i = n; i < m; i += n){
	        System.out.print(i);
	        if(i<(m-n)) {
	        	System.out.print(" + ");
	        }
	        sum += i;
	    	}
		System.out.println(" = " + sum);
	}
//	----------------------------------------------------------------------------
//	In CodeWars:
	
//		public class Kata extends RuntimeException {
	
//	    public static long sumMul(int n, int m) {
//	      int sum = 0;
//	      
//	      if((n>=m) || n<0 || m<0){
//	        throw new IllegalArgumentException();
//	      }
//	      for(int i = n; i < m; i += n){
//	        sum += i; 
//	      }
//	        return sum;
//	    }
//	}
}

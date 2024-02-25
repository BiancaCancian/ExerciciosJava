//verificar se o número é primo

package ExerciciosLogica;

public class Exercicio_5 {
	
	public static boolean isPrime(int num) {
		//se for menor e igual a 1 não é primo
		 if (num <= 1) {
	            return false;
	        }
		 //se num for divisivel por qualquer numero dentro desse intervalo vai ser falso
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        //se terminar sem encontrar divisor num é primo
	        return true;
	}
	
	public static void main(String[] args) {
		
		int num = 17;
		if(isPrime(num)) {
			System.out.println(num + "é primo.");
		}else {
			System.out.println(num + "não é primo");
		}
		
	}
	
	
}

//calcular fatorial de um numero

package ExerciciosLogica;

public class Exercicio_6 {
	
	//definindo o metodo como estatico
	//definindo a variavel como inteiro com o nome num
	public static int calcularFatorial(int num) {
		//se num for igual a 0 entao o fatorial é 1
		if(num == 0) {
			return 1;
		}
		//se num for igual a 0 calculamos num por num
		else {
			return num * calcularFatorial(num -1);
		}
		
	}
	
	public static void main(String[] args) {
		
		int num = 0;
		int fatorial = calcularFatorial(num);
		System.out.println("O fatorial de " + num + " é: " + fatorial);
		
		
	}

}

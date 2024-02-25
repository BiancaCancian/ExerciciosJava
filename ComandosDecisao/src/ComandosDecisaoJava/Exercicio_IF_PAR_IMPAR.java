/*
 Algoritimo que lê se é par ou impar 
 */

package ComandosDecisaoJava;

import java.util.Scanner;

public class Exercicio_IF_PAR_IMPAR {
	
	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero inteiro: ");
		
		
		//Lê o texto e retorna como inteiro na variavel
		numero = objetoNumero.nextInt();
		
		if(numero %2 == 0) {
			
			System.out.println("Numero " + numero + ", Par");
			
		}else {
			
			System.out.println("Numero " + numero + ", Impar");
			
		}
		
	}

}

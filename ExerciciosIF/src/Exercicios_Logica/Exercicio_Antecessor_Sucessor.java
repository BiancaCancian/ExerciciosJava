/*
 Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
 */

package Exercicios_Logica;

import java.util.Scanner;

public class Exercicio_Antecessor_Sucessor {
	
	public static void main(String[] args) {
		
		//iniciar scanner
		Scanner scanner = new Scanner(System.in);
		
		
		//solicitando entrada de dados usando scanner
		System.out.println("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		
		//criando as variaveis pedidas no enunciado
		int antecessor = numero -1;
		int sucessor = numero +1;
		
		
		//exibir no console antecessor e sucessor
		System.out.println("O numero antecessor de " + numero + " é: " + antecessor);
		System.out.println("O numero sucessor de " + numero + " é: " + sucessor);
		
	}

}

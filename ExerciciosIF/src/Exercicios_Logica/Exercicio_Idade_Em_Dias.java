/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

package Exercicios_Logica;

import java.util.Scanner;

public class Exercicio_Idade_Em_Dias {
	
	public static void main(String[] args) {
		
		//abrindo scanner para console
		Scanner scanner = new Scanner(System.in);
		
		//Leitura de idade em anos meses e dias
		System.out.println("Digite a idade em anos: ");
		int anos = scanner.nextInt();
		
		System.out.println("Digite a idade em meses: ");
		int meses = scanner.nextInt();
		
		System.out.println("Digite a idade em dias: ");
		int dias = scanner.nextInt();
		
		
		// Cálculo da idade em dias
        int idadeEmDias = anos * 365 + meses * 30 + dias;
        
        //exibindo resultado na tela
		System.out.println("A idade expressa em dias é: " + idadeEmDias + " dias");
	
		//encerrando scanner
		scanner.close();
	}

}

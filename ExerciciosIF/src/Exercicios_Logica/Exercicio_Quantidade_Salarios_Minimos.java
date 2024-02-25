/*
 Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
 */

package Exercicios_Logica;

import java.util.Scanner;

public class Exercicio_Quantidade_Salarios_Minimos {
	
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		//aqui ele lê o valor do salario minimo
		System.out.println("Digite o valor do salario minimo: ");
		double minimo = scanner.nextDouble();
		
		//aqui ele le o valor do salario do usuario
		System.out.println("Digite o valor do seu salario: ");
		double usuario = scanner.nextDouble();
		
		//calcula a quantidade de salarios minimos que o usuario recebe
		double qtdsalariominimos = usuario / minimo;
		
		//imprime o resultado no console
		System.out.println("Você ganha: " + qtdsalariominimos + " Salarios minimos");
		
	}

}

//Informar um saldo e imprimir o saldo com reajuste de 1%.


package Exercicios_Logica;

import java.util.Scanner;

public class Exercicio_Reajuste_Salario {
	
	public static void main(String[] args) {
		
		//inicializando um novo scanner
		Scanner scanner = new Scanner(System.in);
		
		//solicitando entrada de dados ao usuario
		System.out.println("Digite o saldo atual: ");
		//criando uma variavel do tipo double que vai guardar o saldo
		double saldo = scanner.nextDouble();
		
		//criando variavel que ira guardar o saldo com reajuste de 1%
		double saldoReajustado = saldo * 1.01;
		
		//imprime o resultado do saldo final
		System.out.println("O saldo com reajuste de 1% é: " + saldoReajustado);
		
		scanner.close();
		
	}

}

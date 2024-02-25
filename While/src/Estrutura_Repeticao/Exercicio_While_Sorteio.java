//Exercicio sorteio com While

package Estrutura_Repeticao;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio_While_Sorteio {
	
	public static void main(String[] args) {
		
		//Random - gera numeros aleatorios
		Random gerador = new Random();
		boolean acertou = false;
		int palpite, tentaivas = 0;
		
		int numero = gerador.nextInt(101);
		
		System.out.println(numero);
		
		
		// while - enquanto
		while(acertou == false) {
			
			palpite = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite um número entre 0 e 100", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
			
			//tentativas++ - Sempre acrescenta 1
			tentaivas++;
			
			if(palpite == numero) {
				
				System.out.println("Acertou em " + tentaivas  + " tentativas");
				
				acertou = true;
				
			}else if(palpite > numero) {
				
				System.out.println("O número digitado é MAIOR");
				
			}else {
				
				System.out.println("O número digitado é MENOR");
				
			}
			
			
		}
		
	}

}

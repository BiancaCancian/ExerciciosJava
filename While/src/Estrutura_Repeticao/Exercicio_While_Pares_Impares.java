//Exercicio pares e impares

package Estrutura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_While_Pares_Impares {
	
	public static void main(String[] args) {
		
		int numero, qtdPar, qtdImpar;
		
		numero = 0;
		
		qtdPar = 0;
		qtdImpar = 0;
		
		numero =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
		
		System.out.println(numero);
		
		// while - enquanto
		while(numero >= 0) {
			
			
			if(numero > 0) {
				
				if(numero % 2 == 0) {
					
					qtdPar++;
					
				}else {
					
					qtdImpar++;
					
				}
				
			}
			
            numero =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
			
			System.out.println(numero);
			
		}
		
		System.out.println("Qtd Par: " + qtdPar);
		System.out.println("Qtd Impar: " + qtdImpar);
		
	}

}

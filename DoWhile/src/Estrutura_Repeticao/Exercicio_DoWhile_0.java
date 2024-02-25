//Encerrar o programa apenas quando o usuario digitar 0, verifica numero positivo e negativo

package Estrutura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_DoWhile_0 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		do {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero ou zero para sair"));
			
			if(numero > 0) {
				
				
				System.out.println(numero + " positivo!");
				
			}else if(numero < 0) {
				
				System.out.println(numero + " negativo!");
				
			}
			
			
		}while(numero != 0); {
			
			System.out.println(numero + " Até a proxima!");
			
		}
		
	}

}

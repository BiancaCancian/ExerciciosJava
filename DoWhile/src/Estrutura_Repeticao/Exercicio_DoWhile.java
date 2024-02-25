//Exercicio DoWhile programa so termina quando digitar 1 e 5

package Estrutura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_DoWhile {
	
	public static void main(String[] args) {
		
		double numero;
		
		//faça
		do {
			
			numero =Double.parseDouble(JOptionPane.showInputDialog("Digite um número ou de 1 a 5 para encerrar!"));
			
			if(numero < 1 || numero > 5) {
				
				System.out.println("Número invalido. Tente novamente");
				
			}
			
		//enquanto	
		}while(numero <1 || numero > 5);{
			
			System.out.println("Muito bem programa encerrado!");
			
			
		}
			

		
	}

}

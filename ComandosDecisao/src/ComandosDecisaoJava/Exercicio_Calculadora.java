//Calculadora em Java com Switch

package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exercicio_Calculadora {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		int opcao;
		
		opcao =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma das opções a seguir: \n 1 - Adição\n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão\n", "Leia com Atenção!", JOptionPane.QUESTION_MESSAGE));
		numero1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número", "Exercicio Java", JOptionPane.QUESTION_MESSAGE));
		numero2 =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro segundo", "Exercicio Java", JOptionPane.QUESTION_MESSAGE));
		
		switch(opcao) {
		
		  case 1: 
			  
			  //Adição
			  resultado = numero1 + numero2;
			  System.out.printf("%d + %d = %d", numero1, numero2, resultado);
			  
			  break;
			  
          case 2: 
			  
			  //Subtração
			  resultado = numero1 - numero2;
			  System.out.printf("%d - %d = %d", numero1, numero2, resultado);
			  
			  break;
			  
          case 3: 
			  
			  //Multiplicação
			  resultado = numero1 * numero2;
			  System.out.printf("%d * %d = %d", numero1, numero2, resultado);
			  
			  break;

          case 4: 
			  
			  //Divisão
			  resultado = numero1 / numero2;
			  System.out.printf("%d / %d = %d", numero1, numero2, resultado);
			  
			  break;
			  
			  	  
			default: {
				
				System.out.println("Opacao Invalida!");
				
				break;
				
			}
		  
		
		}
	}

}

// Exercicio vogal e consoante

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Vogal_Consoante {
	
	public static void main(String[] args) {
		
		String nome;
		int nomesComVogal = 0;
		int nomesComConsoante = 0;
		
		 for(int contador = 1; contador <= 3; contador++ ) {
			
			nome = JOptionPane.showInputDialog(null, "Digite o nome" + contador + " :", "Leia com atenção", JOptionPane.QUESTION_MESSAGE);
			
			//trim - remove os espaços em brancos do inicio do nome
			//LoweCase - deixa todas as letras em minusculas
			//charat - pega a primeira letra da variavel nome
			// || - ou
			if(nome.trim().toLowerCase().charAt(0)== 'a' || 
					nome.trim().toLowerCase().charAt(0)== 'e' || 
					nome.trim().toLowerCase().charAt(0)== 'i' || 
					nome.trim().toLowerCase().charAt(0)== 'o' || 
					nome.trim().toLowerCase().charAt(0)== 'u'  ){
				
				nomesComVogal++;
				nomesComConsoante = 3 - nomesComVogal;
				
				System.out.println("Nomes com vogal: " + nomesComVogal);
				System.out.println("Nomes com consoante: " + nomesComConsoante);
				
				
			}
			
		}
		
	}

}

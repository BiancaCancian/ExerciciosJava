// Exercicio media turma

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Media_Aluno_Turma {
	
	public static void main(String[] args) {
		
		String aluno;
		float nota1, nota2, media, somaMedias, mediaTurma;
		
		somaMedias = 0;
		
		//for - para
		for(int contador = 1; contador <= 3; contador++) {
			
			aluno = JOptionPane.showInputDialog("Nome do aluno: ");
			
			nota1 =Float.parseFloat( JOptionPane.showInputDialog("Digite a primeira nota: "));
			nota2 =Float.parseFloat( JOptionPane.showInputDialog("Digite a segunda nota: "));
			
			media = (nota1 + nota2) / 2;
			
			somaMedias = somaMedias + media;
			
			System.out.println("Aluno(a): " + aluno);
			System.out.println("Aluno(a): " + media);
			
			
			if(media >= 6) {
				
				System.out.println("Aluno(a) Aprovado");
				
			}else {
				
				System.out.println("Aluno(a) Reprovado");
				
			}
			
		}
		
		mediaTurma = somaMedias / 3;
		System.out.println("\nMedia da turma: " +mediaTurma);
			
		
	}

}

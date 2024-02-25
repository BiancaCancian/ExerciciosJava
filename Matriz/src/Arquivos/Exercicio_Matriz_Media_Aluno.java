//construir uma matriz que permita entrada de 3 notas de tres alunos; imprimir media de cada aluno e sua situação

package Arquivos;

import java.util.Scanner;

public class Exercicio_Matriz_Media_Aluno {
	
	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		double[][] notasAlunos = new double[3][3];
		
		//for - para
		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna++) {
				
				int numeroNota = 0;
				numeroNota = coluna + 1;
				System.out.print("Digite a nota " + numeroNota + ": " );
				notasAlunos[linha][coluna] = objetoNumero.nextDouble();
				
				
			}
			
		}
		   //imprimindo a matriz
            for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna++) {
		
				System.out.print(notasAlunos[linha][coluna]+ "   " );
				
				
			}
			
			System.out.println(" ");
			
		}
            
            System.out.println("\nCalculando a media de cada aluno\n ");
            
            double somaNotas, mediaAluno;
            
            for(int linha = 0; linha < 3; linha++) {
            	
            	somaNotas = 0;
    			
    			for(int coluna = 0; coluna < 3; coluna++) {
    				
    				//somar a nota das colunas de cada linha
    				somaNotas += notasAlunos[linha][coluna];
    				
    				
    				
  			}
    			
    			int numeroAluno = 0;
    			numeroAluno = linha + 1;
    			
    			mediaAluno = somaNotas / 3;
    			System.out.println("Média do aluno" + numeroAluno + " = " + mediaAluno);  		
    			
    			if(mediaAluno >= 6) {
    				
    				System.out.println("Aluno aprovado(a)");
    				
    			}else if(mediaAluno >= 2){
    				
    				System.out.println("Aluno em recuperação");
    				
    			}else {
    				
    				System.out.println("Aluno em reprovado(a)");
    				
    			}
    			
    			System.out.println("");
        }
		
		
	}

}

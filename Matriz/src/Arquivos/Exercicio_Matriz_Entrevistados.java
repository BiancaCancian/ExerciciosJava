//Exercicio pessoas entrevistadas

package Arquivos;

import java.util.Scanner;

public class Exercicio_Matriz_Entrevistados {
	
	public static void main(String[] args) {
		
		//ler o que o usuario digitar e armazenar na variavel
		Scanner scannerPessoa = new Scanner(System.in);
		
		int numeroPessoasEntrevistadas = 0;
		int quandidadeFilhos = 0;
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
		numeroPessoasEntrevistadas = scannerPessoa.nextInt();
		
		String[][] nomesFilhos = new String[numeroPessoasEntrevistadas][];
		
		// tamanho da matriz
		for(int linha = 0; linha < nomesFilhos.length; linha++) {
			
			int numeroPessoa = 0;
			
			numeroPessoa = linha+1;
			
			System.out.println("Digite a quantidade de filhos que a pessoa " + numeroPessoa + " tem: ");
			quandidadeFilhos = scannerPessoa.nextInt();
			
			//adiciona a quantidade de colunas
			 nomesFilhos[linha] = new String[quandidadeFilhos];
			
			 //contando quantas colunas tem na linha
			for(int coluna = 0; coluna < nomesFilhos[linha].length; coluna++) {
				
				int numeroFilho= 0;
				
				numeroFilho = coluna +1;
				
				
			System.out.println("Digite o nome do filho  " + numeroFilho + " da pessoa" + numeroPessoa);
			nomesFilhos[linha][coluna] = scannerPessoa.next();
				
			}
			
		}
		
		//imprimindo os itens da matriz
		for(int linha = 0; linha < nomesFilhos.length; linha++) {
			
            int numeroPessoa = 0;
			
			numeroPessoa = linha+1;
			
			System.out.println("Pessoa " + numeroPessoa + "Tem " + nomesFilhos[linha].length + "Filhos: ");
			
			//total de colunas
			for(int coluna = 0; coluna < nomesFilhos[linha].length; coluna++) {
				
				System.out.println(nomesFilhos[linha][coluna]);
				
			}
			
		}
		
	}

}

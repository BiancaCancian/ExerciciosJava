package ComandosDecisaoJava;

import java.util.Scanner;

public class IF_ELSEIF_ELSE {
	
	public static void main(String[] args) {
		
		/*
		
		//scanner - objeto da classe javauntil
		//system.in - lê as informações do teclado
		Scanner objetoIdade = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		
		//nestint- lê e retorna um numero inteiro
		idade = objetoIdade.nextInt();
		
		//IF - SE
		if(idade >= 18) {
			
			System.out.println("Maior de idade" );
			
		}else {
			
			System.out.println("Menor de idade" );
			
		}*/
		
		//exemplo media de aluno
		
		Scanner objetoNota = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a nota 1");
		nota1 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 2");
		nota2 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 3");
		nota3 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 4");
		nota4 = objetoNota.nextDouble();
		
		// calcula a media
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		
		if(media >= 7) {
			System.out.println("Media: " + media+ "- Situação: Aprovado(a)");
		}else if(media >= 2) {
			System.out.println("Media: " + media+ "- Situação: Recuperação(a)");
		}else {
			System.out.println("Media: " + media+ "- Situação: Reprovado(a)");
		}
		
		
	}

}

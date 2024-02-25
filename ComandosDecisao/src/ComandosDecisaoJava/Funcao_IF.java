package ComandosDecisaoJava;

public class Funcao_IF {
	
	public static void main(String[] args) {
		
		int numero = 9;
		String nome = "Bianca";
		
		/*
		 == - igual - equals
		 != - diferente
		 > - maior
		 < - menor
		 >= - maior ou igual
		 <= - menor ou igual
		 */
		
		//if - se 
		if(numero > 10) {
			
			System.out.println("O numero é maior que 10");
		}else {
			
			System.out.println("O numero é menor que 10");
			
		}
		
        if(nome.equals ("Bianca")) {
			
			System.out.println("O nome é: " + nome);
		}else {
			
			System.out.println("O nome invalido");
			
		}
		
	}

}

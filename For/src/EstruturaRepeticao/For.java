package EstruturaRepeticao;

public class For {
	
	public static void main(String[] args) {
		
		/*
		 
		 Só usamos o for quando soubermos quantas vezes usar esse comando
		 Configura a nossa variavel para servir de contador 
		 Contador é a condição para continuar a execução
		 contador++ = incremento ate o contador atingir o resultado esperado
		 inicialização / controle / incremento
		 
		 */
		//para
		/*
		for(int contador = 1; contador <= 10; contador++) {
			
			System.out.println("Numero:" +contador);
			
		}
		*/
		
		/*
       for(int contador = 10; contador >= 1; contador--) {
			
			System.out.println("Numero:" +contador);
			
		}
		*/
		
		  for(int contador = 5; contador <= 50; contador+=5) {
				
				System.out.println("Numero:" +contador);
				
			}
		
       
       
	}

}

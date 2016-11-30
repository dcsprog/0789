package dia021116;

public class Condicionais {

	public Condicionais(){
		
//		comparadorSimples();
		comparadorMultiVariavel();
	}
	
	public void comparadorSimples(){
		
		int num1 = 4;
		int num2 = 3;
		
		/*
		 * =  -> Atribui��o
		 * == -> Compara��o  (true || false)
		 * <  -> Compara��o
		 * >  -> Compara��o
		 * != -> Compara��o
		 */
		 
		
		if (num1 == num2){
			System.out.println("Os n�meros s�o iguais");
		}else if(num1 < num2){
			System.out.println("O n�mero 1 � menor que o numero 2");
		}else {
			System.out.println("O n�mero 1 � maior que o n�mero 2");
		}
	}
	
	public void comparadorMultiVariavel(){
		
		int num1 = 5;
		int num2 = 7;
		int num3 = 3;
		int num4 = 8;
		
		// se o numero1 maior que num2
		
		/* &  -> Concatenador 
		 * && -> Comparador (e)
		 * || -> Comparador (ou)
		 */
		
		if (num1 > num2 && num1 > num3){
			
			System.out.println("O n�mero 1 � maior");
		}
		
		if (num1 > num2 && num1 > num3 && num1 > num4){
			
			System.out.println("O n�mero 1 � maior de todos");
		}
		
		if (num2 > num3 || num1 > num4){
			System.out.println("Ganha a equipa n�mero 1");
		}else {
			System.out.println("Ganha a equipa n�mero 2");
		}
		
		/*
		 * !  -> Comutador de sinal / nega��o (verdadeiro para falso ou )
		 * () -> Agrupam condi��es de verdade
		 */

		if (num2 > num3 || num1 > num4){
			System.out.println("Ganha a equipa n�mero 1");
		}else {
			System.out.println("Ganha a equipa n�mero 2");
		}
		
	}
}

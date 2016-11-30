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
		 * =  -> Atribuição
		 * == -> Comparação  (true || false)
		 * <  -> Comparação
		 * >  -> Comparação
		 * != -> Comparação
		 */
		 
		
		if (num1 == num2){
			System.out.println("Os números são iguais");
		}else if(num1 < num2){
			System.out.println("O número 1 é menor que o numero 2");
		}else {
			System.out.println("O número 1 é maior que o número 2");
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
			
			System.out.println("O número 1 é maior");
		}
		
		if (num1 > num2 && num1 > num3 && num1 > num4){
			
			System.out.println("O número 1 é maior de todos");
		}
		
		if (num2 > num3 || num1 > num4){
			System.out.println("Ganha a equipa número 1");
		}else {
			System.out.println("Ganha a equipa número 2");
		}
		
		/*
		 * !  -> Comutador de sinal / negação (verdadeiro para falso ou )
		 * () -> Agrupam condições de verdade
		 */

		if (num2 > num3 || num1 > num4){
			System.out.println("Ganha a equipa número 1");
		}else {
			System.out.println("Ganha a equipa número 2");
		}
		
	}
}

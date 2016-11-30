package dia021116;

import java.util.Scanner;

public class CalculadoraInfinita {

	public CalculadoraInfinita() {
		// TODO Auto-generated constructor stub
		/* A calculadora deve:
		 * 1) Pedir o primeiro numero;
		 * 2) Pedir o segundo numero
		 * 3) Pedir a operação;
		 * 4) Apresentar o resultado no ecra ou sair se o segundo numero for igual a 0
		 *
		 * 
		 */
		calculadora();
	}
	
	int num1, num2, res=0, total=0;
	
	public void calculadora(){
		
		System.out.println("Introduza um valor ");
		num1 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Introduza um segundo valor ");
		num2 = (new Scanner(System.in)).nextInt();
		
		
		
		int i=5;
		
		while(i!=0){
			ecra();
			System.out.println("Qual é a operação de deseja");
			i = (new Scanner(System.in)).nextInt();
		
			if(i==1){
				System.out.println(soma());
				total = total + soma();
				System.out.println("O res atual e "+total);
			}else if(i==2){
				System.out.println(sub());
				total = total + sub();
				System.out.println("O res atual e "+total);
			}else if(i==3){
				System.out.println(div());
				total = total + div();
				System.out.println("O res atual e "+total);
			}else if(i==4){
				System.out.println(mult());
				total = total + mult();
				System.out.println("O res atual e "+total);
			}else if(i==0){
				System.out.println("fim de programa...");
				System.exit(0);
			}
		}
	}
	
	public void ecra(){

		System.out.println("-------1) Soma             -------");
		System.out.println("-------2) Subitração       -------");
		System.out.println("-------3) Divisão          -------");
		System.out.println("-------4) Multiplicação    -------");
		System.out.println("-------0) Sair             -------\n\n");
	}
	
	
	public int soma(){
		
		//res = num1+num2;
		return num1+num2;
	}
	
	public int sub(){

		//res = num1-num2;
		return num1-num2;
	}
	public int div(){
		
		//res = num1/num2;
		return num1/num2;
	}
	public int mult(){
		
		//res = num1*num2;
		return  num1*num2;
	}

}

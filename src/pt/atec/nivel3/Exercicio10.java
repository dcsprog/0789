package pt.atec.nivel3;

import java.util.Scanner;

public class Exercicio10 {

	public Exercicio10() {
		// TODO Auto-generated constructor stub
		calcInfinita();
	}
	
	public static void calcInfinita(){
		
		int num1=0, num2=0, res=0;
		char op=' ';
		boolean verf=true;
		Scanner n=new Scanner(System.in);
		
		do{
			System.out.println("Introduza um valor: ");
			num1=n.nextInt();
			
			System.out.println("Introduza um aoperacao desejada..");
			System.out.println("  +  ->  Soma");
			System.out.println("  -  ->  Subtrair");
			System.out.println("  *  ->  Multiplicar");
			System.out.println("  /  ->  Dividir");
			System.out.println("  0  ->  Sair ");
			
			op=n.next().charAt(0);
			
			if(op!='0'){
			System.out.println("Entre com o segundo valor: ");
			num2=n.nextInt();
			}
			
			switch(op){
				case '+':
					res=num1+num2;
					System.out.println("O resultado da soma e "+res+"\n\n");
					break;
				case '-':
					res=num1-num2;
					System.out.println("O resultado da subtracao e "+res+"\n\n");
					break;
				case '*':
					res=num1*num2;
					System.out.println("O resultado da multiplicacao e "+res+"\n\n");
					break;
				case '/':
					res=num1/num2;
					System.out.println("O resultado da divisao e "+res+"\n\n");
					break;
				case '0':
					System.out.println("O programa vai encerrar..."+"\n\n");
					verf=false;
					break;
				default :
					System.out.println("A sua opcao nao e valida..."+"\n\n");
			}
			
			
		}while(verf);
		
		
		
	}

}

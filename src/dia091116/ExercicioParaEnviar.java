package dia091116;

import java.util.Scanner;

public class ExercicioParaEnviar {

	public ExercicioParaEnviar() {
		// TODO Auto-generated constructor stub
		//exercicio2();
		//exercicio3();
		//exercicio4();
	//	exercP();
	}
	
	public void exercicio1(){
		
		//declare um array paraSomar, com os valores 2,5 e 4.
		
		int [] paraSomar = {2, 5, 4};
		int soma=0;
		
		for(int i=0; i< paraSomar.length; i++){
			soma = soma + paraSomar[i];
			// || soma += paraSomar[i];
			System.out.println(soma);
		}
		
	}
	
	public void exercicio2(){
		// converter uma moeda
		// declarar variaveis nescessarias para converter uma moeda para outra
		// pedir um valor de cotacao em float
		// mostrar o resultado da conversao
		
		int moeda=0;
		float resul = 0;
		float cotacao;
		
		System.out.println("Conversor de moedas para euro\n");
		System.out.println("Introduza o valor da moeda:\n");
		moeda = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza a cotacao da moeda");
		cotacao = (new Scanner(System.in)).nextFloat();
		
		System.out.println("A convercao da moeda e €" +  resul+(moeda*cotacao));
		
	}
	
	public void exercicio3(){
		
		//criar uma triangulo invertido pedindo ao utilisador o tamanho 
		//usar ciclos encadeados
		
		int tamanho=0;
		System.out.println("Qual é o tamanho da piramide");
		tamanho = (new Scanner(System.in)).nextInt();
		
			for(int i=0; i <= tamanho; i++){
				for(int j=i; j<=tamanho; j++){
					System.out.print("*");
				}
				System.out.println(" ");
			}
	}
	
	public void exercicio4(){
		// criar um carrinho de compras com um total de 10 produtos utilizando arrays
		// Pedir so numeros inteiros 
		// Mostrar a soma do total da compra 
		
		int compras []= new int [10];
		int vprod=0;
		int soma=0;
		for(int i=0; i< compras.length; i++){
			System.out.println("Qual é o valor do produto: ");
			vprod = (new Scanner(System.in)).nextInt();
			compras[i]=vprod;
			soma+=compras[i];
		}
		
		System.out.println("O valor da compra e € "+soma);
			
	}
	
	/*public void exercP(){
		
		int n;
		System.out.println("Introduza o valor de n ");
		n = (new Scanner(System.in)).nextInt();
		
		for(int i=0; i<=n;i++){
			for(int j=n; j>i;j--){
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	*/
	
	public void mediaGols(){
		int [][]  golmarcado = new int[2][9];
		
		
		int [] vguimaraesNacional = {2,1};
		int [] estorilTondela = {2,0};
		int [] pferreiraChave = {1,1};
		int [] ferenseBelenense={0,1};
		int [] rioaveBoavista={1,2};
		int [] moreirenseVsetubal={1,2};
		int [] fcportoBenfica={1,1};
		int [] sportingArouca={3,0};
		int [] maritimoBraga={1,0};
		
		golmarcado[0][0] = vguimaraesNacional[0];
		golmarcado[1][0] = vguimaraesNacional[1];
		golmarcado[0][1] = estorilTondela[0];
		golmarcado[1][1] = estorilTondela[1];
		golmarcado[0][2] = pferreiraChave[0];
		golmarcado[1][2] = pferreiraChave[1];
		golmarcado[0][3] = ferenseBelenense[0];
		golmarcado[1][3] = ferenseBelenense[1];
		golmarcado[0][4] = rioaveBoavista[0];
		golmarcado[1][4] = rioaveBoavista[1];
		
	}
	
}

	


package pt.atec.nivel1;

import java.util.Scanner;

public class Exercicio01 {
	

	public Exercicio01() {
		
		primeiro();
	}

	public static  void primeiro(){
		
		// TODO Auto-generated constructor stub
	
		
		int[] valor = new int[5];
		int maior=0, menor=0;
		
		System.out.println("Entre com 5 valores entre 1 0 100 ao utilizador:\n\n");
		
		for(int i=0; i<5; i++){
			int n= new Scanner(System.in).nextInt();
			if(i==0){
				menor=n;
				maior=n;
			}
			valor[i]=n;
		}
		
		for(int i=0; i<5; i++){
			if(valor[i]<menor){
				menor=valor[i];
			}
			if(valor[i]>maior){
				maior=valor[i];
			}
		}
		
		System.out.println("maior valor e "+maior+"\n\nmenor valor e "+menor);
}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercicio01();
	}*/

}



	


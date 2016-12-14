package pt.atec.nivel2;

import java.util.Scanner;

public class Exercicio02 {

	public Exercicio02() {
		// TODO Auto-generated constructor stub
		primeiro();
	}
	
	public static  void primeiro(){
		
		char[] carac = new char[5];
		int cont0=0, cont9=0;
		Scanner n = new Scanner(System.in);
		
		for(int i=0; i<carac.length;i++){
			
			n.next().charAt(0);		
			if(carac[i]>0&&carac[i]<9){
				cont0++;
			}
		}
		
		System.out.println("Foi encontrado "+cont0);
	}

}

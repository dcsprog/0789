package dia281016;

import java.util.Random;
import java.util.Scanner;

/*
 * Random : V
 */
public class AdivinhaNumero {
	int escondido;
	final int VALORMAX = 5;
	
	public AdivinhaNumero() {
		Random r = new Random();
		
		escondido = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
	}
	
	public void tentarAdivinhar(){
		int n;
		System.out.println("3 Tentativa de adivinha \n\n");
		
		for(int i=1; i <=3;i++){
			
			System.out.println("Introduza um valor de 0 a 5");
			n = (new Scanner(System.in)).nextInt();
			
			if(i<3){
				if(n == escondido){
					System.out.println("Correto...\nO numero inserido foi "+ escondido);
					i=3;
				}else if(n > escondido){
					System.out.println("O numero é maior...\n");
				}else{
					System.out.println("O numero é menor...\n");
				}
			}else{
				System.out.println("Acabou as tentativas...");
			}
			
		}
		
	}

}

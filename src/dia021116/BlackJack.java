package dia021116;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {

	
	
	public BlackJack() {
		jogo();
	}
	
	
	
	public int jogo(){
		
		
		Random carta = new Random();
		
		//System.out.println("Quantos jogadores?");
		//int n = (new Scanner(System.in)).nextInt();
		int jogo=0;
		int cjogador=0;
		int cjogadorb=0;
		int tcjogador=0; 
		int tcjogadorb=0;
		//while((tcjogador <= 21) | (tcjogadorb <= 21)){
		for(int i=0; i < 2;i++)	{
		int jogada = 0;
			while((jogada < 2)){
			cjogador =  carta.nextInt(13-1)+1;
			System.out.println("JOGADOR A  ->  "+cjogador);
			cjogadorb = carta.nextInt(13-1)+1;
			System.out.println("JOGADOR B  ->  "+cjogadorb);
			jogada++;
			}tcjogador+=cjogador;
			tcjogadorb+=cjogadorb;
		}
		if(tcjogador <= 21 & tcjogador > tcjogadorb){
			System.out.println("\n\nO JOGADOR A acabou de ganhar");
			System.out.println("\n"+tcjogador);
			System.out.println("\n"+tcjogadorb);
		}
		else{
			System.out.println("\n\nO JOGADOR B acabou de ganhar");
			System.out.println("\n"+tcjogadorb);
			System.out.println("\n"+tcjogador);
		}
			
		
		return 0;
	}
}

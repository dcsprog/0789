package dia201116;

import java.util.Random;
import java.util.Scanner;

import dia201116.Equipa;
public class JogoFutebol {

	public JogoFutebol(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int golo=0, mediagool=0,somagool=0;
	Random gool = new Random();
	String nome;
	Equipa panda = new Equipa();
	Equipa caricas = new Equipa();
	Equipa bob = new Equipa();
	Equipa pocoyo = new Equipa(); 
	Equipa name=new Equipa();
	int somaP=0,somaC=0,somaB=0, somaPO=0;
	int mediaTP=0, mediaTC=0,mediaTB=0, mediaTPO=0;
	int [][] mediaG = new int [2][3];
	
	
	/*System.out.println("Jornada A");
	System.out.println("Nomes das Equipas ");
	*/
	/*panda.nomeEquipa=new Scanner(System.in).nextLine();
	System.out.println("X");
	caricas.nomeEquipa=new Scanner(System.in).nextLine();
	panda.goloEquipa=gool.nextInt(10);	\q
	caricas.goloEquipa=gool.nextInt(10);
	System.out.println("Resultado  ");
	System.out.println(panda.getLugar()+" "+panda.getGoloEquipa()+"  : "+caricas.getLugar()+" "+caricas.getGoloEquipa());
	mediagool+=panda.getGoloEquipa()+caricas.getGoloEquipa();
	*/
	
	/*for(int i=0;i<mediaG.length;i++){
		for(int j=0;j<mediaG.length;j++){
			System.out.println(" ");
			System.out.println((i+1)+"ª Jornada A");
			System.out.println("Nomes das Equipas ");
			panda.setNomeEquipa(nome=new Scanner(System.in).nextLine());
			caricas.setNomeEquipa(nome=new Scanner(System.in).nextLine());
			panda.setGoloEquipa(gool.nextInt(10));
			caricas.setGoloEquipa(gool.nextInt(10));
			mediaG[j][i]=panda.getGoloEquipa();
			somaG+=panda.getGoloEquipa();
		}
		mediaT=somaP/3;*/
		
	for(int i=0;i<mediaG.length;i++){
		for(int j=0;j<mediaG.length;i++){
			System.out.println(" ");
			System.out.println((i+1)+"ª Jornada A");
			System.out.println("Nomes das Equipas ");
			panda.setNomeEquipa(nome=new Scanner(System.in).nextLine());
			panda.setGoloEquipa(gool.nextInt(10));
			mediaG[j][i]=panda.getGoloEquipa();
			somaP+=panda.getGoloEquipa();
		}
		
		for(int i1=0;i1<mediaG.length;i1++){
			for(int j=0;j<mediaG.length;i1++){
				 caricas.setNomeEquipa(nome=new Scanner(System.in).nextLine());
				 caricas.setGoloEquipa(gool.nextInt(10));
				  mediaG[j+1][i1+1]=caricas.getGoloEquipa();
					somaC+=caricas.getGoloEquipa();
			}
			}
		
	/*
	 * caricas.setNomeEquipa(nome=new Scanner(System.in).nextLine());
	 * caricas.setGoloEquipa(gool.nextInt(10));
	 * mediaG[j+1][i+1]=caricas.getGoloEquipa();
		somaC+=caricas.getGoloEquipa();
		bob.setNomeEquipa(nome=new Scanner(System.in).nextLine());
		pocoyo.setNomeEquipa(nome=new Scanner(System.in).nextLine());
		bob.setGoloEquipa(gool.nextInt(10));
		pocoyo.setGoloEquipa(gool.nextInt(10));
		mediaG[j+2][i+2]=bob.getGoloEquipa();
		somaB+=bob.getGoloEquipa();
		mediaG[j+3][i+3]=pocoyo.getGoloEquipa();
		somaPO+=pocoyo.getGoloEquipa();
		mediaTP=somaP/3;
		mediaTC=somaC/3;
		mediaTB=somaB/3;
		mediaTPO=somaPO/3;*/
		}

	for(int i=0;i<mediaG.length;i++){
		for(int j=0;j<mediaG.length;j++){
			System.out.println(" ");
			//System.out.println(x);
			System.out.print(mediaG[j][i]+" X "+(mediaG[j+1][i+1])+"\n\n");
		}
	}	//System.out.println("A soma de todos os golos marcados foi de "+somaG+" golos.");
	System.out.println("A media de todos golos marcados foi de "+mediaTP+" golos.");
	System.out.println("A media de todos golos marcados foi de "+mediaTC+" golos.");
	System.out.println("A media de todos golos marcados foi de "+mediaTB+" golos.");
	System.out.println("A media de todos golos marcados foi de "+mediaTPO+" golos.");
	
}
}

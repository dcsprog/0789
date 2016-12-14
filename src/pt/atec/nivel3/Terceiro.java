package pt.atec.nivel3;

import java.util.Random;

public class Terceiro {

	public Terceiro() {
		// TODO Auto-generated constructor stub
		terceiroE();
	}

	
	public static void terceiroE(){
	
	Random rand = new Random();
	int[] numero = new int[20];
	int aux=0, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0, cont8=0, cont9=0;
	//rand.nextInt(1-9);
	
	for(int i=0; i<20; i++){
		numero[i]=rand.nextInt((9-1)+1)+1;
	}
	
	/*for(int i=0; i<20; i++){
		System.out.println(numero[i]);
	}*/
	
	
	for(int i=0; i<20; i++){
		if(numero[i]==1){
			cont1++;
		}else if(numero[i]==2){
			cont2++;
		}else if(numero[i]==3){
			cont3++;
		}else if(numero[i]==4){
			cont4++;
		}else if(numero[i]==5){
			cont5++;
		}else if(numero[i]==6){
			cont6++;
		}else if(numero[i]==7){
			cont7++;
		}else if(numero[i]==8){
			cont8++;
		}else if(numero[i]==9){
			cont9++;
		}
	}
	System.out.println("1-"+cont1+"x"+"  2-"+cont2+"x"+" 3-"
	+cont3+"x"+" 4-"+cont4+"x"+" 5-"+cont5+"x"+" 6-"+cont6+"x"+" 7-"+cont7+"x"
			+" 8-"+cont8+"x"+" 9-"+cont9+"x");
  }
}
package dia201116;

import java.util.Scanner;
import dia201116.Despesas;
public class CalcularDespesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = " ";
		int valor = 0;
		int totalDespesa = 0;
		int totalTodasDesp = 0;
		Despesas despm = new Despesas();
		Scanner scanner = new Scanner(System.in);
		String nameA="", nameB="", nameC="", nameD="";
		int despA=0, despB=0, despC=0, despD=0; 
		
		
		for(int i=0; i<=3;i++){
			System.out.println(" ");
			System.out.println("Qual e a nome da despesa a introduzir? ");
			//name=scanner.nextLine();
			despm.setNameDespesa(name=new Scanner(System.in).nextLine());
			System.out.println("Qual e a valor da media desta despesa?");
			valor=scanner.nextInt();
			despm.setValorMensal(valor);
			totalDespesa=despm.calcularDesp(valor);
			System.out.println("O valor anual da despesa e €"+totalDespesa+",00");
			totalTodasDesp += totalDespesa;
			if(i==0){
				nameA=name;
				despA=totalDespesa;
			}else if(i==1){
				nameB=name;
				despB=totalDespesa;
			}else if(i==2){
				nameC=name;
				despC=totalDespesa;
			}else if(i==3){
				nameD=name;
				despD=totalDespesa;
			}
		}
		System.out.println("\n\nO total da media mensal de "+ nameA +" e de €"+despA+",00");
		System.out.println("O total da media mensal de "+ nameB +" e de €"+despB+",00");
		System.out.println("O total da media mensal de "+ nameC +" e de €"+despC+",00");
		System.out.println("O total da media mensal de "+ nameD +" e de €"+despD+",00");
		System.out.println("O total de todas as despesas e €"+totalTodasDesp+",00"); 
		
	}

}

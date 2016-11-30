package dia281016;

import java.util.Scanner;

/*
 * Interac��o com o utilizador
 * Partes de um m�todo
 */
public class BalancoGAA {

	public BalancoGAA() {
		int receita = receitas();
		int despesa = despesas();
		
		int balanco = calcularBalanco(receita, despesa);
		
		System.out.println("O balanco do ano de actividade � de: " + balanco);
		
		if (balanco > 0) {
			System.out.println("Balanco positivo");
		} else if (balanco == 0) {
			System.out.println("Balanco neutro");
		} else {
			System.out.println("Balanco negativo");				
		} 
		
	}
	
	public int receitas() {
		System.out.println("Qual foi o total angariado com as quotas?");
		int quotas = (new Scanner(System.in)).nextInt();

		System.out.println("Qual foi o total angariado com as festas em honra � Senhora da Arrudinha?");
		int festas = (new Scanner(System.in)).nextInt();
		
		int totalReceitas = quotas + festas;
		
		return totalReceitas;	
	}
	
	public int despesas() {
		System.out.println("Qual foi o total despendido com as contas da electricidade?");
		int luz= (new Scanner(System.in)).nextInt();

		System.out.println("Qual foi o total despendido com as contas da �gua?");
		int agua = (new Scanner(System.in)).nextInt();
		
		int totalDespesas = luz + agua;
		
		return totalDespesas;			
	}
	
	public int calcularBalanco(int receita, int despesa) {
		int balanco = receita - despesa;
		
		return balanco;
	}

}

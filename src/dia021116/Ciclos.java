package dia021116;

public class Ciclos {

	public Ciclos() {
//		enquanto();
//		fazerEnquanto();
		de_para();
	}

	public void enquanto(){
		
		int i = 0;
//		String msg = "Primeira linha ";
		String msg = "All you need is love";
		
		while (i < 4){
			System.out.println(msg+(i+1));
			i++;
		}
	}
	
	public void fazerEnquanto(){
		
		int i = 5;
		String msg = "All you need is love ";
		
		do{
			System.out.println(msg);
			i++;
			
		}while(i <= 4);
	}
	
	public void de_para(){
		String msg = "All you need is love ";
		/*
		 * for 
		 * int i = 0; -> inicializa a variavel de controlo
		 * i < 4 ;    -> Testa a variavel de controlo
		 * i++        -> executa a ação
		 */
		for(int i = 0; i < 4; i++){
			System.out.println(msg);
		}
	}
}

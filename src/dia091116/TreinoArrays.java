package dia091116;

public class TreinoArrays {

	public TreinoArrays() {
	
		// N. golos num jogo:
		// Porto - Benfica
		// Tipo de variavel; [] array; nome de variavel; inicialização com tamnho de variavel
		
		int[] golos = new int[2];
		
		//atribuir variaves ao array
		
		golos [0] = 1;
		golos [1] = 1;
		
		// Não válido, pois o array é de inteiros
		// golos [0] ="1";
		
		// Instanciação com inicialização de variaveis
		
		int [] portoBenfica = {1, 1};
		
		int [] sportingArouca = {3, 0};
		
		int [] maritimoBraga = {1, 0};
		
		int [][] jogosGrandes = new int [2][3];
		
		jogosGrandes[0][0] = portoBenfica[0];
		jogosGrandes[1][0] = portoBenfica[1];
		jogosGrandes[0][1] = sportingArouca[0];
		jogosGrandes[1][1] = sportingArouca[1];
		jogosGrandes[0][2] = maritimoBraga[0];
		jogosGrandes[1][2] = maritimoBraga[1];
		
		/*for(int i= 0; i < sportingArouca.length; i++){
			System.out.println(sportingArouca[i]);
		}*/
		
		System.out.println(jogosGrandes[0][0]);
		
	}
	

}

package dia161116;

public class CimaBaixo extends Jogo{
	public CimaBaixo(){
		Carta asespadas = new Carta();
		asespadas.setPontuacao(11);
		asespadas.setNaipe(3);
		asespadas.setNome("AS");
		
		baralho.add(asespadas);
	}
}

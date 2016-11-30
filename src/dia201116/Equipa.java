package dia201116;

public class Equipa {

	public Equipa(){
		
	}
	
	protected String nomeEquipa;
	protected int goloEquipa;
	protected int somagolosEquipa;
	
	public String getNomeEquipa(){
		return nomeEquipa; 
	}
	public int getGoloEquipa(){
		return goloEquipa;
	}
	
	public void setNomeEquipa(String nome){
		this.nomeEquipa=nome;
	}
	public void setGoloEquipa(int golo){
		this.goloEquipa=golo;
	}
	public void somaTodosGolos(int golo){
		somagolosEquipa+=this.goloEquipa=golo;
	}
}

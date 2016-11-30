package dia161116;

public class Carta {
	public int naipe;
	public String nome;
	public int pontuacao;
	
	public int getNaipe(){
		return naipe;
	}
	
	public String getNome(){
		return nome;
	}
	public int getPontuacao(){
		return pontuacao;
	}
	public void setPontuacao(int pontuacao){
		this.pontuacao = pontuacao;
	}
	public void setNaipe(int naipe){
		 this.naipe = naipe;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public Carta(){
		
	}
}

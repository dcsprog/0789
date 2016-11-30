package dia201116;

public class Despesas {
	public Despesas(){
		
	}
	
	public Despesas(String nome, int valor){
		this.nameDespesa=nome;
		this.valorMensal=valor;
	}
	
	protected String nameDespesa;
	protected int valorMensal;
	protected int totalDespesa;
	
	public String getNameDespesa(){
		return nameDespesa;
	}
	public int getValorMensal(){
		return valorMensal;
	} 
	
	public void setNameDespesa(String name){
		this.nameDespesa=name;
	}
	public void setValorMensal(int valor){
		this.valorMensal=valor;
	}
	
	public int calcularDesp(int valor){
		return valorMensal=valor*12;
	}
}

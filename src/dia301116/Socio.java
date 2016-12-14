package dia301116;

public class Socio extends Entidade{
	public Socio(int id, String nome, int nif, int niss, String contacto) {
		super(id, nome, nif, niss, contacto);
	}

	public Socio(){
		
	}
	

	private int nr_socio;

	public int getNr_socio() {
		return nr_socio;
	}

	public void setNr_socio(int nr_socio) {
		this.nr_socio = nr_socio;
	}
	
}

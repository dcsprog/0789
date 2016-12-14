package dia301116;

public class Utente extends Entidade{
	
	public Utente(int id, String nome, int nif, int niss, String contacto) {
		super(id, nome, nif, niss, contacto);
	}
	
	public Utente() {
		
	}
	private int nr_utente;
	private int nr_socio;
	public int getNr_utente() {
		return nr_utente;
	}
	public void setNr_utente(int nr_utente) {
		this.nr_utente = nr_utente;
	}
	public int getNr_socio() {
		return nr_socio;
	}
	public void setNr_socio(int nr_socio) {
		this.nr_socio = nr_socio;
	}

}

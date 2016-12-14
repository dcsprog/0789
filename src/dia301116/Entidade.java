package dia301116;

public class Entidade {
	//construtores
	
	public Entidade(int id, String nome, int nif, int niss, String contacto) {
		super();
		this.id = id;
		this.nome = nome;
		this.nif = nif;
		this.niss = niss;
		this.contacto = contacto;
	}
	
	//construtores
	
	public Entidade() {
		super();
	}
	
	private int id;
	private String nome;
	private int nif;
	private int niss;
	private String contacto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
	}
	public int getNiss() {
		return niss;
	}
	public void setNiss(int niss) {
		this.niss = niss;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

}

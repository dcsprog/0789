package dia301116;

public class Funcionario {
	public Funcionario(int nr_funcionario) {
		super();
		this.nr_funcionario = nr_funcionario;
	}

	public Funcionario() {
		super();
	}



	private int nr_funcionario;

	public int getNr_funcionario() {
		return nr_funcionario;
	}

	public void setNr_funcionario(int nr_funcionario) {
		this.nr_funcionario = nr_funcionario;
	}
}

package listaexercicio3;

public class Pessoa {

	private Contato contato;

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Pessoa(Contato contato) {
		super();
		this.contato = contato;
	}

	public Pessoa() {
		super();
	}
	
}

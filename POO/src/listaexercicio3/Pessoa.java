package listaexercicio3;

public class Pessoa {

	private Contato contato;
	private String nome;
	private int idade;
	private String sexo;
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Pessoa(Contato contato, String nome, int idade, String sexo) {
		super();
		this.contato = contato;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public Pessoa() {
		super();
	}
	
}

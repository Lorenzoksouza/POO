package listaexercicio32;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private String sexo;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Pessoa(String nome, int idade, String cpf, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

package listaexercicio3_corrigida;

public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private String sexo;
	private Endereco enderecoPessoa;
	
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
	public Endereco getEnderecoPessoa() {
		return enderecoPessoa;
	}
	public void setEnderecoPessoa(Endereco enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
	}
	
	public Pessoa(String nome, int idade, String cpf, String sexo, Endereco enderecoPessoa) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
		this.enderecoPessoa = enderecoPessoa;
	}
	
	public Pessoa() {
		super();
	}
	
}

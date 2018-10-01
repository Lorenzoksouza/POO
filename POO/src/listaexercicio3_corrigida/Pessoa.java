package listaexercicio3_corrigida;

public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private String sexo;
	private Endereco enderecoPessoa;
	private Contato contato;
	
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
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public Pessoa(String nome, int idade, String cpf, String sexo, Endereco enderecoPessoa, Contato contato) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
		this.enderecoPessoa = enderecoPessoa;
		this.contato = contato;
	}
	public Pessoa() {
		super();
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nSexo: " + sexo + "\nEndereco"
				+ enderecoPessoa + "\nContato: " + contato;
	}
	
}

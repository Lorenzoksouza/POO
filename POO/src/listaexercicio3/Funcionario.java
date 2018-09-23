package listaexercicio3;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String cpf;
	private String sexo;
	private Endereco enderecoFuncionario;
	private double salario;
	
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
	public Endereco getEnderecoFuncionario() {
		return enderecoFuncionario;
	}
	public void setEnderecoFuncionario(Endereco enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Funcionario(String nome, int idade, String cpf, String sexo, Endereco enderecoFuncionario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
		this.enderecoFuncionario = enderecoFuncionario;
		this.salario = salario
	}
	
	public Funcionario() {
		super();
	}
	@Override
	public String toString() {
		return "\n\nNome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nSexo: " + sexo + "\nEndere�o"
				+ enderecoFuncionario;
	}
}

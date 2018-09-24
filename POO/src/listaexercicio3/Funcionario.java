package listaexercicio3;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String cpf;
	private String sexo;
	private Endereco enderecoFuncionario;
	protected double Salario;
	
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
		return Salario;
	}
	public void setSalario(double Salario) {
		this.Salario = Salario;
	}
	
	public Funcionario(String nome, int idade, String cpf, String sexo, Endereco enderecoFuncionario, double Salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
		this.enderecoFuncionario = enderecoFuncionario;
		this.Salario = Salario;
	}
	
	public Funcionario() {
		super();
	}
	@Override
	public String toString() {
		return "\n\nNome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nSexo: " + sexo + "\nEndereço"
				+ enderecoFuncionario + "\nSalario: " + Salario;
	}
}

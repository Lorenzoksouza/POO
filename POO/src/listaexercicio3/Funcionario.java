package listaexercicio3;

public class Funcionario extends Pessoa{
	

	protected double Salario;
	
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double Salario) {
		this.Salario = Salario;
	}
	public Funcionario(Contato contato, String nome, int idade, String cpf, String sexo, Endereco enderecoPessoa,
			double salario) {
		super(contato, nome, idade, cpf, sexo, enderecoPessoa);
		Salario = salario;
	}
	public Funcionario() {
		super();
	}
	public Funcionario(Contato contato, String nome, int idade, String cpf, String sexo, Endereco enderecoPessoa) {
		super(contato, nome, idade, cpf, sexo, enderecoPessoa);
	}
	
	
}

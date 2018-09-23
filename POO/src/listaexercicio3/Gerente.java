package listaexercicio3;

public class Gerente extends Funcionario{
	
	@Override
	public double getSalario() {
		return super.getSalario() + super.getSalario() * 0.2;
	}

	public void setSalario(double Salario) {
		this.Salario = Salario;
	}

	public Gerente(String nome, int idade, String cpf, String sexo, Endereco enderecoFuncionario, double Salario,
			double Salario2) {
		super(nome, idade, cpf, sexo, enderecoFuncionario, Salario);
		Salario = Salario2;
	}

	public Gerente() {
		super();
	}

	public Gerente(String nome, int idade, String cpf, String sexo, Endereco enderecoFuncionario, double Salario) {
		super(nome, idade, cpf, sexo, enderecoFuncionario, Salario);
	}

	
}

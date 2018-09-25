package listaexercicio3;

public class Gerente extends Funcionario{
	
	@Override
	public double getSalario() {
		return Salario + Salario * 0.2;
	}

	public void setSalario(double Salario) {
		this.Salario = super.getSalario();
	}

	public Gerente() {
		super();
	}

	public Gerente(Contato contato, String nome, int idade, String cpf, String sexo, Endereco enderecoFuncionario,
			double salario) {
		super(contato, nome, idade, cpf, sexo, enderecoFuncionario, salario);
	}

	public Gerente(Contato contato, String nome, int idade, String cpf, String sexo, Endereco enderecoFuncionario) {
		super(contato, nome, idade, cpf, sexo, enderecoFuncionario);
	}

	
	
	
	
	
	
	


	
}

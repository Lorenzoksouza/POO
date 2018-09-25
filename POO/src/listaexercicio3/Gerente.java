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

	public Gerente(Contato contato, String nome, int idade, String cpf, String sexo, Endereco enderecoPessoa,
			double salario) {
		super(contato, nome, idade, cpf, sexo, enderecoPessoa, salario);
	}

	public Gerente(Contato contato, String nome, int idade, String cpf, String sexo, Endereco enderecoPessoa) {
		super(contato, nome, idade, cpf, sexo, enderecoPessoa);
	}

	
	
	
	
	
	
	


	
}

package listaexercicio3_corrigida;

public class Funcionario extends Pessoa{
	
	private double salario;
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Funcionario(String nome, int idade, String cpf, String sexo, Endereco enderecoPessoa, Contato contato,
			double salario) {
		super(nome, idade, cpf, sexo, enderecoPessoa, contato);
		this.salario = salario;
	}

	public Funcionario() {
		super();
	}

	public double calculaImpostoFuncionario() {
		return this.getSalario() * 0.90;
	}

	public double calculasalarioBrutoFuncionario() {
		return this.getSalario();
	}

	
}

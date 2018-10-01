package listaexercicio3_corrigida;

public class Gerente  extends Pessoa{

	private double salario;
	

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Gerente(String nome, int idade, String cpf, String sexo, Endereco enderecoPessoa, Contato contato,
			double salario) {
		super(nome, idade, cpf, sexo, enderecoPessoa, contato);
		this.salario = salario;
	}
	
	public Gerente() {
		super();
	}
	
	public double calculaComissao() {
		return this.getSalario() * 0.20;
	}
	public double calculaImpostoGerente() {
		return this.getSalario() + this.calculaComissao() * 0.90;
	}
	public double calculaSalarioBrutoGerente() {
		return this.getSalario() + this.calculaComissao();
	}
	public void calculaSalarioLiquidoGerente() {
		double salarioBruto = + this.calculaSalarioBrutoGerente();
		double INSS = salarioBruto * 0.10;
		double IR = 0;
		if ((salarioBruto - INSS) > 2000) {
			IR = (salarioBruto - INSS) * 0.15;
		}
		double salarioLiquido = salarioBruto - INSS - IR;
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("INSS: " + INSS);
		System.out.println("IR: " + IR);
		System.out.println("Salário Liquido: " + salarioLiquido);
	}
}

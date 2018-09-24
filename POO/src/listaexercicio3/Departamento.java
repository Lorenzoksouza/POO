package listaexercicio3;

public class Departamento {

	private Funcionario[] funcionario;
	private String area;
	private double meta;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Funcionario[] getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}
	public double getMeta() {
		return meta;
	}
	public void setMeta(double meta) {
		this.meta = meta;
	}
	public Departamento(Funcionario[] funcionario, String area, double meta) {
		super();
		this.funcionario = funcionario;
		this.area = area;
		this.meta = meta;
	}

	public Departamento() {
		super();
	}
	public void identificarMaisNovaEMaisVelhaPorDepartamento() {
		Funcionario maisNova = new Funcionario();
		Funcionario maisVelha = new Funcionario();
		int menorIdade = this.getFuncionario()[0].getIdade();
		for (int j = 0; j < this.getFuncionario().length; j++) {
			if (this.getFuncionario()[j].getIdade() <= menorIdade) {
				menorIdade = this.getFuncionario()[j].getIdade();
				maisNova = this.getFuncionario()[j];
			}
		}
		int maiorIdade = 0;
		for (int j = 0; j < this.getFuncionario().length; j++) {
			if (this.getFuncionario()[j].getIdade() >= maiorIdade) {
				maiorIdade = this.getFuncionario()[j].getIdade();
				maisVelha = this.getFuncionario()[j];
		}
	}
		
		System.out.println("\nPessoa mais nova do departamento " + this.getArea() + maisNova);
		System.out.println("\nPessoa mais velha do departamento " + this.getArea() + maisVelha);		
	}
	public void contarPessoasPorSexo() {
		
	}
}
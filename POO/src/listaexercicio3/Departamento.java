package listaexercicio3;

public class Departamento {

	private Gerente[] gerente;
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
	public Gerente[] getGerente() {
		return gerente;
	}
	public void setGerente(Gerente[] gerente) {
		this.gerente = gerente;
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
		int homem = 0;
		int mulher = 0;
		for (int j = 0; j < this.getFuncionario().length; j++) {
			if (this.getFuncionario()[j].getSexo() == "M") {
				homem = homem + 1;
			}else {
				mulher = mulher + 1;
			}
		}
		System.out.println("\nTotal de homens no departamento " + this.getArea() + ": " + homem);
		System.out.println("Total de mulheres no departamento " + this.getArea() + ": " + mulher);	
	}

		
		
		
		
		
	
}
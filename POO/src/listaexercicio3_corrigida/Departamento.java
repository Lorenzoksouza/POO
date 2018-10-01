package listaexercicio3_corrigida;

public class Departamento {

	private String area;
	private Funcionario[] funcionarios;
	private Gerente gerente;
 	private double meta;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	public double getMeta() {
		return meta;
	}
	public void setMeta(double meta) {
		this.meta = meta;
	}
	
	public Departamento() {
		super();
	}
	
	public Departamento(String area, Funcionario[] funcionarios, Gerente gerente, double meta) {
		super();
		this.area = area;
		this.funcionarios = funcionarios;
		this.gerente = gerente;
		this.meta = meta;
	}
	public int calcularIdadesDepartamentos() {
		int idades = this.getGerente().getIdade();
		for(int i = 0; i < this.getFuncionarios().length; i++) {
			idades = idades + this.getFuncionarios()[i].getIdade();
		}
		return idades;
	}
	public Pessoa identificarMaisNova() {
		
		Pessoa maisNova = this.getGerente();
		
		for(int i = 0; i < this.getFuncionarios().length; i++) {
			if(this.getFuncionarios()[i].getIdade() < maisNova.getIdade()) {
				maisNova = this.getFuncionarios()[i];
			}
		}
		return maisNova;
	}
	public Pessoa identificarMaisVelha() {
		
		Pessoa maisVelha = this.getGerente();
		
		for(int i = 0; i < this.getFuncionarios().length; i++) {
			if(this.getFuncionarios()[i].getIdade() > maisVelha.getIdade()) {
				maisVelha = this.getFuncionarios()[i];
			}
		}
		return maisVelha;
	}
	public int quantificarHomens() {
		int qtdHomens = 0;
		if(this.getGerente().getSexo().equalsIgnoreCase("M")) {
			qtdHomens++;
		}
		for(int i = 1; i < this.getFuncionarios().length; i++) {
			if(this.getFuncionarios()[i].getSexo().equalsIgnoreCase("M")) {
				qtdHomens++;
			}
		}
		
		return qtdHomens;
	}
	public int quantificarMulheres() {
		
		int qtdMulheres = 0;
		if(this.getGerente().getSexo().equalsIgnoreCase("F")) {
			qtdMulheres++;
		}
		for(int i = 1; i < this.getFuncionarios().length; i++) {
			if(this.getFuncionarios()[i].getSexo().equalsIgnoreCase("F")) {
				qtdMulheres++;
			}
		}
		
		return qtdMulheres;
	}
	public void localizarPessoasPorCidadePorDepartamento(String cidade) {
		if(this.getGerente().getEnderecoPessoa().getCidade().equalsIgnoreCase(cidade)) {
			System.out.println(this.getGerente());
		for(int i = 0; i < this.getFuncionarios().length; i++) {
			if(this.getFuncionarios()[i].getEnderecoPessoa().getCidade().equalsIgnoreCase(cidade)) {
				System.out.println(this.getFuncionarios()[i]);
				}
			}
		}
	}
	public double calculaImpostosPorDepartamento() {
		double impostos = this.getGerente().calculaImpostoGerente();
		for(int i = 0; i < this.getFuncionarios().length; i++) {
			impostos += this.getFuncionarios()[i].calculaImpostoFuncionario();
		}
		return impostos;
	}
	public double calculaSalarioBrutoPorDepartamento() {
		double salarioBruto = this.getGerente().calculasalarioBrutoGerente();
		for(int i = 0; i < this.getFuncionarios().length; i++) {
			salarioBruto += this.getFuncionarios()[i].calculasalarioBrutoFuncionario();
		}
		return salarioBruto;
	}
	public void calculaSalarioBrutoIndividualDepartamento() {
		System.out.println("Salario bruto de gerente:" + this.getGerente().getNome() + " é de " + this.getGerente().calculasalarioBrutoGerente());
		for(int i = 0; i < this.getFuncionarios().length; i++) {
			System.out.println("Salario bruto de funcionario:" + this.getFuncionarios()[i].getNome() + " é de " + this.getFuncionarios()[i].calculasalarioBrutoFuncionario());
		}
	}
}

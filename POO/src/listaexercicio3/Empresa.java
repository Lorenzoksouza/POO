package listaexercicio3;

public class Empresa {
	private String nome;
	private String cnpj;
	private String site;
	private Departamento[] Departamentos;
	private Endereco enderecoEmpresa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Departamento[] getDepartamentos() {
		return Departamentos;
	}
	public void setDepartamentos(Departamento[] departamentos) {
		Departamentos = departamentos;
	}
	public Endereco getEnderecoEmpresa() {
		return enderecoEmpresa;
	}
	public void setEnderecoEmpresa(Endereco enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}
	
	
	public Empresa(String nome, String cnpj, String site, Departamento[] departamentos, Endereco enderecoEmpresa) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.site = site;
		Departamentos = departamentos;
		this.enderecoEmpresa = enderecoEmpresa;
	}
	
	public Empresa() {
		super();
	}
	public void somarPessoasEmpresa() {
		int totalIdade = 0;
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			int idade = 0;
			for(int j = 0; j < this.getDepartamentos()[i].getFuncionario().length; j++) {
				idade = idade + this.getDepartamentos()[i].getFuncionario()[j].getIdade();
			}
			totalIdade = totalIdade + idade;
			System.out.println("\nDepartamento " + this.getDepartamentos()[i].getArea());
			System.out.println("Soma das idades do departamento: " + idade);
		}
		System.out.println("\nEmpresa " + this.getNome());
		System.out.println("Soma de idades da empresa: " + totalIdade);
		
	}
	public void identificarMaisNovaEMaisVelhaPorDepartamento() {
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			this.getDepartamentos()[i].identificarMaisNovaEMaisVelhaPorDepartamento();
		}
	}
	public void identificarMaisNovaEMaisVelhaEmpresa() {
		Funcionario maisNova = new Funcionario();
		Funcionario maisVelha = new Funcionario();
		int menorIdade = 1000;
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			for (int j = 0; j < this.getDepartamentos()[i].getFuncionario().length; j++) {
				if (this.getDepartamentos()[i].getFuncionario()[j].getIdade() <= menorIdade) {
					menorIdade = this.getDepartamentos()[i].getFuncionario()[j].getIdade();
					maisNova = this.getDepartamentos()[i].getFuncionario()[j];
					}
				}
			}
		int maiorIdade = 0;
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			for (int j = 0; j < this.getDepartamentos()[i].getFuncionario().length; j++) {
				if (this.getDepartamentos()[i].getFuncionario()[j].getIdade() >= maiorIdade) {
					maiorIdade = this.getDepartamentos()[i].getFuncionario()[j].getIdade();
					maisVelha = this.getDepartamentos()[i].getFuncionario()[j];
					}
				}
			}
			
			System.out.println("\nA pessoa mais nova da empresa" + maisNova);
			System.out.println("\nA pessoa mais velha da empresa" + maisVelha);
	}
	public void contarPessoasPorSexo() {
		int homem = 0;
		int mulher = 0;
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			this.getDepartamentos()[i].contarPessoasPorSexo();
		}
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			for (int j = 0; j < this.getDepartamentos()[i].getFuncionario().length; j++) {
				if (this.getDepartamentos()[i].getFuncionario()[j].getSexo() == "M") {
					homem = homem + 1;
				}else {
					mulher = mulher + 1;
				}
			}
		}
		System.out.println("\nTotal de homens na empresa: " + homem);
		System.out.println("Total de mulheres na empresa: " + mulher);	
	}
	public void identificarPessoaPorCidade(String cidade) {
		System.out.println("\nMoradores de " + cidade);
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			for (int j = 0; j < this.getDepartamentos()[i].getFuncionario().length; j++) {
				if (this.getDepartamentos()[i].getFuncionario()[j].getEnderecoPessoa().getCidade() == cidade) {
					System.out.println("\n" + this.getDepartamentos()[i].getFuncionario()[j].getNome());
					System.out.println(this.getDepartamentos()[i].getFuncionario()[j].getEnderecoPessoa());
				}
			}
		}
	}
	public void calcularImpostoEmpresa() {
		double impostosEmpresa = 0;
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			for (int j = 0; j < this.getDepartamentos()[i].getFuncionario().length; j++) {
				impostosEmpresa = impostosEmpresa + (this.getDepartamentos()[i].getFuncionario()[j].getSalario() * 0.9);
			}
		}
		System.out.println("\nTotal de imposto pagos pela empresa: " + impostosEmpresa);
	}
	public void calcularSalarioTotal() {
		double salarioTotalEmpresa = 0;
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			for (int j = 0; j < this.getDepartamentos()[i].getFuncionario().length; j++) {
				salarioTotalEmpresa = salarioTotalEmpresa + this.getDepartamentos()[i].getFuncionario()[j].getSalario();
			}
		}
		System.out.println("\nTotal de salarios a ser pago: " + salarioTotalEmpresa);
	}
	public void totalizarMetas() {
		double metaTotal = 0;
		for (int i = 0; i < this.getDepartamentos().length; i++) {
			metaTotal = metaTotal + this.getDepartamentos()[i].getMeta();
			}
		System.out.println("\nSomatorio das metas dos departamentos: " + metaTotal);
		
		
	}	
}

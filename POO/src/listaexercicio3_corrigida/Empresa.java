package listaexercicio3_corrigida;

public class Empresa {

	private String nome;
	private String cnpj;
	private String site;
	private Departamento[] departamentos;
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
		return departamentos;
	}
	public void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
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
		this.departamentos = departamentos;
		this.enderecoEmpresa = enderecoEmpresa;
	}
	
	public Empresa() {
		super();
	}
	
	public void calcularIdades() {
		int idadesTotal = 0;
		for( int i = 0; i < this.getDepartamentos().length;i++) {
			int idades = this.getDepartamentos()[i].calcularIdadesDepartamentos();
			idadesTotal = idadesTotal + idades;
			System.out.println("Departamento: " + this.getDepartamentos()[i].getArea());
			System.out.println("Total idades departamento: " + idades);
		}
		System.out.println("\nTotal de idade na empresa: " + idadesTotal);
	}
	public void identificarPessoaMaisNovaMaisVelhaPorDepartamento() {
		for(int i = 0; i < this.getDepartamentos().length; i++) {
			System.out.println("\n************************************************");
			System.out.println("\nDepartamento: " + this.getDepartamentos()[i].getArea());
			System.out.println("\nMais Nova: " + this.getDepartamentos()[i].identificarMaisNova());
			System.out.println("\nMais Velha: " + this.getDepartamentos()[i].identificarMaisVelha());
			System.out.println("\n************************************************");

		}
		
	}
	public void identificarPessoaMaisNovaMaisVelha() {
		Pessoa maisNova = this.getDepartamentos()[0].identificarMaisNova();
		Pessoa maisVelha = this.getDepartamentos()[0].identificarMaisVelha();
		
		for(int i = 0; i < this.getDepartamentos().length; i++) {
			if(this.getDepartamentos()[i].identificarMaisNova().getIdade() < maisNova.getIdade()) {
				maisNova = this.getDepartamentos()[i].identificarMaisNova();
			}
			if(this.getDepartamentos()[i].identificarMaisNova().getIdade() > maisVelha.getIdade()) {
				maisVelha = this.getDepartamentos()[i].identificarMaisVelha();
			}
		}
		
		System.out.println("\n************************************************");
		System.out.println("\nMais Nova Empresa: " + maisNova);
		System.out.println("\nMais Velha Empresa: " + maisVelha);
		System.out.println("\n************************************************");
		
	}
	public void quantidadeHomensMulheresPorDepartamento() {
		for(int i = 0; i < this.getDepartamentos().length; i++) {
			System.out.println("\n************************************************");
			System.out.println("\nDepartamento: " + this.getDepartamentos()[i].getArea());
			System.out.println("\nTotal de Homens: " + this.getDepartamentos()[i].quantificarHomens());
			System.out.println("\nTotal de Mulheres: " + this.getDepartamentos()[i].quantificarMulheres());
			System.out.println("\n************************************************");

		}
		
	}
	public void quantidadeHomensMulheres() {
		int totalHomens = 0;
		int totalMulheres = 0;
		
		for(int i = 0; i < this.getDepartamentos().length; i++) {
			totalHomens += this.getDepartamentos()[0].quantificarHomens();
			totalMulheres += this.getDepartamentos()[0].quantificarMulheres();
		}
		
		System.out.println("\n************************************************");
		System.out.println("\nQuantidade de Homens na Empresa: " + totalHomens);
		System.out.println("\nQuantidade de Mulheres na Empresa: " + totalMulheres);
		System.out.println("\n************************************************");
		
		
	}
	public void localizarPessoasPorCidade(String cidade) {
		System.out.println("\n************************************************");
		System.out.println("\nMoradores de " + cidade);
		for(int i = 0; i < this.getDepartamentos().length; i++) {
			this.getDepartamentos()[i].localizarPessoasPorCidadePorDepartamento(cidade);
		}
	}
	public void calculaImposto() {
		double totalImpostos = 0;
		for(int i = 0; i < this.getDepartamentos().length ; i++) {
			totalImpostos += this.getDepartamentos()[i].calculaImpostosPorDepartamento();
		}
		System.out.println("Total de Impostos: " + totalImpostos);
	}
	public void calculaSalarioBruto() {
		double totalSalarioBruto = 0;
		for(int i = 0; i < this.getDepartamentos().length ; i++) {
			totalSalarioBruto += this.getDepartamentos()[i].calculaSalarioBrutoPorDepartamento();
		}	
		System.out.println("Total de Impostos: " + totalSalarioBruto);
	}
	public void calculaSalarioBrutoIndividual() {
		for(int i = 0; i < this.getDepartamentos().length ; i++) {
			this.getDepartamentos()[i].calculaSalarioBrutoIndividualDepartamento();
		}	
	}
	
}

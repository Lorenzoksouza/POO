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
		System.out.println("\nTotal de idade na empresa: " + idadesTtal);
	}
}

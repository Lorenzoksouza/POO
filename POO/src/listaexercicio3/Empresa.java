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
}

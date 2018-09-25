package listaexercicio32;

public class Empresa {

	private String nome;
	private String cnpj;
	private String site;
	
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
	
	public Empresa(String nome, String cnpj, String site) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.site = site;
	}
	
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

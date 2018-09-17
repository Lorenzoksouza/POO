package associacao;

public class Documento {

	private String cpf;
	private String rg;
	
	public Documento(String cpf, String rg) {
		super();
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public Documento() {
		super();
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
}

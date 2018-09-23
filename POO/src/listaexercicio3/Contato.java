package listaexercicio3;

public class Contato {
	
	private String Telefone;
	private String Celular;
	private String Email;
	
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public Contato(String telefone, String celular, String email) {
		super();
		Telefone = telefone;
		Celular = celular;
		Email = email;
	}
	
	public Contato() {
		super();
	}
	
	
	
	
	
}

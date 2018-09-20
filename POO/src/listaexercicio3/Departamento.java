package listaexercicio3;

public class Departamento {

	private Pessoa[] pessoas;
	private String area;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Pessoa[] getPessoas() {
		return pessoas;
	}
	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

	public Departamento(Pessoa[] pessoas, String area) {
		super();
		this.pessoas = pessoas;
		this.area = area;
	}

	public Departamento() {
		super();
	}
	
}

package listaexercicio32;

public class Departamento {

	private String area;
	private Pessoa[] funcionario;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Pessoa[] getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Pessoa[] funcionario) {
		this.funcionario = funcionario;
	}
	
	public Departamento(String area, Pessoa[] funcionario) {
		super();
		this.area = area;
		this.funcionario = funcionario;
	}


	public Departamento() {
		super();
	}

	
}

package listaexercicio3;

public class Departamento {

	private Funcionario[] funcionario;
	private String area;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Funcionario[] getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}

	public Departamento(Funcionario[] funcionario, String area) {
		super();
		this.funcionario = funcionario;
		this.area = area;
	}

	public Departamento() {
		super();
	}
	
}

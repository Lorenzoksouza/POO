package listaexercicio3;

public class Departamento {

	private Funcionario[] funcionario;
	private String area;
	private double meta;
	
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
	public double getMeta() {
		return meta;
	}
	public void setMeta(double meta) {
		this.meta = meta;
	}
	public Departamento(Funcionario[] funcionario, String area, double meta) {
		super();
		this.funcionario = funcionario;
		this.area = area;
		this.meta = meta;
	}

	public Departamento() {
		super();
	}
	
}

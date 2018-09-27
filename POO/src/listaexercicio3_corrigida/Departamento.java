package listaexercicio3_corrigida;

public class Departamento {

	private String area;
	private Pessoa[] pessoas;
	private double meta;
	
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
	public double getMeta() {
		return meta;
	}
	public void setMeta(double meta) {
		this.meta = meta;
	}
	
	public Departamento(String area, Pessoa[] pessoas, double meta) {
		super();
		this.area = area;
		this.pessoas = pessoas;
		this.meta = meta;
	}
	
	public Departamento() {
		super();
	}
	public int calcularIdadesDepartamentos() {
		int idades = 0;
		for(int i = 0;i < this.getPessoas().length; i++) {
			idades = idades + this.getPessoas()[i].getIdade();
		}
		return 0;
	}
	
	
	
	
}

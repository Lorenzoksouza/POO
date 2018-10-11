package listaexercicio4;

public class Quadrado extends FormasGeometricas{
	
	private double lado;
	private String nome;
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Quadrado(double lado, String nome) {
		super();
		this.lado = lado;
		this.nome = nome;
	}
	
	public Quadrado() {
		super();
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nLado: " + lado + "\nArea: " + this.calcularArea() + "\nPerimetro:  " + this.calcularPerimetro();
	}
	@Override
	public double calcularArea() {
		double area = 0;
		area = lado * lado;
		return area;
	}
	@Override
	public double calcularPerimetro() {
		double perimetro = 0;
		perimetro = lado * 4;
		return perimetro;
	}
}

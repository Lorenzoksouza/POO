package listaexercicio4;

public class TrianguloEquilatero extends Triangulo{

	private double lado;
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public TrianguloEquilatero(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}
	
	public TrianguloEquilatero() {
		super();
	}
	
	@Override
	public String toString() {
		return "\nTriangulo Equilatero" + "\nLado: " + lado + "\nArea: " + this.calcularArea() + "\nPerimetro:  " + this.calcularPerimetro();
		}
	public double calcularArea() {
		double area = 0;
		area = lado * lado / 4 * Math.sqrt(3);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = 0;
		perimetro = lado * 3;
		return perimetro;
		}
}

package formas;

public class Retangulo extends FormasGeometricas{

	private double ladoA;
	private double ladoB;
	private String nome;
	
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Retangulo(double ladoA, double ladoB, String nome) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.nome = nome;
	}
	
	public Retangulo() {
		super();
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nLado A: " + ladoA + "\nLado B: " + ladoB;
	}
	public double calcularArea() {
		double area = 0;
		area = ladoA * ladoB;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = 0;
		perimetro = (ladoA + ladoB) * 2;
		return perimetro;
	}
}

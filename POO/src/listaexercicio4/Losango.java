package listaexercicio4;

public class Losango extends FormasGeometricas{

	private double diagonalA;
	private double diagonalB;
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
	
	public Losango(double diagonalA, double diagonalB,double ladoA, double ladoB, String nome) {
		super();
		this.diagonalA = diagonalA;
		this.diagonalB = diagonalB;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.nome = nome;
	}
	
	public Losango() {
		super();
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nLado A: " + ladoA + "\nLado B: " + ladoB + "\nArea: " + this.calcularArea() + "\nPerimetro:  " + this.calcularPerimetro();
	}
	public double calcularArea() {
		double area = 0;
		area = diagonalA * diagonalB / 2;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = 0;
		perimetro = (ladoA + ladoB) * 2;
		return perimetro;
		}
}

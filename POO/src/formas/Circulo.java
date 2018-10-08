package formas;

public class Circulo extends FormasGeometricas{

	private double raio;
	private String nome;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Circulo(double raio, String nome) {
		super();
		this.raio = raio;
		this.nome = nome;
	}
	
	public Circulo() {
		super();
	}
	
	@Override
	public String toString() {
		return  "\nNome: " + nome + "\nRaio: " + raio;
	}
	public double calcularArea() {
		double area = 0;
		area = 3.1415 * (raio * raio);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = 0;
		perimetro = 2 * 3.1415 * raio;
		return perimetro;
	}
}

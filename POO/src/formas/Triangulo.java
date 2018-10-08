package formas;

public abstract class Triangulo extends FormasGeometricas{

	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Triangulo(String nome) {
		super();
		this.nome = nome;
	}
	public Triangulo() {
		super();
	}
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
}

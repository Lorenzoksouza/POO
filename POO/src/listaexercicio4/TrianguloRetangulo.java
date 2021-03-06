package listaexercicio4;

public class TrianguloRetangulo extends Triangulo{

	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public TrianguloRetangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}
	
	public TrianguloRetangulo() {
		super();
	}

	@Override
	public String toString() {
		return "Triangulo Retangulo base=" + base + ", altura=" + altura + "]";
	}
	public double calcularArea() {
		double area = 0;
		area = base * altura / 2;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = 0;
		perimetro = base + altura + Math.hypot(base, altura);
		return perimetro;
		}
}

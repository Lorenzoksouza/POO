package formas;

public class TrianguloIsosceles extends Triangulo{

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
	
	public TrianguloIsosceles(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}
	
	public TrianguloIsosceles() {
		super();
	}
	
	@Override
	public String toString() {
		return "TrianguloIsosceles [base=" + base + ", altura=" + altura + "]";
	}
	public double calcularArea() {
		double area = 0;
		area = base * altura / 2;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = 0;
		double lado3 = (base/2) * (base/2) + (altura*altura);
		perimetro = base + lado3 *2;
		return perimetro;
		}
}

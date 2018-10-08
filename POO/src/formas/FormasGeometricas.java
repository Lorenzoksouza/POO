package formas;

public abstract class FormasGeometricas {

	private Circulo circulo;
	private Quadrado quadrado;
	private Retangulo retangulo;
	private Losango losango;
	private Triangulo triangulo;
//	private TrianguloRetangulo trianguloRetangulo;
//	private TrianguloEquilatero trianguloEquilatero;
//	private TrianguloIsosceles trianguloIsosceles;
	
	public Circulo getCirculo() {
		return circulo;
	}
	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}
	public Quadrado getQuadrado() {
		return quadrado;
	}
	public void setQuadrado(Quadrado quadrado) {
		this.quadrado = quadrado;
	}
	public Retangulo getRetangulo() {
		return retangulo;
	}
	public void setRetangulo(Retangulo retangulo) {
		this.retangulo = retangulo;
	}
	public Losango getLosango() {
		return losango;
	}
	public void setLosango(Losango losango) {
		this.losango = losango;
	}
	public Triangulo getTriangulo() {
		return triangulo;
	}
	public void setTriangulo(Triangulo triangulo) {
		this.triangulo = triangulo;
	}
	public FormasGeometricas(Circulo circulo, Quadrado quadrado, Retangulo retangulo, Losango losango,
			Triangulo triangulo) {
		super();
		this.circulo = circulo;
		this.quadrado = quadrado;
		this.retangulo = retangulo;
		this.losango = losango;
		this.triangulo = triangulo;
	}
	public FormasGeometricas() {
		super();
	}
	
	

}

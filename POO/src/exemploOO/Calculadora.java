package exemploOO;

public class Calculadora {

	public double somar(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		return resultado;
	}
	public double subtrair(double minuendo, double subtraendo) {
		double resultado = minuendo - subtraendo;
		return resultado;
	}
	public double multiplicar(double multiplicando, double multiplicador) {
		double resultado = multiplicando * multiplicador;
		return resultado;
	}
	public double dividir(double dividendo, double divisor) {
		double resultado = dividendo / divisor;
		return resultado;
	}
}
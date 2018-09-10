package exemploOO;

public class Calculadora {

	public double somar(double parcela1, double parcela2) {
		double resultado = parcela1 + parcela2;
		return resultado;
	}
	
	public int somar(int parcela1, int parcela2) {
		int resultado = parcela1 + parcela2;
		return resultado;
	}
	
	public double somar(Double[] valores) {
		double resultado = 0;
		for (int i = 0; i < valores.length; i++) {
			resultado = resultado + valores[i];
		}
		return resultado;
	}
	
	public double subtrair(double minuendo, double subtraendo) {
		double resultado = minuendo - subtraendo;
		return resultado;
	}
	public int subtrair(int parcela1, int parcela2) {
		int resultado = parcela1 - parcela2;
		return resultado;
	}
	
	public double subtrair(Double[] valores) {
		double resultado = 0;
		for (int i = 0; i < valores.length; i++) {
			resultado = resultado - valores[i];
		}
		return resultado;
	}
	public double multiplicar(double multiplicando, double multiplicador) {
		double resultado = multiplicando * multiplicador;
		return resultado;
	}
	public int multiplicar(int parcela1, int parcela2) {
		int resultado = parcela1 * parcela2;
		return resultado;
	}
	
	public double multiplicar(Double[] valores) {
		double resultado = 0;
		for (int i = 0; i < valores.length; i++) {
			resultado = resultado * valores[i];
		}
		return resultado;
	}
	public double dividir(double dividendo, double divisor) {
		double resultado = dividendo / divisor;
		return resultado;
	}
	public int dividir(int parcela1, int parcela2) {
		int resultado = parcela1 / parcela2;
		return resultado;
	}
	
	public double dividir(Double[] valores) {
		double resultado = 0;
		for (int i = 0; i < valores.length; i++) {
			resultado = resultado / valores[i];
		}
		return resultado;
	}
}
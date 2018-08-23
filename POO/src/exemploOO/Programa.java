package exemploOO;

public class Programa {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		double valor1 = 8;
		double valor2 =	4;
		double resultado;
		resultado = calculadora.somar(valor1, valor2);	
		System.out.println("Soma: " + resultado);
		resultado = calculadora.subtrair(valor1, valor2);
		System.out.println("Subtração: "+ resultado);
		resultado = calculadora.multiplicar(valor1, valor2);
		System.out.println("Multiplicar: "+ resultado);
		resultado = calculadora.dividir(valor1, valor2);			
		System.out.println("Dividir: "+ resultado);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
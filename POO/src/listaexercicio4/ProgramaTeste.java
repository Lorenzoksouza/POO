package listaexercicio4;

import java.util.Random;

public class ProgramaTeste {
	
	public static void main(String[] args) {
		
		Random random = new Random();

		FormasGeometricas[] formas = new FormasGeometricas[7];
		
		for (int i = 0; i < formas.length; i++) {
				switch (random.nextInt(4)) {
				case 0:
					Circulo c1 = new Circulo(random.nextInt(10)+1, " Circulo");
					formas[i] = c1;
					break;
				case 1:
					Quadrado q1 = new Quadrado(random.nextInt(10)+1, " Quadrado");
					formas[i] = q1;
					break;
				case 2:
					Retangulo r1 = new Retangulo(random.nextInt(10)+1,random.nextInt(10)+1, " Retangulo");
					formas[i] = r1;
					break;
				case 3:
					Losango l1 = new Losango(random.nextInt(10)+1,random.nextInt(10)+1,random.nextInt(10)+1,random.nextInt(10)+1, " Losango");
					formas[i] = l1;
					break;
				}
		}
		for (int i = 0; i < formas.length; i++) {
			System.out.println("\n" + formas[i]);
		}
		
		
	}
}

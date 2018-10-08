package formas;

import java.util.Random;

public class ProgramaTeste {
	
	public static void main(String[] args) {
		
		Random random = new Random();

		FormasGeometricas[] formas = new FormasGeometricas[7];
		
		for (int i = 0; i < formas.length; i++) {
				switch (random.nextInt(4)+1) {
				case 1:
					Circulo c1 = new Circulo(random.nextInt(10), " Circulo");
					formas[i] = c1;
					break;
				case 2:
					Quadrado q1 = new Quadrado(random.nextInt(10), " Quadrado");
					formas[i] = q1;
					break;
				case 3:
					Retangulo r1 = new Retangulo(random.nextInt(10),random.nextInt(10), " Retangulo");
					formas[i] = r1;
					break;
				case 4:
					Losango l1 = new Losango(random.nextInt(10),random.nextInt(10), " Losango");
					formas[i] = l1;
					break;
				}
		}
		for (int i = 0; i < formas.length; i++) {
			System.out.println("\n" + formas[i]);
		}
		
		
		
		
	}
}

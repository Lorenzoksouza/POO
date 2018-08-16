package listaexercicio1;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {

		Random random = new Random(); 
		int[] numeros = new int[8];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100);	
		}
		int[] multi = new int[8];
		for (int i = 0; i < multi.length; i++) {
			multi[i] = numeros[i] * 5;
		}
		for (int i = 0; i < 8; i++) {
			System.out.println(numeros[i] + " * 5 = " + multi[i]);
		}
	}
}

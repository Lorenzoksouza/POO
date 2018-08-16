package listaexercicio1;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {

		Random random = new Random(); 
		int[] numero = new int[10];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = random.nextInt(6) + 1;	
		}
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Número sorteado: " + numero[i]);
		}
	}
}

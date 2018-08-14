package exemplos;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int numero = gerador.nextInt(9) +1;
		int valorDigitado = 0;
		for (int i = 0;i < 5; i++) {
			System.out.print("Digite um número de 1 a 9: ");
			valorDigitado = teclado.nextInt();
			if (numero==valorDigitado) {
				System.out.println("Boa, você é o bichão mesmo hem");
				break;
			}else {
				if(i<4) {
					System.out.println("Não foi dessa vez, tenta de novo");
				}else {
					System.out.println("LOSER!!! HaHaHa");
				}
			}
		}
	}
}
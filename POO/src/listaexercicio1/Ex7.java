package listaexercicio1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = tec.nextLine();
		String[] split = frase.split(" ");
		for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
		}
	}
}

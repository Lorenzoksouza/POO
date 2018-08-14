package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex3_Sobremesa {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String[] fruta = new String[6];
		System.out.println("Digite seis coisas para fazer uma sobremesa:");
		for (int i = 0; i < fruta.length; i++) {
		fruta[i] = tec.nextLine();	
	}
		Random random = new Random();
	for(int i = 0; i < 3; i++) {
		int num1 = random.nextInt(6);
		int num2 = random.nextInt(6);
		int num3 = random.nextInt(6);
		 System.out.println("Sobremesa: " + fruta[num1] + "," + fruta[num2] + "," + fruta[num3]);
		}
	}
}




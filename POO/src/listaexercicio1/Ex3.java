package listaexercicio1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite 10 numeros de 1 a 9: ");
		int[] num = new int[10];
		int media = 0;
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			num[i] = tec.nextInt();
			while(num[i] < 1 || num[i] > 9) {
				System.out.print("Numero fora da faixa, digite novamente: ");
				num[i] = tec.nextInt();
			}
			soma = soma + num[i];
			media = soma/10; 
		}
		System.out.println("A media dos numeros é " + media);
	}
}

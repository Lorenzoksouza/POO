package listaexercicio1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String[] nome = new String[10];
		int[] idade = new int[10];
		int soma = 0;
		
		
		
		for (int i = 0; i < 10; i++) {
		System.out.print("Digite nome: ");
			nome[i] = tec.next();
		System.out.print("Digite idade: ");
			idade[i] = tec.nextInt();
			soma = soma + idade[i];
		}
		
		
		
		
		int posicaoMaior = 0;
		int maiorIdade = 0;
		for (int i = 0; i < 10; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaior = i;
			}
		}
		int posicaoMenor = 0;
		int menorIdade = 1000;
		for (int i = 0; i < 10; i++) {
			if (idade[i] < menorIdade) {
				menorIdade = idade[i];
				posicaoMenor = i;
			}
		}
		System.out.println("A pessoa de maior idade é " + nome[posicaoMaior] + " sua idade é " + idade[posicaoMaior]);
		System.out.println("A pessoa de menor idade é " + nome[posicaoMenor] + " sua idade é " + idade[posicaoMenor]);
		double media = soma/10;
		System.out.println("A média das idades é: " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

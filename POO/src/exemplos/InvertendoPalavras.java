package exemplos;

import java.util.Scanner;

public class InvertendoPalavras {

	public static void main(String[] args) {

	Scanner tec = new Scanner(System.in);
	System.out.print("Digite uma palavra: ");
	String palavra = tec.next();
	
	for(int i = palavra.length() - 1; i >= 0; i--) {
		System.out.print(palavra.charAt(i));
		}		
	}
}

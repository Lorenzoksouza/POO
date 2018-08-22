package listaexercicio1;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
			System.out.print("Digite uma palavra: ");
			Scanner tec = new Scanner(System.in);
			String palavra = tec.next();
			
			for (int i = palavra.length() -1; i > -1; i--) {
				System.out.print(palavra.charAt(i));
			}
	}
}

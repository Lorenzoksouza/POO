package exemplos;
import java.util.Scanner;
public class ParOuImpar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = teclado.nextInt();
		int resultado = numero % 2;
		if (resultado == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}	
	}
}


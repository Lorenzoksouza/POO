package exemplos;

import java.util.Random;

public class JogoDado {

	public static void main(String[] args) {

		Random random = new Random(); 
		int[] numeroSorteado = new int[5];
		//Função de preencher o array aleatoriamente
		for (int i = 0; i < numeroSorteado.length; i++) {
			numeroSorteado[i] = random.nextInt(6) + 1;	
		}
		for (int i = 0; i < numeroSorteado.length; i++) {
			System.out.println("Número sorteado: " + numeroSorteado[i]);
		}
	}
}



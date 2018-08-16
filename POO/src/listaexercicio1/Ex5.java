package listaexercicio1;

import java.util.Random;

public class Ex5 {

	public static void main(String[] args) {
		Random random = new Random();
		
		
		int[][] matA = new int[4][4] ;
		for (int l = 0; l < matA.length; l++) {
			for (int c = 0; c < matA.length; c++) {
				matA[l][c] = random.nextInt(100);
			}
		}
		int[][] matB = new int[4][4] ;
		for (int l = 0; l < matB.length; l++) {
			for (int c = 0; c < matB.length; c++) {
				matB[l][c] = random.nextInt(100);
			}
		}
		int[][] matMix = new int[4][4];
		for (int l = 0; l < matMix.length; l++) {
			for (int c = 0; c < matMix.length; c++) {
				matMix[l][c] = matA[l][c] + matB[l][c];
			}
		}
		for (int l = 0; l < matMix.length; l++) {
			for (int c = 0; c < matMix.length; c++) {
				System.out.print(matMix[l][c] + "  ");
			}
		System.out.println();
		}
	}
}

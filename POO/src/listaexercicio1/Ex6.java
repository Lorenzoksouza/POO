package listaexercicio1;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		Random random = new Random();
		
		
		int[][] mat = new int [4][4];
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				mat[l][c] = random.nextInt(100);
			}
		}
		System.out.println("Matriz original"); 	
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				System.out.print(mat[l][c] + "  ");
			}
			System.out.println();
		}
				
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				if (l == c) {
					mat[l][c] = mat[l][c] *2;
				}else {
					mat[l][c] = mat[l][c] *3;
				}
			}
		}
		System.out.println("Matriz com a Diagonal principal multiplicada por 2 e os outros numeros por 3"); 	
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				System.out.print(mat[l][c] + "  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}

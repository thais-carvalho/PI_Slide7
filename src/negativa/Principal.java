package negativa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int matriz1[][] = null, matrizres[][] = null, lin=0, col=0, cinza;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInsira a quantidade de linhas e a quantidade de colunas da matriz");
		lin = scan.nextInt();
		col = scan.nextInt();
		matriz1 = new int[lin][col];
		matrizres = new int[lin][col];
		
		System.out.println("\nInsira quantos níveis de cinza existem na matriz:\n");
		cinza = scan.nextInt();
		
		System.out.println("\nInsira os valores de cinza da matriz\n");
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				matriz1[i][j] = scan.nextInt();
				if(matriz1[i][j] >= cinza)
				{
					System.out.println("\nErro: valor de cinza inválido.\n");
					
				}
					
			}
		}
		System.out.println("\nMatriz 1 preenchida\n");
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
			
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				matrizres[i][j] = cinza - 1 - matriz1[i][j]; 
			}
		}
		System.out.println("\nMatriz Negativada:\n");
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(matrizres[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}

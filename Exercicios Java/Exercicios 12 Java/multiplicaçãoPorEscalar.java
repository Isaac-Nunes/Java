package exercicios11java;

import java.util.Scanner;

public class multiplicaçãoPorEscalar {
    public static void main(String[] args) {
        
                
        int[][] matriz = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 8, 9}
        };
        
        System.out.println("Matriz Original:");
        imprimirMatriz(matriz);

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite um número (escalar) para multiplicar a matriz: ");
        int escalar = teclado.nextInt();

        int[][] matrizResultado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz[i][j] * escalar;
            }
        }

        System.out.println("\nMatriz resultante da multiplicação por " + escalar + ":");
        imprimirMatriz(matrizResultado);
        
        teclado.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }     
    }
   
}

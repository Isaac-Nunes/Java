package exercicios11java;

public class matrizTransposta {
    public static void main(String[] args) {
        
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz Original:");
        imprimirMatriz(matriz);
        
        int[][] matrizOposta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizOposta[i][j] = -matriz[i][j];
            }
        }

        System.out.println("\nMatriz Oposta:");
        imprimirMatriz(matrizOposta);

        int somaSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaSecundaria = somaSecundaria + matriz[i][2 - i];
        }

        System.out.println("\nA soma da diagonal secundária é: " + somaSecundaria);
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
        

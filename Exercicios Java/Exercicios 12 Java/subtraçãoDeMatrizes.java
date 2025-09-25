package exercicios11java;

public class subtraçãoDeMatrizes {
    public static void main(String[] args) {

        int[][] matriz1 = {
            {10, 8, 6},
            {9, 7, 5},
            {4, 2, 1}
        };
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("\nMatriz 2:");
        imprimirMatriz(matriz2);

        int[][] matrizSubtracao = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSubtracao[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        System.out.println("\nMatriz Resultante (Matriz 1 - Matriz 2):");
        imprimirMatriz(matrizSubtracao);
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
    

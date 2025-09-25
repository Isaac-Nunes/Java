package exercicios11java;

public class somaDasDiagonais {
    public static void main(String[] args) {
        
        int[][] matrizOriginal = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Matriz Original:");
        imprimirMatriz(matrizOriginal);

        int[][] novaMatriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                novaMatriz[i][j] = matrizOriginal[i][j];
            }
        }

        System.out.println("\nNova matriz criada (cópia):");
        imprimirMatriz(novaMatriz);
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


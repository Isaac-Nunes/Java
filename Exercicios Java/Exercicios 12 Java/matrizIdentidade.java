package exercicios11java;

public class matrizIdentidade {
    public static void main(String[] args) {
        
        int[][] matrizOriginal = {
            {1, 0, 5},
            {8, 3, 1},
            {9, 2, 4}
        };

        System.out.println("Matriz Original:");
        imprimirMatriz(matrizOriginal);

        boolean eIdentidade = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    if (matrizOriginal[i][j] != 1) {
                        eIdentidade = false;
                    }
                } else {
                    if (matrizOriginal[i][j] != 0) {
                        eIdentidade = false;
                    }
                }
            }
        }

        if (eIdentidade) {
            System.out.println("\nA matriz É uma matriz identidade.");
        } else {
            System.out.println("\nA matriz NÃO é uma matriz identidade.");
        }

        int[][] matrizTransposta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransposta[i][j] = matrizOriginal[j][i];
            }
        }

        System.out.println("\nMatriz Transposta:");
        imprimirMatriz(matrizTransposta);

        int[][] matrizSoma = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSoma[i][j] = matrizOriginal[i][j] + matrizTransposta[i][j];
            }
        }

        System.out.println("\nSoma da Original com a Transposta:");
        imprimirMatriz(matrizSoma);
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
        
        
        
        
        
        
        
        
        
    
 


package exercicios11java;

public class somandoElementos {
    public static void main(String[] args) {
        
        int[][]matriz = {
            
            {1,2,3},
            {4,5,6},
            {7,8,9},
            
        };
        
        int soma = 0;
        int totalElementos = 9; //numero total de elementos na matriz
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("A soma das matriz é: "+soma);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
  
}

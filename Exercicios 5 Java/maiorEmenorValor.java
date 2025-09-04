package exerciciosFor;

import java.util.Scanner;

public class maiorEmenorValor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int maiorN = 0;
        int menorN = 0;
        
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite um numero: ");
            int num = teclado.nextInt();
            if (num > maiorN){
                maiorN = num;
            }else if (num < maiorN){
                menorN = num;
            }
            
        }
        System.out.println("O maior numero foi "+maiorN+" e o menor numero foi "+menorN);
        
        
        
        
        
        
        
    }
 
}

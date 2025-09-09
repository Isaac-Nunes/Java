package exerciciosFor;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhação {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 7; i++) {
            System.out.print("Tente adivinhar o numero: ");
            int num = teclado.nextInt();
            
            Random adivinhar = new Random();
            int num1 = adivinhar.nextInt(100)+1;
            if (num == num1){
                System.out.println("Você acertou!!");
            }else if (num < num1){
                System.out.println("MAIOR!!");
            }else if (num > num1){
                System.out.println("MENOR!!");
            }
        }
        
        
        
        
        
        
        
        
        
    }
}

package exerciciosFor;

import java.util.Scanner;

public class numeroInicial {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);   
        
        System.out.print("Digite um numero inicial: ");
        int num = teclado.nextInt();
        
        System.out.print("Digite um numero final: ");
        int num2 = teclado.nextInt();
        
        System.out.print("Digite um incremento(Ex.:6: ");
        int in = teclado.nextInt();
        
        
        for (int i = num; i <= num2; i+=in) {
            System.out.println(i);    
        }
        
        
        
        
        
            
        
        
        
        
        
        
    }
   
}

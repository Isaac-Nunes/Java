package exerciciosFor;

import java.util.Scanner;

public class tabuadaCompleta {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero para mostrar a tabuada: ");
        int num = teclado.nextInt();
        
        for (int i = 1; i <= 10; i++) {
         System.out.println(num+" x "+i+" = "+(num*i));
        }
        
        
        
    }
}

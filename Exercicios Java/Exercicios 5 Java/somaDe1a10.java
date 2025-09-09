package exerciciosFor;

import java.util.Scanner;

public class somaDe1a10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um valor: ");
            int v = teclado.nextInt();
            soma += v; 
        }
        
        System.out.println("A soma dos valores é "+soma);
        
        
        
        
        
        
        
        
    }

}

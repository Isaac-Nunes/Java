package exerciciosFor;

import java.util.Scanner;

public class mediaIdades {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        double media = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade: ");
            int idade = teclado.nextInt();
            soma += idade;
           // media = soma / 2;
        }
        media = soma / 5;
        System.out.println("A media das idade foi "+media);
        
        
        
        
        
        
        
        
        
        
    }
  
}

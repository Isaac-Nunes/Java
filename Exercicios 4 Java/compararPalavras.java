package exerciciosquatro;

import java.util.Scanner;

public class compararPalavras {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavraUm = teclado.nextLine();
        
        System.out.print("Digite outra palavra: ");
        String palavraDois = teclado.nextLine();
        
        if (palavraUm.equalsIgnoreCase(palavraDois)){
            System.out.println("As palavras são iguais.");
        }else{
            System.out.println("As palavras são diferentes.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
 
}

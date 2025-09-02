package exerciciosquatro;

import java.util.Scanner;

public class substuidorDeTexto {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();
        
        String novaFrase = frase.replace("Java", "Programação");
        
        System.out.println("Sua frase: "+ novaFrase);
        
        
        
        
        
        
        
        
        
        
    }
}

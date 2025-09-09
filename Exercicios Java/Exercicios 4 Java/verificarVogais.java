package exerciciosquatro;

import java.util.Scanner;

public class verificarVogais {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma palavra para verificarmos as vogais: ");
        String palavra = teclado.nextLine();

        boolean contemVogal = false;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
                contemVogal = true;
                break;
            }

        }

        if (contemVogal){
            System.out.println("A palavra tem pelo menos uma vogal.");
        }else{
            System.out.println("A palavra não possui vogais.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}

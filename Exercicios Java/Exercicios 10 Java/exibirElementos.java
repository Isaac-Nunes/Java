package exerciciosjava10;

import java.util.ArrayList;
import java.util.Scanner;

public class exibirElementos {

    public static void main(String[] args) {

            
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> palavra = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            
        System.out.println("Digite: ");
        String letra = teclado.nextLine();
        palavra.add(letra);

        //palavra.add("banana");
        //palavra.add("maça");
        //palavra.add("mamao");
        //palavra.add("laranja");
        }
        
        System.out.println("As palavras são:");
        for (String letras : palavra) {
        System.out.println(letras.toUpperCase()); 
        }
                      

        
        
    }
}

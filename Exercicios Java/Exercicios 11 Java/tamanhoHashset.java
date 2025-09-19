package exerciciosjava11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class tamanhoHashset {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Set<Character> letras = new HashSet<>();

        for (char c = 'a'; c <= 'z'; c++){
            letras.add(c);
        }
        System.out.println("O temanho da lista é: "+letras.size());
        
        
    }
}

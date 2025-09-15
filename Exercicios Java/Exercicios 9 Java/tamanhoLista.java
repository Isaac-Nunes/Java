package exerciciosjava9;

import java.util.ArrayList;
import java.util.Scanner;

public class tamanhoLista {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Character> letras = new ArrayList<>();
        
        letras.add('J');
        letras.add('A');
        letras.add('V');
        letras.add('A');
        
        System.out.println("O tamanho da lista de caracteres é: "+ letras.size());
        
    }
}

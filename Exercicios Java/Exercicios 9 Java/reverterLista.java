package exerciciosjava9;

import java.util.ArrayList;
import java.util.Scanner;

public class reverterLista {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        
        palavras.add("Primeira");
        palavras.add("Segunda");
        palavras.add("Terceira");
        palavras.add("Quarta");
        palavras.add("Quinta");
        palavras.add("Sexta");
        
        System.out.println("Lista original: "+ palavras);
        
        int tamanho = palavras.size();
        for (int i = 0; i < tamanho / 2; i++){
            String temp = palavras.get(i);
            String elementoFinal = palavras.get(tamanho - 1 - i);
            palavras.set(i, elementoFinal);
            palavras.set(tamanho - 1 - i, temp);
            
        }
         System.out.println("Lista revertida: "+ palavras);
        
        
        
    }
}

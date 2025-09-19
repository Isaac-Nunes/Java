package exerciciosjava11;

import java.util.HashSet;
import java.util.Set;

public class nomeAnimais {
    public static void main(String[] args) {
        
        Set<String> animais = new HashSet<>();

        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Leão");
        animais.add("Tigre");
        animais.add("Elefante");

        System.out.println("Elementos do HashSet de animais:");
        for (String animal : animais) {
            System.out.println(animal);
        }
    }
}
        
        
        
        
        
        
        
        
    


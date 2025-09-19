package exerciciosjava11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class adicioneCidades {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 
        
        Set<String> cidades = new HashSet<>();        
        
        
        System.out.println("Digite 5 cidades ");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a " + (i + 1) + " cidade: ");
            String cidade = teclado.nextLine();
            cidades.add(cidade);
        }

        System.out.println("Lista original"+cidades);
        
        System.out.println("Conjunto vazio abaixo.");
        cidades.removeAll(cidades);
        
        System.out.println(cidades);
        
        if (cidades.isEmpty()){
            System.out.println("O conjunto esta vaio.");
        }else{
            System.out.println("Ainda existem cidades dentro do conjunto.");
        }
        
    }
}

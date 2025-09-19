package exerciciosjava11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class listaCores {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Set<String> cores = new HashSet<>();        
        
        System.out.print("Quantas cores você quer digitar: "); 
        int num = teclado.nextInt();
        teclado.nextLine();
        
        for (int i = 0; i < num; i++) {
            System.out.println("Digite a "+(i + 1)+" cor: ");
            String cor = teclado.nextLine();
            cores.add(cor);
        }
        System.out.println("A lista das cores digitadas é: "+cores);
        
        
    }
}

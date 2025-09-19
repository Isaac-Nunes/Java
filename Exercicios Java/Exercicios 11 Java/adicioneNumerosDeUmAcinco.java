package exerciciosjava11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class adicioneNumerosDeUmAcinco {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Set<Integer> num = new HashSet<>();

        System.out.println("Digite 5 numeros ");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + " numero: ");
            int num1 = teclado.nextInt();
            num.add(num1);
        }

        System.out.println("Lista original"+num);
        
        System.out.println("Conjunto vazio abaixo.");
        num.removeAll(num);
        
        System.out.println(num);
        
        if (num.isEmpty()){
            System.out.println("O conjunto esta vaio.");
        }else{
            System.out.println("Ainda tem numeros dentro do conjunto.");
        }
        
        
        
        
        
        
        
        
        
    }
}

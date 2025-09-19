package exerciciosjava11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class numerosInteiros {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Set<Integer> num = new HashSet<>();        
        
        System.out.println("Digite 10 numeros ");
        System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            
        System.out.println("Digite o  "+(i + 1)+" numero: ");
        int num1 = teclado.nextInt();
        
        num.add(num1);
                }
        
        int num2 = 5;
        if (num.contains(num2)){
            System.out.println("O numero 5 esta presente.");
        }else{
            System.out.println("O numero 5 não esta presente.");
        }

        
        
        
        
        
        
    }
}

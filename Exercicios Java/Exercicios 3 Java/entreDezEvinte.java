
package aula2;

import java.util.Scanner;

public class entreDezEvinte {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        double num = teclado.nextDouble();
        
        if ((num > 10) && (num < 20)){
            System.out.println("O numero esta entre dez e vinte.");
    }else if (num == 10){
            System.out.println("O numero é dez.");
    }else if (num == 20){
            System.out.println("O numero é vinte.");
    }else if (num < 10){
            System.out.println("O numero é menor que dez.");
    }else if (num > 20){
            System.out.println("O numero é maior que vinte.");
    }
        
        
        
        
        
        
        
        
        
        
        
    }
}

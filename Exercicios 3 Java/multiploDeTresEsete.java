
package aula2;

import java.util.Scanner;

public class multiploDeTresEsete {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero :) = ");
        double num = teclado.nextDouble();
        
        if (num % 7 == 0){
            System.out.println("O numero é multiplo de sete.");
        }else if (num % 3 ==0){
            System.out.println("O numero é multiplo de três.");
        }else{
            System.out.println("O numero não é multiplo de três nem sete.");
        }
        
        
        
        
        
        
        
        
        
        
        
    }
 
}

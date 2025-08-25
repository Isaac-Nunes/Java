
package com.mycompany.exerciciosjava;

import java.util.Scanner;


public class antecessorESucessor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int num1 = teclado.nextInt();
        
        int antecessor = num1 -1;
        int sucessor = num1 + 1;
        
        System.out.println("O numero digitado e "+ num1);
        System.out.println("O antecessor e "+ antecessor);
        System.out.println("O sucessor e "+ sucessor);
        
        
        
        
        
        
        
    }
    
}


package com.mycompany.exerciciosjava2;

import java.util.Scanner;

public class idadeEmdias {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual a sua idade: ");
        int idade = teclado.nextInt();
        
        int dias = idade * 365;
        
        System.out.println("A sua idade em dias e "+dias);
        
        
        
        
        
    }
 
}


package com.mycompany.exerciciosjava2;

import java.util.Scanner;

public class jurosSimples {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o capital: ");
        double C = teclado.nextDouble();
        
        System.out.print("Qual a taxa em porcentagem ao mes: ");
        double i= teclado.nextDouble();
        
        System.out.print("Qual o tempo: ");
        double tempo = teclado.nextDouble();
        
        double M = C * (1 + i / 100 * tempo);
        
        System.out.println("O montante ficou: "+M);
        
        
        
        
        
        
    }
 
}
